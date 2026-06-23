using System;
using System.Windows.Forms;

namespace EmpMgnt_WindowsForms
{
    public partial class EmpMgntForm : Form
    {
        private EmployeeManager manager = new EmployeeManager();

        public EmpMgntForm()
        {
            InitializeComponent(); // defined in Designer.cs
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string name = txtName.Text.Trim();
            string email = txtEmail.Text.Trim();
            string designation = cmbDesignation.SelectedItem?.ToString();

            if (string.IsNullOrEmpty(name) || string.IsNullOrEmpty(email) || string.IsNullOrEmpty(designation))
            {
                MessageBox.Show("Please fill all fields before saving.");
                return;
            }

            Employee emp = new Employee(name, email, designation);
            manager.AddEmployee(emp);

            MessageBox.Show("Employee saved successfully!");
            txtName.Clear();
            txtEmail.Clear();
            cmbDesignation.SelectedIndex = -1;
        }

        private void btnDisplay_Click(object sender, EventArgs e)
        {
            lstEmployees.Items.Clear();
            foreach (var emp in manager.GetEmployees())
            {
                lstEmployees.Items.Add(emp.ToString());
            }
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            manager.ClearEmployees();
            lstEmployees.Items.Clear();
            MessageBox.Show("All employees cleared!");
        }

        private void txtName_TextChanged(object sender, EventArgs e)
        {
            // Optional: validation logic
        }
    }
}
