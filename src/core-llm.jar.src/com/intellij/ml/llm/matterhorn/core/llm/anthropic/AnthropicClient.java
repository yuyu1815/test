package com.intellij.ml.llm.matterhorn.core.llm.anthropic;

import com.intellij.ml.llm.matterhorn.core.llm.LlmClient;
import com.intellij.ml.llm.matterhorn.core.llm.LlmRequest;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient;", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "<init>", "()V", "createRequest", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "core-llm"})
@SourceDebugExtension({"SMAP\nAnthropicClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicClient.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n462#2:87\n412#2:88\n462#2:106\n412#2:107\n1246#3,4:89\n774#3:93\n865#3,2:94\n1557#3:96\n1628#3,3:97\n1202#3,2:100\n1230#3,4:102\n1246#3,4:108\n1#4:112\n*S KotlinDebug\n*F\n+ 1 AnthropicClient.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient\n*L\n37#1:87\n37#1:88\n42#1:106\n42#1:107\n37#1:89,4\n41#1:93\n41#1:94,2\n41#1:96\n41#1:97,3\n42#1:100,2\n42#1:102,4\n42#1:108,4\n*E\n"})
public final class AnthropicClient implements LlmClient {
  @NotNull
  public static final AnthropicClient INSTANCE = new AnthropicClient();
  
