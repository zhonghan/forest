---
layout: post
title: "Thinny 2: a Jekyll theme"
quote: The Infinite's Nymphet has a new look, a new codename, and a new platform!
image: false
video: false
---

Oracle8i引入了SYS_GUID这个概念，它同Oracle管理员所使用的传统的序列（sequence）相比具有诸多优势。一个序列生成器只是简单地创建从给定的起点开始的一系列整数值，而且它被用在选择陈述式的时候自动地递增该系列。

序列生成器所生成的数字只能保证在单个实例里是唯一的，这就不适合将它用作并行或者远程环境里的主关键字，因为各自环境里的序列可能会生成相同的数字，从而导致冲突的发生。SYS_GUID会保证它创建的标识符在每个数据库里都是唯一的。

SYS_GUID所生成的值是一个16位的原始值。序列所生成的整数不会使用16位（的值）

通过ibatis 执行

**select sys_guid() as uuid from dual** 

返回map时，会得到一个key为uuid, value是长度为16的数组。

如果想要返回一个value为字符串，可以使用concat函数；即：

**select concat(sys_guid(),'') as uuid from dual**