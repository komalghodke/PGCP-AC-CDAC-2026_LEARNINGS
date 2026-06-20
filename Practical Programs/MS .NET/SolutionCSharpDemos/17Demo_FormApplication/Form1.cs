namespace _17Demo_FormApplication
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Button btn = new Button();
            btn.Text = "Cleck Me....";
            btn.Click += new EventHandler(btn_Click);
            this.Controls.Add(btn);
        }

        private void btn_Click(object sender, EventArgs e)
        {
            MessageBox.Show("You clicked on a button..");
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }
    }
}
