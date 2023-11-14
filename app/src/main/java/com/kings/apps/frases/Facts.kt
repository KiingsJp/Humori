package com.kings.apps.frases

class Facts {
    val fact001 = "A Grande Muralha da China é visível do espaço, mas não é contínua; consiste em várias seções construídas em épocas diferentes."
    val fact002 = "Cleópatra, a última rainha do Egito, viveu mais perto da criação do iPhone do que da construção das Grandes Pirâmides."
    val fact003 = "Durante a Guerra Fria, os Estados Unidos tentaram criar um 'gato espião' chamado Acústico, mas o projeto não teve sucesso."
    val fact004 = "A Revolução Francesa introduziu o calendário revolucionário, que tinha 10 dias em uma semana."
    val fact005 = "O antigo Império Romano tinha banheiros públicos conhecidos como latrinas, onde as pessoas faziam suas necessidades juntas em bancos de pedra."
    val fact006 = "Os vikings usavam 'pedras solares' para navegar, que eram cristais de calcita que polarizavam a luz solar."
    val fact007 = "Em 1347, a Peste Negra dizimou um terço da população da Europa."
    val fact008 = "O número zero, como o conhecemos hoje, foi desenvolvido na Índia no século VII."
    val fact009 = "Alexandre, o Grande, era um aluno do filósofo grego Aristóteles."
    val fact010 = "A Revolução Industrial transformou a produção de roupas, tornando as máquinas de costura uma parte essencial da indústria têxtil."

    val fact011 = "Um raio é cinco vezes mais quente do que a superfície do sol."
    val fact012 = "O planeta anão Plutão tem uma órbita tão excêntrica que, em alguns momentos, fica mais próximo do Sol do que Netuno."
    val fact013 = "Os seres humanos compartilham cerca de 50% de seu DNA com bananas."
    val fact014 = "A lua Europa de Júpiter tem um oceano sob sua superfície de gelo que pode abrigar formas de vida."
    val fact015 = "A luz do Sol leva aproximadamente 8 minutos e 20 segundos para chegar à Terra."
    val fact016 = "A teoria do Big Bang sugere que o universo tem cerca de 13,8 bilhões de anos."
    val fact017 = "O osso humano mais forte é o fêmur."
    val fact018 = "A água é o único composto que é encontrado naturalmente em todos os três estados da matéria na Terra (sólido, líquido e gasoso)."
    val fact019 = "As zebras têm listras para afastar insetos, como mosquitos."
    val fact020 = "Existem mais átomos em um copo de água do que há copos de água nos oceanos da Terra."

    val fact021 = "Os polvos têm três corações: dois para bombear sangue para as brânquias e um para o resto do corpo."
    val fact022 = "O nariz de um cachorro é tão único quanto a impressão digital de um humano."
    val fact023 = "Os golfinhos são capazes de reconhecer seu próprio reflexo em um espelho, o que sugere uma forma de autoconsciência."
    val fact024 = "Os flamingos-rosa nascem com penas cinzas e só desenvolvem sua coloração característica devido à sua dieta rica em betacarotenos."
    val fact025 = "As formigas podem transportar objetos que são até 50 vezes o seu próprio peso corporal."
    val fact026 = "O elefante é o maior animal terrestre e pode pesar até 5 toneladas."
    val fact027 = "O camaleão é capaz de mover seus olhos de forma independente e tem uma língua pegajosa para capturar insetos."
    val fact028 = "O beija-flor é a única ave capaz de voar para trás."
    val fact029 = "Os lemingues não cometem suicídio em massa, como é frequentemente retratado, mas podem ocasionalmente migrar em grandes grupos."
    val fact030 = "O lobo uiva para se comunicar com outros membros da matilha e para estabelecer território."

    val fact031 = "Os controladores de tráfego aéreo são responsáveis por orientar com segurança aeronaves no espaço aéreo."
    val fact032 = "Os cinegrafistas de documentários de vida selvagem muitas vezes passam meses esperando por um único momento perfeito."
    val fact033 = "Os arqueólogos estudam vestígios do passado, como artefatos, ossos e estruturas antigas."
    val fact034 = "Os paleontólogos são cientistas que estudam fósseis para entender a história da vida na Terra."
    val fact035 = "Os oceanógrafos exploram os oceanos para estudar sua biologia, geologia e química."
    val fact036 = "Os bombeiros combatem incêndios e prestam ajuda em situações de emergência."
    val fact037 = "Os pilotos de avião passam por extenso treinamento e testes antes de poderem voar comercialmente."
    val fact038 = "Os psicólogos clínicos trabalham com pacientes para tratar problemas de saúde mental."
    val fact039 = "Os engenheiros de software desenvolvem aplicativos e sistemas de computador."
    val fact040 = "Os arquitetos projetam edifícios e espaços públicos, considerando aspectos estéticos e funcionais."

    fun getFacts(): Array<Array<String>> {

        val arrayAnimais = arrayOf( fact021,
            fact022,
            fact023,
            fact024,
            fact025,
            fact026,
            fact027,
            fact028,
            fact029,
            fact030,)

        val arrayCiencia = arrayOf(
            fact011,
            fact012,
            fact013,
            fact014,
            fact015,
            fact016,
            fact017,
            fact018,
            fact019,
            fact020,
        )

        val arrayHistoria = arrayOf(
            fact001,
            fact002,
            fact003,
            fact004,
            fact005,
            fact006,
            fact007,
            fact008,
            fact009,
            fact010,
        )

        val arrayProfissao = arrayOf(
            fact031,
            fact032,
            fact033,
            fact034,
            fact035,
            fact036,
            fact037,
            fact038,
            fact039,
            fact040
        )

        return arrayOf( arrayAnimais,arrayCiencia, arrayHistoria, arrayProfissao )
    }
}