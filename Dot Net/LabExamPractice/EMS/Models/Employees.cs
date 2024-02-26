using Microsoft.Data.SqlClient;
using static System.Net.Mime.MediaTypeNames;
using static System.Runtime.InteropServices.JavaScript.JSType;
using System;

namespace EMS.Models
{
    public class Employees
    {
        public int Id { get; set; }
        public string Name { get; set; }    
        public string City { get; set; }
        public string Address { get; set; }

        internal static void AddEmployee()
        {
            using(SqlConnection sqlConn = new SqlConnection())
            {
                sqlConn.ConnectionString =
                @"Data Source = (localdb)/MSSQLLocalDB; Initial Catalog = LabExamDB; Integrated Security = True";
                try
                {
                    sqlConn.Open();
                    
                }
                catch (Exception ex)
                {

                }
            }
        }
        internal static void DeleteEmployee(int id)
        {
        }

        internal static Employees ShowEmployee(int id)
        {
        }

        internal static void UpdateEmployee(int id, Employees emp)
        {
        }
    }
}
