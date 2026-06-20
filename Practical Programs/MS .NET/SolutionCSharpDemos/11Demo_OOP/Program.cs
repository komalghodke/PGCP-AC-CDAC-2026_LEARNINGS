namespace _11Demo_OOP
{
    // Dependency Injection Pattern : Interface/ Absract
    // Contructor Level Dependency Injection Pattern
    // Open/Closed Principle: Open for extension, but closed for modification
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Language based dependency 
            //Notepad notepad = new Notepad(null);
            //Notepad notepad = new Notepad("fr");
            //Notepad notepad = new Notepad("sp");
            //Notepad notepad = new Notepad("en");

            //notepad.Cut();
            //notepad.Copy();
            //notepad.Paste();
            //notepad.SpellCheck(); 
            #endregion

            SpellCheckerFactory factory = new SpellCheckerFactory();
            ISpellChecker somechecker = factory.GetSomeSpellChekcer("fr");

            Notepad frnotepad = new Notepad(somechecker);
            frnotepad.SpellCheck();

            Notepad ennotepad = new Notepad(null);
            ennotepad.SpellCheck();

            KlingonSpellChecker klingonSpellChecker = new KlingonSpellChecker();
            Notepad knotepad = new Notepad(klingonSpellChecker);
            knotepad.SpellCheck();

            HindiSpellChecker hind = new HindiSpellChecker();
            Notepad hnotepad = new Notepad(hind);
            hnotepad.SpellCheck();
        }
    }
    public class Notepad
    {
        ISpellChecker _checker = null;

        public Notepad(ISpellChecker checker)
        {
            if (checker == null)
            {
                _checker = new EnglishSpellChecker();
            }
            else
            {
                _checker = checker;
            }
        }

        #region ctor with lang dependency
        //public Notepad(string lang)
        //{
        //    if (lang == null)
        //    {
        //        _checker = new EnglishSpellChecker();
        //    }
        //    else 
        //    {
        //        _checker = factory.GetSomeSpellChekcer(lang);
        //    }
        //} 
        #endregion
        public void Cut()
        {
            Console.WriteLine("Cut");
        }
        public void Copy()
        {
            Console.WriteLine("Copy");
        }
        public void Paste()
        {
            Console.WriteLine("Paste");
        }
        public void SpellCheck()
        {

            _checker.DoSpellCheck();
        }
    }
    public interface ISpellChecker
    {
        void DoSpellCheck();
    }

    public class SpellCheckerFactory
    {
        public ISpellChecker GetSomeSpellChekcer(string lang)
        {
            ISpellChecker _somechecker = null;
            switch (lang)
            {
                case "en":
                    _somechecker = new EnglishSpellChecker();
                    break;
                case "fr":
                    _somechecker = new FrenchSpellChecker();
                    break;
                case "sp":
                    _somechecker = new SpanishSpellChecker();
                    break;
                default:
                    _somechecker = new EnglishSpellChecker();
                    break;
            }

            return _somechecker;
        }
    }

    public class EnglishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            //  huge code .. min project
            Console.WriteLine("Spell Check done for English!");
        }
    }

    public class SpanishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            //  huge code .. min project
            Console.WriteLine("Spell Check done for Spanish!");
        }
    }
    public class FrenchSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            //  huge code .. min project
            Console.WriteLine("Spell Check done for French!");
        }
    }
    public class KlingonSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            //  huge code .. min project
            Console.WriteLine("Spell Check done for Klingon!");
        }
    }

    public class HindiSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            //  huge code .. min project
            Console.WriteLine("Spell Check done for Hindi!");
        }
    }
}
