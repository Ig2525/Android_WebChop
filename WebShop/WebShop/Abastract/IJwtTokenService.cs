using WebShop.Data.Entites.Identity;

public interface IJwtTokenService
{
    Task<string> CreateToken(UserEntity user);
}
