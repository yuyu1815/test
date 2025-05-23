package ai.grazie.tasks.provider.prompt.velocity.resources.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\034\020\005\032\0020\0022\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\tH\026¨\006\n"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContentDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "()V", "deserialize", "p", "Lcom/fasterxml/jackson/core/JsonParser;", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "tasks-provider-llm-prompt-velocity-model"})
@SourceDebugExtension({"SMAP\nVelocityModelChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContentDeserializer\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n32#2,2:156\n1#3:158\n1557#4:159\n1628#4,3:160\n827#4:163\n855#4,2:164\n808#4,11:166\n*S KotlinDebug\n*F\n+ 1 VelocityModelChat.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContentDeserializer\n*L\n95#1:156,2\n108#1:159\n108#1:160,3\n109#1:163\n109#1:164,2\n113#1:166,11\n*E\n"})
public final class VelocityModelMessageContentDeserializer extends JsonDeserializer<VelocityModelMessageContent> {
  @NotNull
  public static final VelocityModelMessageContentDeserializer INSTANCE = new VelocityModelMessageContentDeserializer();
  
  @NotNull
  public VelocityModelMessageContent deserialize(@Nullable JsonParser p, @Nullable DeserializationContext ctxt) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: ifnonnull -> 20
    //   5: pop
    //   6: new com/fasterxml/jackson/databind/JsonMappingException
    //   9: dup
    //   10: aload_1
    //   11: checkcast java/io/Closeable
    //   14: ldc 'Parser is null'
    //   16: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;)V
    //   19: athrow
    //   20: pop
    //   21: aload_1
    //   22: invokevirtual getCodec : ()Lcom/fasterxml/jackson/core/ObjectCodec;
    //   25: aload_1
    //   26: invokevirtual readTree : (Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/TreeNode;
    //   29: checkcast com/fasterxml/jackson/databind/JsonNode
    //   32: astore_3
    //   33: aload_3
    //   34: instanceof com/fasterxml/jackson/databind/node/TextNode
    //   37: ifeq -> 71
    //   40: new ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single
    //   43: dup
    //   44: aload_3
    //   45: checkcast com/fasterxml/jackson/databind/node/TextNode
    //   48: invokevirtual asText : ()Ljava/lang/String;
    //   51: dup
    //   52: ldc 'asText(...)'
    //   54: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   57: iconst_0
    //   58: aconst_null
    //   59: bipush #6
    //   61: aconst_null
    //   62: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   65: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   68: goto -> 748
    //   71: aload_3
    //   72: instanceof com/fasterxml/jackson/databind/node/ObjectNode
    //   75: ifeq -> 372
    //   78: aconst_null
    //   79: astore #4
    //   81: iconst_0
    //   82: istore #5
    //   84: aconst_null
    //   85: astore #6
    //   87: aload_3
    //   88: checkcast com/fasterxml/jackson/databind/node/ObjectNode
    //   91: invokevirtual fields : ()Ljava/util/Iterator;
    //   94: dup
    //   95: ldc 'fields(...)'
    //   97: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   100: astore #7
    //   102: iconst_0
    //   103: istore #8
    //   105: aload #7
    //   107: astore #9
    //   109: aload #9
    //   111: invokeinterface hasNext : ()Z
    //   116: ifeq -> 315
    //   119: aload #9
    //   121: invokeinterface next : ()Ljava/lang/Object;
    //   126: astore #10
    //   128: aload #10
    //   130: checkcast java/util/Map$Entry
    //   133: astore #11
    //   135: iconst_0
    //   136: istore #12
    //   138: aload #11
    //   140: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   143: aload #11
    //   145: invokeinterface getKey : ()Ljava/lang/Object;
    //   150: checkcast java/lang/String
    //   153: astore #13
    //   155: aload #11
    //   157: invokeinterface getValue : ()Ljava/lang/Object;
    //   162: checkcast com/fasterxml/jackson/databind/JsonNode
    //   165: astore #14
    //   167: aload #13
    //   169: astore #15
    //   171: aload #15
    //   173: ifnull -> 291
    //   176: aload #15
    //   178: invokevirtual hashCode : ()I
    //   181: lookupswitch default -> 291, -1165461084 -> 229, 109526418 -> 216, 951530617 -> 242
    //   216: aload #15
    //   218: ldc 'slice'
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifne -> 281
    //   226: goto -> 291
    //   229: aload #15
    //   231: ldc 'priority'
    //   233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   236: ifne -> 271
    //   239: goto -> 291
    //   242: aload #15
    //   244: ldc 'content'
    //   246: invokevirtual equals : (Ljava/lang/Object;)Z
    //   249: ifeq -> 291
    //   252: aload_1
    //   253: invokevirtual getCodec : ()Lcom/fasterxml/jackson/core/ObjectCodec;
    //   256: aload #14
    //   258: checkcast com/fasterxml/jackson/core/TreeNode
    //   261: ldc ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent
    //   263: invokevirtual treeToValue : (Lcom/fasterxml/jackson/core/TreeNode;Ljava/lang/Class;)Ljava/lang/Object;
    //   266: astore #4
    //   268: goto -> 310
    //   271: aload #14
    //   273: invokevirtual asInt : ()I
    //   276: istore #5
    //   278: goto -> 310
    //   281: aload #14
    //   283: invokevirtual asText : ()Ljava/lang/String;
    //   286: astore #6
    //   288: goto -> 310
    //   291: new com/fasterxml/jackson/databind/JsonMappingException
    //   294: dup
    //   295: aload_1
    //   296: checkcast java/io/Closeable
    //   299: aload #13
    //   301: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   306: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;)V
    //   309: athrow
    //   310: nop
    //   311: nop
    //   312: goto -> 109
    //   315: nop
    //   316: aload #4
    //   318: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent
    //   321: dup
    //   322: ifnull -> 347
    //   325: astore #10
    //   327: iconst_0
    //   328: istore #11
    //   330: new ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single
    //   333: dup
    //   334: aload #10
    //   336: iload #5
    //   338: aload #6
    //   340: invokespecial <init> : (Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;ILjava/lang/String;)V
    //   343: nop
    //   344: goto -> 366
    //   347: pop
    //   348: new com/fasterxml/jackson/databind/JsonMappingException
    //   351: dup
    //   352: aload_1
    //   353: checkcast java/io/Closeable
    //   356: aload_3
    //   357: <illegal opcode> makeConcatWithConstants : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
    //   362: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;)V
    //   365: athrow
    //   366: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   369: goto -> 748
    //   372: aload_3
    //   373: instanceof com/fasterxml/jackson/databind/node/ArrayNode
    //   376: ifeq -> 730
    //   379: aload_3
    //   380: checkcast java/lang/Iterable
    //   383: astore #5
    //   385: iconst_0
    //   386: istore #6
    //   388: aload #5
    //   390: astore #7
    //   392: new java/util/ArrayList
    //   395: dup
    //   396: aload #5
    //   398: bipush #10
    //   400: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   403: invokespecial <init> : (I)V
    //   406: checkcast java/util/Collection
    //   409: astore #8
    //   411: iconst_0
    //   412: istore #9
    //   414: aload #7
    //   416: invokeinterface iterator : ()Ljava/util/Iterator;
    //   421: astore #10
    //   423: aload #10
    //   425: invokeinterface hasNext : ()Z
    //   430: ifeq -> 485
    //   433: aload #10
    //   435: invokeinterface next : ()Ljava/lang/Object;
    //   440: astore #11
    //   442: aload #8
    //   444: aload #11
    //   446: checkcast com/fasterxml/jackson/databind/JsonNode
    //   449: astore #12
    //   451: astore #16
    //   453: iconst_0
    //   454: istore #13
    //   456: aload_1
    //   457: invokevirtual getCodec : ()Lcom/fasterxml/jackson/core/ObjectCodec;
    //   460: aload #12
    //   462: checkcast com/fasterxml/jackson/core/TreeNode
    //   465: ldc ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   467: invokevirtual treeToValue : (Lcom/fasterxml/jackson/core/TreeNode;Ljava/lang/Class;)Ljava/lang/Object;
    //   470: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   473: aload #16
    //   475: swap
    //   476: invokeinterface add : (Ljava/lang/Object;)Z
    //   481: pop
    //   482: goto -> 423
    //   485: aload #8
    //   487: checkcast java/util/List
    //   490: nop
    //   491: astore #4
    //   493: aload #4
    //   495: checkcast java/lang/Iterable
    //   498: astore #6
    //   500: iconst_0
    //   501: istore #7
    //   503: aload #6
    //   505: astore #8
    //   507: new java/util/ArrayList
    //   510: dup
    //   511: invokespecial <init> : ()V
    //   514: checkcast java/util/Collection
    //   517: astore #9
    //   519: iconst_0
    //   520: istore #10
    //   522: aload #8
    //   524: invokeinterface iterator : ()Ljava/util/Iterator;
    //   529: astore #11
    //   531: aload #11
    //   533: invokeinterface hasNext : ()Z
    //   538: ifeq -> 581
    //   541: aload #11
    //   543: invokeinterface next : ()Ljava/lang/Object;
    //   548: astore #12
    //   550: aload #12
    //   552: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   555: astore #13
    //   557: iconst_0
    //   558: istore #14
    //   560: aload #13
    //   562: instanceof ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single
    //   565: ifne -> 531
    //   568: aload #9
    //   570: aload #12
    //   572: invokeinterface add : (Ljava/lang/Object;)Z
    //   577: pop
    //   578: goto -> 531
    //   581: aload #9
    //   583: checkcast java/util/List
    //   586: nop
    //   587: astore #5
    //   589: aload #5
    //   591: checkcast java/util/Collection
    //   594: invokeinterface isEmpty : ()Z
    //   599: ifne -> 606
    //   602: iconst_1
    //   603: goto -> 607
    //   606: iconst_0
    //   607: ifeq -> 629
    //   610: new com/fasterxml/jackson/databind/JsonMappingException
    //   613: dup
    //   614: aload_1
    //   615: checkcast java/io/Closeable
    //   618: aload #5
    //   620: <illegal opcode> makeConcatWithConstants : (Ljava/util/List;)Ljava/lang/String;
    //   625: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;)V
    //   628: athrow
    //   629: aload #4
    //   631: checkcast java/lang/Iterable
    //   634: astore #6
    //   636: iconst_0
    //   637: istore #7
    //   639: aload #6
    //   641: astore #8
    //   643: new java/util/ArrayList
    //   646: dup
    //   647: invokespecial <init> : ()V
    //   650: checkcast java/util/Collection
    //   653: astore #9
    //   655: iconst_0
    //   656: istore #10
    //   658: aload #8
    //   660: invokeinterface iterator : ()Ljava/util/Iterator;
    //   665: astore #11
    //   667: aload #11
    //   669: invokeinterface hasNext : ()Z
    //   674: ifeq -> 707
    //   677: aload #11
    //   679: invokeinterface next : ()Ljava/lang/Object;
    //   684: astore #12
    //   686: aload #12
    //   688: instanceof ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Single
    //   691: ifeq -> 667
    //   694: aload #9
    //   696: aload #12
    //   698: invokeinterface add : (Ljava/lang/Object;)Z
    //   703: pop
    //   704: goto -> 667
    //   707: aload #9
    //   709: checkcast java/util/List
    //   712: nop
    //   713: astore #17
    //   715: new ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent$Multipart
    //   718: dup
    //   719: aload #17
    //   721: invokespecial <init> : (Ljava/util/List;)V
    //   724: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent
    //   727: goto -> 748
    //   730: new com/fasterxml/jackson/databind/JsonMappingException
    //   733: dup
    //   734: aload_1
    //   735: checkcast java/io/Closeable
    //   738: aload_3
    //   739: <illegal opcode> makeConcatWithConstants : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
    //   744: invokespecial <init> : (Ljava/io/Closeable;Ljava/lang/String;)V
    //   747: athrow
    //   748: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #88	-> 0
    //   #89	-> 21
    //   #90	-> 33
    //   #91	-> 71
    //   #92	-> 78
    //   #93	-> 81
    //   #94	-> 84
    //   #95	-> 87
    //   #156	-> 105
    //   #156	-> 107
    //   #95	-> 138
    //   #95	-> 150
    //   #95	-> 162
    //   #96	-> 167
    //   #97	-> 252
    //   #98	-> 271
    //   #99	-> 281
    //   #100	-> 291
    //   #102	-> 310
    //   #156	-> 311
    //   #157	-> 315
    //   #103	-> 316
    //   #158	-> 327
    //   #103	-> 330
    //   #103	-> 343
    //   #103	-> 344
    //   #104	-> 348
    //   #107	-> 372
    //   #108	-> 379
    //   #159	-> 388
    //   #160	-> 414
    //   #161	-> 442
    //   #108	-> 456
    //   #161	-> 476
    //   #162	-> 485
    //   #159	-> 490
    //   #108	-> 491
    //   #109	-> 493
    //   #163	-> 503
    //   #164	-> 522
    //   #109	-> 560
    //   #164	-> 565
    //   #165	-> 581
    //   #163	-> 586
    //   #109	-> 587
    //   #110	-> 589
    //   #110	-> 607
    //   #111	-> 610
    //   #113	-> 629
    //   #166	-> 639
    //   #175	-> 658
    //   #176	-> 707
    //   #166	-> 712
    //   #113	-> 713
    //   #116	-> 730
    //   #89	-> 748
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   138	173	12	$i$a$-forEach-VelocityModelMessageContentDeserializer$deserialize$1	I
    //   155	156	13	key	Ljava/lang/String;
    //   167	144	14	value	Lcom/fasterxml/jackson/databind/JsonNode;
    //   128	184	10	element$iv	Ljava/lang/Object;
    //   105	211	8	$i$f$forEach	I
    //   102	214	7	$this$forEach$iv	Ljava/util/Iterator;
    //   330	13	11	$i$a$-let-VelocityModelMessageContentDeserializer$deserialize$2	I
    //   327	16	10	it	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;
    //   81	285	4	content	Ljava/lang/Object;
    //   84	282	5	priority	I
    //   87	279	6	slice	Ljava/lang/Object;
    //   456	17	13	$i$a$-map-VelocityModelMessageContentDeserializer$deserialize$deserializedItems$1	I
    //   453	20	12	it	Lcom/fasterxml/jackson/databind/JsonNode;
    //   442	40	11	item$iv$iv	Ljava/lang/Object;
    //   414	73	9	$i$f$mapTo	I
    //   411	76	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   411	76	8	destination$iv$iv	Ljava/util/Collection;
    //   388	103	6	$i$f$map	I
    //   385	106	5	$this$map$iv	Ljava/lang/Iterable;
    //   560	5	14	$i$a$-filterNot-VelocityModelMessageContentDeserializer$deserialize$invalidItems$1	I
    //   557	8	13	it	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;
    //   550	28	12	element$iv$iv	Ljava/lang/Object;
    //   522	61	10	$i$f$filterNotTo	I
    //   519	64	8	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
    //   519	64	9	destination$iv$iv	Ljava/util/Collection;
    //   503	84	7	$i$f$filterNot	I
    //   500	87	6	$this$filterNot$iv	Ljava/lang/Iterable;
    //   686	18	12	element$iv$iv	Ljava/lang/Object;
    //   658	51	10	$i$f$filterIsInstanceTo	I
    //   655	54	8	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
    //   655	54	9	destination$iv$iv	Ljava/util/Collection;
    //   639	74	7	$i$f$filterIsInstance	I
    //   636	77	6	$this$filterIsInstance$iv	Ljava/lang/Iterable;
    //   493	231	4	deserializedItems	Ljava/util/List;
    //   589	135	5	invalidItems	Ljava/util/List;
    //   33	715	3	jsonNode	Lcom/fasterxml/jackson/databind/JsonNode;
    //   0	749	0	this	Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContentDeserializer;
    //   0	749	1	p	Lcom/fasterxml/jackson/core/JsonParser;
    //   0	749	2	ctxt	Lcom/fasterxml/jackson/databind/DeserializationContext;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessageContentDeserializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */