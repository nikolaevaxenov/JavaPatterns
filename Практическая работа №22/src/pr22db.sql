PGDMP     7                    y            pr22db    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16466    pr22db    DATABASE     c   CREATE DATABASE pr22db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE pr22db;
                postgres    false                        3079    17039 	   uuid-ossp 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA public;
    DROP EXTENSION "uuid-ossp";
                   false            �           0    0    EXTENSION "uuid-ossp"    COMMENT     W   COMMENT ON EXTENSION "uuid-ossp" IS 'generate universally unique identifiers (UUIDs)';
                        false    2            �            1259    17469    posts    TABLE     �   CREATE TABLE public.posts (
    id uuid NOT NULL,
    creation_date timestamp without time zone,
    text character varying(255),
    user_id uuid
);
    DROP TABLE public.posts;
       public         heap    postgres    false            �            1259    17474    users    TABLE     �   CREATE TABLE public.users (
    id uuid NOT NULL,
    birth_date character varying(255),
    first_name character varying(255),
    last_name character varying(255),
    middle_name character varying(255)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �          0    17469    posts 
   TABLE DATA           A   COPY public.posts (id, creation_date, text, user_id) FROM stdin;
    public          postgres    false    201   �       �          0    17474    users 
   TABLE DATA           S   COPY public.users (id, birth_date, first_name, last_name, middle_name) FROM stdin;
    public          postgres    false    202   W       1           2606    17473    posts posts_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.posts
    ADD CONSTRAINT posts_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.posts DROP CONSTRAINT posts_pkey;
       public            postgres    false    201            3           2606    17481    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    202            4           2606    17482 !   posts fk5lidm6cqbc7u4xhqpxm898qme    FK CONSTRAINT     �   ALTER TABLE ONLY public.posts
    ADD CONSTRAINT fk5lidm6cqbc7u4xhqpxm898qme FOREIGN KEY (user_id) REFERENCES public.users(id);
 K   ALTER TABLE ONLY public.posts DROP CONSTRAINT fk5lidm6cqbc7u4xhqpxm898qme;
       public          postgres    false    2867    202    201            �   p   x�}̫�0 PlO�p��l�2AQhI�9v��H�4*+)~��|�qv0��z������G�=02���UhM4�2Y
�>�5�}��O�R����()��,�����;�s��Q>$7      �   ~   x�U̱�0E�9�G�	N;v�ҕ%�E�@���Ą�t�v�5R�Y' 2��*0ϥJ�Ȗ�%0"�[ͫ�/�퓭��g�V�þO������	���%u�{��Rhkޞ��+c���3+j     