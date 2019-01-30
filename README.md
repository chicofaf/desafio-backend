Para executar esse projeto basta importá-lo no Eclipae, depois adicionar o servidor apache toomcat e executar o projeto através do toomcat. Feito esses passos o projeto deve rodar sem problemas. 
Por fim é necessário criar uma tabela no banco de dados Postgres 

O seguinte script pode ser utilizado:

CREATE TABLE public.proposta
(
  id integer NOT NULL DEFAULT nextval('proposta_id_seq'::regclass),
  nome character varying,
  sexo character varying,
  estado_civil character varying,
  estado character varying,
  idade integer,
  dependentes integer,
  renda integer,
  resultado_analise character varying,
  limite character varying,
  cpf character varying,
  CONSTRAINT proposta_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.proposta
  OWNER TO postgres;

