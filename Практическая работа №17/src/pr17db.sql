PGDMP     9    /        
        y            pr17db    13.2    13.2 
    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16461    pr17db    DATABASE     c   CREATE DATABASE pr17db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE pr17db;
                postgres    false            �            1259    16477    posts    TABLE     m   CREATE TABLE public.posts (
    id uuid NOT NULL,
    text text NOT NULL,
    creation_date date NOT NULL
);
    DROP TABLE public.posts;
       public         heap    postgres    false            �            1259    16469    users    TABLE     �   CREATE TABLE public.users (
    id uuid NOT NULL,
    last_name text NOT NULL,
    first_name text NOT NULL,
    middle_name text NOT NULL,
    birth_date text NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �          0    16477    posts 
   TABLE DATA           8   COPY public.posts (id, text, creation_date) FROM stdin;
    public          postgres    false    201   M	       �          0    16469    users 
   TABLE DATA           S   COPY public.users (id, last_name, first_name, middle_name, birth_date) FROM stdin;
    public          postgres    false    200   j	       )           2606    16484    posts posts_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.posts
    ADD CONSTRAINT posts_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.posts DROP CONSTRAINT posts_pkey;
       public            postgres    false    201            '           2606    16476    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    200            �      x������ � �      �   �   x�5̱�0E�9�Gv�4fddaaeqR*P+u��|��wy����M@!�J#	C�j�9"'w��S���e��ݩ��.����\�R�1��s�fj�	b�e��(�k����_��ٮ\���B�*�     