  @NotNull
  public LlmRequest createRequest(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'chat'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'modelParameters'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc 'propertyProvider'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_1
    //   19: aconst_null
    //   20: iconst_1
    //   21: aconst_null
    //   22: invokestatic checkChatForAnthropic$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   25: astore #4
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: checkcast java/util/List
    //   37: astore #5
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: checkcast java/util/List
    //   49: astore #6
    //   51: aload #4
    //   53: invokevirtual getToolChoice : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;
    //   56: astore #9
    //   58: iconst_0
    //   59: istore #10
    //   61: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam
    //   64: dup
    //   65: aload #9
    //   67: astore #11
    //   69: aload #11
    //   71: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Auto
    //   74: ifeq -> 82
    //   77: ldc 'auto'
    //   79: goto -> 116
    //   82: aload #11
    //   84: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Any
    //   87: ifeq -> 95
    //   90: ldc 'any'
    //   92: goto -> 116
    //   95: aload #11
    //   97: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool
    //   100: ifeq -> 108
    //   103: ldc 'tool'
    //   105: goto -> 116
    //   108: new kotlin/NoWhenBranchMatchedException
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: athrow
    //   116: aload #9
    //   118: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool
    //   121: ifeq -> 132
    //   124: aload #9
    //   126: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice$Tool
    //   129: goto -> 133
    //   132: aconst_null
    //   133: dup
    //   134: ifnull -> 143
    //   137: invokevirtual getName : ()Ljava/lang/String;
    //   140: goto -> 145
    //   143: pop
    //   144: aconst_null
    //   145: aload #9
    //   147: invokeinterface getAllowMultiple : ()Z
    //   152: ifne -> 159
    //   155: iconst_1
    //   156: goto -> 160
    //   159: iconst_0
    //   160: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   163: nop
    //   164: nop
    //   165: astore #7
    //   167: aload #4
    //   169: invokevirtual getTools : ()Ljava/util/List;
    //   172: invokeinterface iterator : ()Ljava/util/Iterator;
    //   177: astore #8
    //   179: aload #8
    //   181: invokeinterface hasNext : ()Z
    //   186: ifeq -> 1017
    //   189: aload #8
    //   191: invokeinterface next : ()Ljava/lang/Object;
    //   196: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornTool
    //   199: astore #9
    //   201: nop
    //   202: aload #9
    //   204: invokevirtual getType : ()Ljava/lang/String;
    //   207: ifnull -> 446
    //   210: aload #6
    //   212: aload #9
    //   214: invokevirtual getName : ()Ljava/lang/String;
    //   217: aload #9
    //   219: invokevirtual getType : ()Ljava/lang/String;
    //   222: aconst_null
    //   223: aconst_null
    //   224: aload #9
    //   226: invokevirtual getSettings : ()Ljava/util/Map;
    //   229: dup
    //   230: ifnull -> 409
    //   233: astore #11
    //   235: astore #35
    //   237: astore #34
    //   239: astore #33
    //   241: astore #32
    //   243: astore #29
    //   245: iconst_0
    //   246: istore #12
    //   248: aload #11
    //   250: astore #13
    //   252: new java/util/LinkedHashMap
    //   255: dup
    //   256: aload #11
    //   258: invokeinterface size : ()I
    //   263: invokestatic mapCapacity : (I)I
    //   266: invokespecial <init> : (I)V
    //   269: checkcast java/util/Map
    //   272: astore #14
    //   274: iconst_0
    //   275: istore #15
    //   277: aload #13
    //   279: invokeinterface entrySet : ()Ljava/util/Set;
    //   284: checkcast java/lang/Iterable
    //   287: astore #16
    //   289: iconst_0
    //   290: istore #17
    //   292: aload #16
    //   294: invokeinterface iterator : ()Ljava/util/Iterator;
    //   299: astore #18
    //   301: aload #18
    //   303: invokeinterface hasNext : ()Z
    //   308: ifeq -> 388
    //   311: aload #18
    //   313: invokeinterface next : ()Ljava/lang/Object;
    //   318: astore #19
    //   320: aload #14
    //   322: aload #19
    //   324: checkcast java/util/Map$Entry
    //   327: astore #20
    //   329: astore #21
    //   331: iconst_0
    //   332: istore #22
    //   334: aload #20
    //   336: invokeinterface getKey : ()Ljava/lang/Object;
    //   341: aload #21
    //   343: swap
    //   344: aload #19
    //   346: checkcast java/util/Map$Entry
    //   349: astore #23
    //   351: astore #37
    //   353: astore #36
    //   355: iconst_0
    //   356: istore #24
    //   358: aload #23
    //   360: invokeinterface getValue : ()Ljava/lang/Object;
    //   365: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
    //   368: invokestatic toJsonElement : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Lkotlinx/serialization/json/JsonElement;
    //   371: astore #38
    //   373: aload #36
    //   375: aload #37
    //   377: aload #38
    //   379: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: goto -> 301
    //   388: aload #14
    //   390: nop
    //   391: nop
    //   392: astore #36
    //   394: aload #29
    //   396: aload #32
    //   398: aload #33
    //   400: aload #34
    //   402: aload #35
    //   404: aload #36
    //   406: goto -> 411
    //   409: pop
    //   410: aconst_null
    //   411: astore #39
    //   413: astore #40
    //   415: astore #41
    //   417: astore #42
    //   419: astore #43
    //   421: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam
    //   424: dup
    //   425: aload #43
    //   427: aload #42
    //   429: aload #41
    //   431: aload #40
    //   433: aload #39
    //   435: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;Ljava/util/Map;)V
    //   438: invokeinterface add : (Ljava/lang/Object;)Z
    //   443: goto -> 1013
    //   446: aload #9
    //   448: invokevirtual getParams : ()Ljava/util/List;
    //   451: dup
    //   452: ifnull -> 649
    //   455: checkcast java/lang/Iterable
    //   458: astore #14
    //   460: iconst_0
    //   461: istore #15
    //   463: aload #14
    //   465: astore #16
    //   467: new java/util/ArrayList
    //   470: dup
    //   471: invokespecial <init> : ()V
    //   474: checkcast java/util/Collection
    //   477: astore #17
    //   479: iconst_0
    //   480: istore #18
    //   482: aload #16
    //   484: invokeinterface iterator : ()Ljava/util/Iterator;
    //   489: astore #19
    //   491: aload #19
    //   493: invokeinterface hasNext : ()Z
    //   498: ifeq -> 541
    //   501: aload #19
    //   503: invokeinterface next : ()Ljava/lang/Object;
    //   508: astore #20
    //   510: aload #20
    //   512: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
    //   515: astore #21
    //   517: iconst_0
    //   518: istore #22
    //   520: aload #21
    //   522: invokevirtual getRequired : ()Z
    //   525: ifeq -> 491
    //   528: aload #17
    //   530: aload #20
    //   532: invokeinterface add : (Ljava/lang/Object;)Z
    //   537: pop
    //   538: goto -> 491
    //   541: aload #17
    //   543: checkcast java/util/List
    //   546: nop
    //   547: checkcast java/lang/Iterable
    //   550: astore #14
    //   552: iconst_0
    //   553: istore #15
    //   555: aload #14
    //   557: astore #16
    //   559: new java/util/ArrayList
    //   562: dup
    //   563: aload #14
    //   565: bipush #10
    //   567: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   570: invokespecial <init> : (I)V
    //   573: checkcast java/util/Collection
    //   576: astore #17
    //   578: iconst_0
    //   579: istore #18
    //   581: aload #16
    //   583: invokeinterface iterator : ()Ljava/util/Iterator;
    //   588: astore #19
    //   590: aload #19
    //   592: invokeinterface hasNext : ()Z
    //   597: ifeq -> 640
    //   600: aload #19
    //   602: invokeinterface next : ()Ljava/lang/Object;
    //   607: astore #20
    //   609: aload #17
    //   611: aload #20
    //   613: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
    //   616: astore #21
    //   618: astore #29
    //   620: iconst_0
    //   621: istore #22
    //   623: aload #21
    //   625: invokevirtual getName : ()Ljava/lang/String;
    //   628: aload #29
    //   630: swap
    //   631: invokeinterface add : (Ljava/lang/Object;)Z
    //   636: pop
    //   637: goto -> 590
    //   640: aload #17
    //   642: checkcast java/util/List
    //   645: nop
    //   646: goto -> 651
    //   649: pop
    //   650: aconst_null
    //   651: dup
    //   652: ifnonnull -> 659
    //   655: pop
    //   656: invokestatic emptyList : ()Ljava/util/List;
    //   659: astore #11
    //   661: aload #9
    //   663: invokevirtual getParams : ()Ljava/util/List;
    //   666: dup
    //   667: ifnull -> 955
    //   670: checkcast java/lang/Iterable
    //   673: astore #15
    //   675: iconst_0
    //   676: istore #16
    //   678: aload #15
    //   680: bipush #10
    //   682: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   685: invokestatic mapCapacity : (I)I
    //   688: bipush #16
    //   690: invokestatic coerceAtLeast : (II)I
    //   693: istore #17
    //   695: aload #15
    //   697: astore #18
    //   699: new java/util/LinkedHashMap
    //   702: dup
    //   703: iload #17
    //   705: invokespecial <init> : (I)V
    //   708: checkcast java/util/Map
    //   711: astore #19
    //   713: iconst_0
    //   714: istore #20
    //   716: aload #18
    //   718: invokeinterface iterator : ()Ljava/util/Iterator;
    //   723: astore #21
    //   725: aload #21
    //   727: invokeinterface hasNext : ()Z
    //   732: ifeq -> 777
    //   735: aload #21
    //   737: invokeinterface next : ()Ljava/lang/Object;
    //   742: astore #22
    //   744: aload #19
    //   746: aload #22
    //   748: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
    //   751: astore #23
    //   753: astore #29
    //   755: iconst_0
    //   756: istore #24
    //   758: aload #23
    //   760: invokevirtual getName : ()Ljava/lang/String;
    //   763: aload #29
    //   765: swap
    //   766: aload #22
    //   768: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   773: pop
    //   774: goto -> 725
    //   777: aload #19
    //   779: nop
    //   780: astore #15
    //   782: iconst_0
    //   783: istore #16
    //   785: aload #15
    //   787: astore #17
    //   789: new java/util/LinkedHashMap
    //   792: dup
    //   793: aload #15
    //   795: invokeinterface size : ()I
    //   800: invokestatic mapCapacity : (I)I
    //   803: invokespecial <init> : (I)V
    //   806: checkcast java/util/Map
    //   809: astore #18
    //   811: iconst_0
    //   812: istore #19
    //   814: aload #17
    //   816: invokeinterface entrySet : ()Ljava/util/Set;
    //   821: checkcast java/lang/Iterable
    //   824: astore #20
    //   826: iconst_0
    //   827: istore #21
    //   829: aload #20
    //   831: invokeinterface iterator : ()Ljava/util/Iterator;
    //   836: astore #22
    //   838: aload #22
    //   840: invokeinterface hasNext : ()Z
    //   845: ifeq -> 948
    //   848: aload #22
    //   850: invokeinterface next : ()Ljava/lang/Object;
    //   855: astore #23
    //   857: aload #18
    //   859: aload #23
    //   861: checkcast java/util/Map$Entry
    //   864: astore #24
    //   866: astore #25
    //   868: iconst_0
    //   869: istore #26
    //   871: aload #24
    //   873: invokeinterface getKey : ()Ljava/lang/Object;
    //   878: aload #25
    //   880: swap
    //   881: aload #23
    //   883: checkcast java/util/Map$Entry
    //   886: astore #27
    //   888: astore #30
    //   890: astore #29
    //   892: iconst_0
    //   893: istore #28
    //   895: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchemaProperty
    //   898: dup
    //   899: aload #27
    //   901: invokeinterface getValue : ()Ljava/lang/Object;
    //   906: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
    //   909: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
    //   912: invokevirtual getTypeName : ()Ljava/lang/String;
    //   915: aload #27
    //   917: invokeinterface getValue : ()Ljava/lang/Object;
    //   922: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
    //   925: invokevirtual getDescription : ()Ljava/lang/String;
    //   928: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   931: astore #31
    //   933: aload #29
    //   935: aload #30
    //   937: aload #31
    //   939: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   944: pop
    //   945: goto -> 838
    //   948: aload #18
    //   950: nop
    //   951: nop
    //   952: goto -> 957
    //   955: pop
    //   956: aconst_null
    //   957: dup
    //   958: ifnonnull -> 965
    //   961: pop
    //   962: invokestatic emptyMap : ()Ljava/util/Map;
    //   965: astore #12
    //   967: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema
    //   970: dup
    //   971: ldc 'object'
    //   973: aload #12
    //   975: aload #11
    //   977: invokespecial <init> : (Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    //   980: astore #10
    //   982: aload #6
    //   984: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam
    //   987: dup
    //   988: aload #9
    //   990: invokevirtual getName : ()Ljava/lang/String;
    //   993: aconst_null
    //   994: aload #9
    //   996: invokevirtual getDescription : ()Ljava/lang/String;
    //   999: aload #10
    //   1001: aconst_null
    //   1002: bipush #16
    //   1004: aconst_null
    //   1005: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   1008: invokeinterface add : (Ljava/lang/Object;)Z
    //   1013: pop
    //   1014: goto -> 179
    //   1017: iconst_0
    //   1018: istore #8
    //   1020: aload #4
    //   1022: invokevirtual getMessages : ()Ljava/util/List;
    //   1025: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1030: astore #9
    //   1032: aload #9
    //   1034: invokeinterface hasNext : ()Z
    //   1039: ifeq -> 1187
    //   1042: aload #9
    //   1044: invokeinterface next : ()Ljava/lang/Object;
    //   1049: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
    //   1052: astore #10
    //   1054: aload #4
    //   1056: invokevirtual getMessages : ()Ljava/util/List;
    //   1059: aload_2
    //   1060: aload #10
    //   1062: iload #8
    //   1064: invokestatic shouldAddCachePoint : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;I)Z
    //   1067: istore #11
    //   1069: aload #10
    //   1071: iload #11
    //   1073: invokestatic toAnthropicContent : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Z)Ljava/util/List;
    //   1076: astore #12
    //   1078: aload #10
    //   1080: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   1085: getstatic com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient$WhenMappings.$EnumSwitchMapping$0 : [I
    //   1088: swap
    //   1089: invokevirtual ordinal : ()I
    //   1092: iaload
    //   1093: tableswitch default -> 1126, 1 -> 1116, 2 -> 1121
    //   1116: ldc 'user'
    //   1118: goto -> 1134
    //   1121: ldc 'assistant'
    //   1123: goto -> 1134
    //   1126: new kotlin/NoWhenBranchMatchedException
    //   1129: dup
    //   1130: invokespecial <init> : ()V
    //   1133: athrow
    //   1134: astore #13
    //   1136: aload #5
    //   1138: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatMessage
    //   1141: dup
    //   1142: aload #13
    //   1144: aload #12
    //   1146: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
    //   1149: invokeinterface add : (Ljava/lang/Object;)Z
    //   1154: pop
    //   1155: iload #8
    //   1157: aload #10
    //   1159: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
    //   1164: getstatic com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient$WhenMappings.$EnumSwitchMapping$0 : [I
    //   1167: swap
    //   1168: invokevirtual ordinal : ()I
    //   1171: iaload
    //   1172: iconst_1
    //   1173: if_icmpne -> 1180
    //   1176: iconst_1
    //   1177: goto -> 1181
    //   1180: iconst_0
    //   1181: iadd
    //   1182: istore #8
    //   1184: goto -> 1032
    //   1187: aload_2
    //   1188: invokevirtual getStop : ()Ljava/util/Map;
    //   1191: dup
    //   1192: ifnonnull -> 1199
    //   1195: pop
    //   1196: invokestatic emptyMap : ()Ljava/util/Map;
    //   1199: astore #9
    //   1201: aload #4
    //   1203: invokevirtual getSystem : ()Ljava/lang/String;
    //   1206: astore #11
    //   1208: aload #6
    //   1210: checkcast java/util/Collection
    //   1213: astore #13
    //   1215: aload #13
    //   1217: invokeinterface isEmpty : ()Z
    //   1222: ifeq -> 1232
    //   1225: iconst_0
    //   1226: istore #14
    //   1228: aconst_null
    //   1229: goto -> 1234
    //   1232: aload #13
    //   1234: checkcast java/util/List
    //   1237: astore #12
    //   1239: aload #7
    //   1241: astore #14
    //   1243: aload #14
    //   1245: astore #15
    //   1247: iconst_0
    //   1248: istore #16
    //   1250: aload #6
    //   1252: invokeinterface isEmpty : ()Z
    //   1257: ifne -> 1265
    //   1260: aload #14
    //   1262: goto -> 1266
    //   1265: aconst_null
    //   1266: astore #13
    //   1268: aload #9
    //   1270: invokeinterface keySet : ()Ljava/util/Set;
    //   1275: checkcast java/lang/Iterable
    //   1278: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   1281: checkcast java/util/Collection
    //   1284: astore #15
    //   1286: aload #15
    //   1288: invokeinterface isEmpty : ()Z
    //   1293: ifeq -> 1303
    //   1296: iconst_0
    //   1297: istore #16
    //   1299: aconst_null
    //   1300: goto -> 1305
    //   1303: aload #15
    //   1305: checkcast java/util/List
    //   1308: astore #14
    //   1310: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody
    //   1313: dup
    //   1314: aload_2
    //   1315: aload #11
    //   1317: aload #5
    //   1319: aload #12
    //   1321: aload #13
    //   1323: aload #14
    //   1325: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;Ljava/util/List;)V
    //   1328: astore #10
    //   1330: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
    //   1333: dup
    //   1334: aload #10
    //   1336: aload #9
    //   1338: aload_2
    //   1339: aload_2
    //   1340: invokevirtual getPromptCacheEnabled : ()Z
    //   1343: aload_3
    //   1344: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;)V
    //   1347: checkcast com/intellij/ml/llm/matterhorn/core/llm/LlmRequest
    //   1350: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 18
    //   #21	-> 27
    //   #21	-> 37
    //   #22	-> 39
    //   #22	-> 49
    //   #23	-> 51
    //   #24	-> 61
    //   #25	-> 65
    //   #26	-> 69
    //   #27	-> 82
    //   #28	-> 95
    //   #25	-> 108
    //   #30	-> 116
    //   #31	-> 145
    //   #24	-> 160
    //   #32	-> 163
    //   #23	-> 164
    //   #23	-> 165
    //   #35	-> 167
    //   #36	-> 201
    //   #37	-> 202
    //   #87	-> 248
    //   #88	-> 277
    //   #89	-> 292
    //   #90	-> 320
    //   #88	-> 334
    //   #90	-> 344
    //   #37	-> 358
    //   #90	-> 379
    //   #92	-> 388
    //   #88	-> 390
    //   #87	-> 391
    //   #37	-> 409
    //   #41	-> 446
    //   #93	-> 463
    //   #94	-> 482
    //   #41	-> 520
    //   #94	-> 525
    //   #95	-> 541
    //   #93	-> 546
    //   #41	-> 547
    //   #96	-> 555
    //   #97	-> 581
    //   #98	-> 609
    //   #41	-> 623
    //   #98	-> 631
    //   #99	-> 640
    //   #96	-> 645
    //   #41	-> 649
    //   #41	-> 659
    //   #42	-> 661
    //   #100	-> 678
    //   #101	-> 695
    //   #102	-> 716
    //   #103	-> 744
    //   #42	-> 758
    //   #103	-> 766
    //   #105	-> 777
    //   #101	-> 779
    //   #42	-> 780
    //   #106	-> 785
    //   #107	-> 814
    //   #108	-> 829
    //   #109	-> 857
    //   #107	-> 871
    //   #109	-> 881
    //   #43	-> 895
    //   #109	-> 939
    //   #111	-> 948
    //   #107	-> 950
    //   #106	-> 951
    //   #42	-> 955
    //   #44	-> 957
    //   #44	-> 965
    //   #39	-> 967
    //   #40	-> 971
    //   #44	-> 973
    //   #41	-> 975
    //   #39	-> 977
    //   #47	-> 982
    //   #52	-> 1017
    //   #53	-> 1020
    //   #54	-> 1054
    //   #55	-> 1069
    //   #56	-> 1078
    //   #57	-> 1116
    //   #58	-> 1121
    //   #56	-> 1126
    //   #60	-> 1136
    //   #61	-> 1155
    //   #62	-> 1172
    //   #63	-> 1180
    //   #61	-> 1181
    //   #67	-> 1187
    //   #70	-> 1201
    //   #73	-> 1208
    //   #112	-> 1225
    //   #73	-> 1228
    //   #73	-> 1229
    //   #73	-> 1234
    //   #74	-> 1239
    //   #112	-> 1247
    //   #74	-> 1250
    //   #74	-> 1257
    //   #74	-> 1266
    //   #75	-> 1268
    //   #112	-> 1296
    //   #75	-> 1299
    //   #75	-> 1300
    //   #75	-> 1305
    //   #69	-> 1310
    //   #72	-> 1314
    //   #70	-> 1315
    //   #71	-> 1317
    //   #73	-> 1319
    //   #74	-> 1321
    //   #75	-> 1323
    //   #69	-> 1325
    //   #78	-> 1330
    //   #79	-> 1334
    //   #80	-> 1336
    //   #81	-> 1338
    //   #82	-> 1339
    //   #83	-> 1343
    //   #78	-> 1344
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   61	103	10	$i$a$-let-AnthropicClient$createRequest$toolChoiceParam$1	I
    //   58	106	9	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;
    //   358	13	24	$i$a$-mapValues-AnthropicClient$createRequest$1	I
    //   355	16	23	it	Ljava/util/Map$Entry;
    //   334	7	22	$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv	I
    //   331	10	20	it$iv$iv	Ljava/util/Map$Entry;
    //   320	65	19	element$iv$iv$iv	Ljava/lang/Object;
    //   292	98	17	$i$f$associateByTo	I
    //   289	101	16	$this$associateByTo$iv$iv$iv	Ljava/lang/Iterable;
    //   277	114	15	$i$f$mapValuesTo	I
    //   274	117	13	$this$mapValuesTo$iv$iv	Ljava/util/Map;
    //   274	117	14	destination$iv$iv	Ljava/util/Map;
    //   248	144	12	$i$f$mapValues	I
    //   245	147	11	$this$mapValues$iv	Ljava/util/Map;
    //   520	5	22	$i$a$-filter-AnthropicClient$createRequest$schema$1	I
    //   517	8	21	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;
    //   510	28	20	element$iv$iv	Ljava/lang/Object;
    //   482	61	18	$i$f$filterTo	I
    //   479	64	16	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   479	64	17	destination$iv$iv	Ljava/util/Collection;
    //   463	84	15	$i$f$filter	I
    //   460	87	14	$this$filter$iv	Ljava/lang/Iterable;
    //   623	5	22	$i$a$-map-AnthropicClient$createRequest$schema$2	I
    //   620	8	21	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;
    //   609	28	20	item$iv$iv	Ljava/lang/Object;
    //   581	61	18	$i$f$mapTo	I
    //   578	64	16	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   578	64	17	destination$iv$iv	Ljava/util/Collection;
    //   555	91	15	$i$f$map	I
    //   552	94	14	$this$map$iv	Ljava/lang/Iterable;
    //   758	5	24	$i$a$-associateBy-AnthropicClient$createRequest$schema$3	I
    //   755	8	23	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolParam;
    //   744	30	22	element$iv$iv	Ljava/lang/Object;
    //   716	63	20	$i$f$associateByTo	I
    //   713	66	18	$this$associateByTo$iv$iv	Ljava/lang/Iterable;
    //   713	66	19	destination$iv$iv	Ljava/util/Map;
    //   678	102	16	$i$f$associateBy	I
    //   695	85	17	capacity$iv	I
    //   675	105	15	$this$associateBy$iv	Ljava/lang/Iterable;
    //   895	36	28	$i$a$-mapValues-AnthropicClient$createRequest$schema$4	I
    //   892	39	27	it	Ljava/util/Map$Entry;
    //   871	7	26	$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv	I
    //   868	10	24	it$iv$iv	Ljava/util/Map$Entry;
    //   857	88	23	element$iv$iv$iv	Ljava/lang/Object;
    //   829	121	21	$i$f$associateByTo	I
    //   826	124	20	$this$associateByTo$iv$iv$iv	Ljava/lang/Iterable;
    //   814	137	19	$i$f$mapValuesTo	I
    //   811	140	17	$this$mapValuesTo$iv$iv	Ljava/util/Map;
    //   811	140	18	destination$iv$iv	Ljava/util/Map;
    //   785	167	16	$i$f$mapValues	I
    //   782	170	15	$this$mapValues$iv	Ljava/util/Map;
    //   982	31	10	schema	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;
    //   201	813	9	tool	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;
    //   1069	115	11	shouldCache	Z
    //   1078	106	12	messagesContent	Ljava/util/List;
    //   1136	48	13	role	Ljava/lang/String;
    //   1054	130	10	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
    //   1228	1	14	$i$a$-ifEmpty-AnthropicClient$createRequest$body$1	I
    //   1250	7	16	$i$a$-takeUnless-AnthropicClient$createRequest$body$2	I
    //   1247	10	15	it	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;
    //   1299	1	16	$i$a$-ifEmpty-AnthropicClient$createRequest$body$3	I
    //   27	1324	4	safe	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   39	1312	5	messages	Ljava/util/List;
    //   51	1300	6	tools	Ljava/util/List;
    //   167	1184	7	toolChoiceParam	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;
    //   1020	331	8	userMessageOffset	I
    //   1201	150	9	stopReasons	Ljava/util/Map;
    //   1330	21	10	body	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;
    //   0	1351	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicClient;
    //   0	1351	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
    //   0	1351	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
    //   0	1351	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */