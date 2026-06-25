using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _45Demo_EntityFramework.Models
{
    [Table("Emp")]
    public class Emp//POCO
    {
        [Key]// Primary Key + Identity(1,1)-means Auto Increament
        [Column("Id",TypeName ="int")]
        public int Id { get; set; }

        [Column("Name", TypeName = "varchar(50)")]
        //[StringLength(50)]
        public string Name { get; set; }

        [Column("Address", TypeName = "varchar(50)")]
        public string Address { get; set; }
    }
}
