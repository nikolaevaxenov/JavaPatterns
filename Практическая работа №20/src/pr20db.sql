PGDMP         1        
        y            pr20db    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16464    pr20db    DATABASE     c   CREATE DATABASE pr20db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE pr20db;
                postgres    false            �            1259    16626    posts    TABLE     �   CREATE TABLE public.posts (
    id uuid NOT NULL,
    creation_date timestamp without time zone,
    text character varying(255),
    user_id uuid
);
    DROP TABLE public.posts;
       public         heap    postgres    false            �            1259    16631    users    TABLE     �   CREATE TABLE public.users (
    id uuid NOT NULL,
    birth_date character varying(255),
    first_name character varying(255),
    last_name character varying(255),
    middle_name character varying(255)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �          0    16626    posts 
   TABLE DATA           A   COPY public.posts (id, creation_date, text, user_id) FROM stdin;
    public          postgres    false    200   *       �          0    16631    users 
   TABLE DATA           S   COPY public.users (id, birth_date, first_name, last_name, middle_name) FROM stdin;
    public          postgres    false    201   G       &           2606    16630    posts posts_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.posts
    ADD CONSTRAINT posts_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.posts DROP CONSTRAINT posts_pkey;
       public            postgres    false    200            (           2606    16638    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    201            )           2606    16639 !   posts fk5lidm6cqbc7u4xhqpxm898qme    FK CONSTRAINT     �   ALTER TABLE ONLY public.posts
    ADD CONSTRAINT fk5lidm6cqbc7u4xhqpxm898qme FOREIGN KEY (user_id) REFERENCES public.users(id);
 K   ALTER TABLE ONLY public.posts DROP CONSTRAINT fk5lidm6cqbc7u4xhqpxm898qme;
       public          postgres    false    201    2856    200            �      x������ � �      �   �   x�E̽�0�9yGN��xddaaeɏ��:D<>��Nw�I�HN~�
11A�L U=0a��
�Z�'����\z^�uym��]�nn�?T�R��g�	Or�
1h iA:�q�d0���w�`~s(wg���)�     