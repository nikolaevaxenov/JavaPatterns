PGDMP     '    0        
        y            pr15db    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16429    pr15db    DATABASE     c   CREATE DATABASE pr15db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Russian_Russia.1251';
    DROP DATABASE pr15db;
                postgres    false            �            1259    16442    posts    TABLE     �   CREATE TABLE public.posts (
    id uuid NOT NULL,
    text text NOT NULL,
    creation_date date NOT NULL,
    owner uuid NOT NULL
);
    DROP TABLE public.posts;
       public         heap    postgres    false            �            1259    16436    users    TABLE     �   CREATE TABLE public.users (
    id uuid NOT NULL,
    last_name text NOT NULL,
    first_name text NOT NULL,
    middle_name text NOT NULL,
    birth_date text NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �          0    16442    posts 
   TABLE DATA           ?   COPY public.posts (id, text, creation_date, owner) FROM stdin;
    public          postgres    false    201   /       �          0    16436    users 
   TABLE DATA           S   COPY public.users (id, last_name, first_name, middle_name, birth_date) FROM stdin;
    public          postgres    false    200   �       �   [   x���!��pϣ���+�	2��f���]�cS�]Ƭ�4!�ZzG��v���^MH4@־\R��ƞ9Q�Y����������*      �   �   x�5̻�0��9yGv�Y���č��:D<~K�?��|#��	؉O��f� ɱd
�ܤ�����t�|dY������l�>�OE�`4�tm�R�8q�#[��1�����3��UК�S���ZW*�     