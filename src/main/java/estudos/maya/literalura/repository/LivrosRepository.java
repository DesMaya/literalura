package estudos.maya.literalura.repository;

import estudos.maya.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByIdioma(String idioma);

    Integer countByIdioma(String idioma);

    List<Livro> findTop10ByOrderByDownloadsDesc();

}
