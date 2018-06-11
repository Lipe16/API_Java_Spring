package ferreira.filipe.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import ferreira.filipe.entity.Perfil;
import ferreira.filipe.entity.Usuario;


public class MyUserDetails  implements UserDetails{
	
	private Usuario usuario;
	
    public MyUserDetails(Usuario usuario) {
        this.usuario = usuario;
    }



    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (Perfil perfil : usuario.getPerfis()) {
            authorities.add(new SimpleGrantedAuthority(perfil.getNome()));
        }
        return authorities;
    }
    
    

    @Override
    public String getPassword() {
        return usuario.getSenha();
    }
    
    
    @Override
    public String getUsername() {
        return usuario.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    


}
