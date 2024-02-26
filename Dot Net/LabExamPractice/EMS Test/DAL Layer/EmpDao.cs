using ModelBinding.Models;

namespace EMS_Test.DAL_Layer
{
    public interface EmpDao
    {
        //public abstract void Insert(Employee obj);
        public abstract List<Employee> GetAllEmployees();
    }
}
