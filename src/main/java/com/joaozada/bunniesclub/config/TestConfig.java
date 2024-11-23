package com.joaozada.bunniesclub.config;

import com.joaozada.bunniesclub.entities.Membro;
import com.joaozada.bunniesclub.repositories.MembroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private MembroRepo membroRepo;

    @Override
    public void run (String... args) throws Exception {
        Membro haerin = new Membro(null, "Haerin", LocalDate.of(2006, 05, 15), "Vocalista, Main dancer", "Coreana",
                "Haerin começou sua carreira como estagiária antes de debutar com o grupo NewJeans em 2022. Em 2023, foi escolhida como embaixadora global de joias e da Beauty House da Dior." +
                "Conhecida por seu estilo único, ela tem uma personalidade encantadora e é fluente em coreano, com habilidades em inglês e japonês." +
                "Fãs a admiram por sua aparência delicada e peculiaridades adoráveis, como copiar os movimentos das colegas de grupo e sua famosa pose 'Coração de Diamante'",
                "https://static.wikia.nocookie.net/newjeans/images/2/2f/Haerinffg.jpg/revision/latest/scale-to-width-down/1000?cb=20241119014951&path-prefix=pt-br");

        Membro minji = new Membro(null, "Minji", LocalDate.of(2004,05,07), "Vocalista, Líder", "Coreana", "Minji começou sua carreira como estagiária antes de debutar com o grupo NewJeans em 2022." +
                "Conhecida por sua voz grave e estilo único, ela é fluente em coreano, inglês e japonês." +
                "Fãs a admiram por sua personalidade carinhosa e habilidades de liderança dentro do grupo, além de seu amor por roupas pretas e mistérios.",
                "https://static.wikia.nocookie.net/newjeans/images/0/0d/Minji_Supernatural_Concept_Photo_ffefe_1_11zon.png/revision/latest?cb=20240919015652&path-prefix=pt-br");

        Membro hanni = new Membro(null, "Hanni", LocalDate.of(2004,10,06), "Vocalista", "Vietnamita-Australiana",
                "Hanni, integrante do NewJeans, é a primeira ídolo australiano-vietnamita a estrear sob a HYBE. Ela é fluente em inglês e coreano, mas tem dificuldades com o vietnamita." +
                "Hanni toca ukulele, guitarra e piano, e é faixa preta de taekwondo. Fãs a admiram por sua competitividade, amor pelos animais e sua habilidade musical. Se não fosse ídolo, teria seguido carreira em ciência, medicina ou filmografia.",
                "https://static.wikia.nocookie.net/newjeans/images/7/7d/Hanni_Supernatural_Concept_Photo_bgbg_5_11zon.png/revision/latest?cb=20240919020644&path-prefix=pt-br");

        Membro danielle = new Membro(null, "Danielle", LocalDate.of(2005, 04, 11), "Vocalista, dancer","Coreana-Australiana", "Danielle, integrante do NewJeans, é uma cantora e letrista coreana-australiana. Ela começou sua carreira como modelo infantil e personalidade de TV na Coreia do Sul, antes de se mudar para a Austrália." +
                "Danielle treinou canto e dança na Def Dance Academy e se juntou à Source Music, mais tarde transferindo-se para a ADOR." +
                "Ela estreou com o NewJeans em 2022 e, em 2023, fez sua estreia como dubladora, interpretando Ariel na versão coreana de \"A Pequena Sereia\". Fãs a admiram por sua personalidade encantadora e talento multifacetado.",
                "https://static.wikia.nocookie.net/newjeans/images/2/20/Danielle_Supernatural_Concept_Photo_lindinha_6_11zon.png/revision/latest?cb=20240919135452&path-prefix=pt-br" );

        Membro hyein = new Membro(null, "Hyein", LocalDate.of(2008,04,21), "Vocalista, maknae", "Coreana", "Hyein, a integrante mais jovem do NewJeans, começou sua carreira como modelo infantil aos oito anos e foi membro do grupo U.SSO Girl. Ela se juntou à ADOR em 2021 e estreou com o NewJeans em 2022." +
                "Apesar de ser a mais nova do grupo, Hyein é considerada a 'membro mais experiente'. Em 2024, teve uma pausa temporária nas atividades devido a uma fratura no pé, com retorno previsto para maio. Fãs admiram sua versatilidade como artista e sua presença marcante no palco.",
                "https://static.wikia.nocookie.net/newjeans/images/8/8d/Hyein_Supernatural_Concept_Photo_%2810%29_11zon.png/revision/latest?cb=20240917144444&path-prefix=pt-br");

        membroRepo.saveAll(Arrays.asList(haerin,minji, hanni, danielle, hyein));
    }
}
