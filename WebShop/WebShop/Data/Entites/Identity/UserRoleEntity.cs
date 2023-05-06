using Microsoft.AspNetCore.Identity;
using WebShop.Data.Entites.Identity;

public class UserRoleEntity : IdentityUserRole<int>
{
    public virtual UserEntity User { get; set; }
    public virtual RoleEntity Role { get; set; }
}