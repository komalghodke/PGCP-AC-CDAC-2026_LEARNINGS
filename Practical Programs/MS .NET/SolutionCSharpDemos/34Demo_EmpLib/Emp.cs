using _33Demo_MyLib;
using System.Text.Json.Serialization;
using _36Demo_MyCustomAttribute;

namespace _34Demo_EmpLib
{
    [CompanyInfo(CompanyName ="BonaventureSystems",DeveloperName ="Mugdha")]

    // ORM : Model/ Buissness Entity/ Plain Old CLR Object [POCO]
    [Table(TableName = "Emp")]
    public class Employee // POCO Class
    {
        #region Demo 01
        //[Obsolete]
        //public void Data()
        //{ }

        //public void EmpData()
        //{ } 
        #endregion

        private int _EId;
        private string _EName;
        private string _EAddress;      

        [Column(ColumnName ="Address", ColumnType ="varchar(50)")]
        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }

        [Column(ColumnName = "Name", ColumnType = "varchar(50)")]
        public string EName
        {
            get { return _EName; }
            set { _EName = value; }
        }

        [Column(ColumnName = "Id", ColumnType = "int")]
        public int EId
        {
            get { return _EId; }
            set { _EId = value; }
        }
    }
}
