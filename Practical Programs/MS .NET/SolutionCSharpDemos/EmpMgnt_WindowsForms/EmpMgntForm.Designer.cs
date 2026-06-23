namespace EmpMgnt_WindowsForms
{
    partial class EmpMgntForm
    {
        private System.ComponentModel.IContainer components = null;

        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null)) components.Dispose();
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        private void InitializeComponent()
        {
            lblName = new Label();
            lblEmail = new Label();
            lblTitle = new Label();
            lblDesignation = new Label();
            txtName = new TextBox();
            txtEmail = new TextBox();
            cmbDesignation = new ComboBox();
            btnSave = new Button();
            btnDisplay = new Button();
            btnClear = new Button();
            lstEmployees = new ListBox();
            SuspendLayout();
            // 
            // lblName
            // 
            lblName.AutoSize = true;
            lblName.Location = new Point(50, 72);
            lblName.Name = "lblName";
            lblName.Size = new Size(68, 25);
            lblName.TabIndex = 10;
            lblName.Text = "Name :";
            // 
            // lblEmail
            // 
            lblEmail.AutoSize = true;
            lblEmail.Location = new Point(50, 122);
            lblEmail.Name = "lblEmail";
            lblEmail.Size = new Size(84, 25);
            lblEmail.TabIndex = 9;
            lblEmail.Text = "Email Id :";
            // 
            // lblTitle
            // 
            lblTitle.AutoSize = true;
            lblTitle.BackColor = SystemColors.GradientActiveCaption;
            lblTitle.Font = new Font("Segoe UI", 12F, FontStyle.Bold);
            lblTitle.Location = new Point(257, 21);
            lblTitle.Name = "lblTitle";
            lblTitle.Size = new Size(415, 32);
            lblTitle.TabIndex = 8;
            lblTitle.Text = "EMPLOYEE MANAGEMENT SYSTEM";
            // 
            // lblDesignation
            // 
            lblDesignation.AutoSize = true;
            lblDesignation.Location = new Point(50, 172);
            lblDesignation.Name = "lblDesignation";
            lblDesignation.Size = new Size(116, 25);
            lblDesignation.TabIndex = 7;
            lblDesignation.Text = "Designation :";
            // 
            // txtName
            // 
            txtName.Location = new Point(200, 72);
            txtName.Name = "txtName";
            txtName.Size = new Size(250, 31);
            txtName.TabIndex = 6;
            txtName.TextChanged += txtName_TextChanged;
            // 
            // txtEmail
            // 
            txtEmail.Location = new Point(200, 122);
            txtEmail.Name = "txtEmail";
            txtEmail.Size = new Size(250, 31);
            txtEmail.TabIndex = 5;
            // 
            // cmbDesignation
            // 
            cmbDesignation.FormattingEnabled = true;
            cmbDesignation.Items.AddRange(new object[] { "Developer", "QA Tester", "Senior Software Engineer", "Architect" });
            cmbDesignation.Location = new Point(200, 172);
            cmbDesignation.Name = "cmbDesignation";
            cmbDesignation.Size = new Size(250, 33);
            cmbDesignation.TabIndex = 4;
            // 
            // btnSave
            // 
            btnSave.Location = new Point(50, 224);
            btnSave.Name = "btnSave";
            btnSave.Size = new Size(100, 34);
            btnSave.TabIndex = 3;
            btnSave.Text = "Save";
            btnSave.UseVisualStyleBackColor = true;
            btnSave.Click += btnSave_Click;
            // 
            // btnDisplay
            // 
            btnDisplay.Location = new Point(160, 224);
            btnDisplay.Name = "btnDisplay";
            btnDisplay.Size = new Size(100, 34);
            btnDisplay.TabIndex = 2;
            btnDisplay.Text = "Display";
            btnDisplay.UseVisualStyleBackColor = true;
            btnDisplay.Click += btnDisplay_Click;
            // 
            // btnClear
            // 
            btnClear.Location = new Point(270, 224);
            btnClear.Name = "btnClear";
            btnClear.Size = new Size(100, 34);
            btnClear.TabIndex = 1;
            btnClear.Text = "Clear";
            btnClear.UseVisualStyleBackColor = true;
            btnClear.Click += btnClear_Click;
            // 
            // lstEmployees
            // 
            lstEmployees.FormattingEnabled = true;
            lstEmployees.ItemHeight = 25;
            lstEmployees.Location = new Point(50, 279);
            lstEmployees.Name = "lstEmployees";
            lstEmployees.Size = new Size(400, 129);
            lstEmployees.TabIndex = 0;
            // 
            // EmpMgntForm
            // 
            AutoScaleDimensions = new SizeF(10F, 25F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(964, 450);
            Controls.Add(lstEmployees);
            Controls.Add(btnClear);
            Controls.Add(btnDisplay);
            Controls.Add(btnSave);
            Controls.Add(cmbDesignation);
            Controls.Add(txtEmail);
            Controls.Add(txtName);
            Controls.Add(lblDesignation);
            Controls.Add(lblTitle);
            Controls.Add(lblEmail);
            Controls.Add(lblName);
            Name = "EmpMgntForm";
            Text = "Employee Management Form";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label lblName;
        private Label lblEmail;
        private Label lblTitle;
        private Label lblDesignation;
        private TextBox txtName;
        private TextBox txtEmail;
        private ComboBox cmbDesignation;
        private Button btnSave;
        private Button btnDisplay;
        private Button btnClear;
        private ListBox lstEmployees;
    }
}