INSERT INTO Role(id, name)
VALUES (0x0318236D2B59414089BF7A5E73C67C8A, 'ADMIN'),
       (0x2990C18FAD680E43B784034D1A73943D, 'CLIENTE'),
       (0x52D06BA0F7E71A40BE2B63FD139D11DC, 'PLAYER'),
       (0x6AE6FFD34E7ACC448A5E6FE629047B6D, 'USER');

INSERT INTO Usuario(id, email, nome, senha, username,role_id)
VALUES (0xA09585A27DDB44458E87A986F5EEAC10, 'teste@teste.com', 'juliano', '$123456',
        'julianoosmir',0x0318236D2B59414089BF7A5E73C67C8A);