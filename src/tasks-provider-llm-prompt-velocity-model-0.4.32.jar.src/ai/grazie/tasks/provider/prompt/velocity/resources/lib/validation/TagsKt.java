package ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation;

import ai.grazie.tasks.provider.prompt.velocity.resources.lib.TaggedEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\000\n\002\b\002\0329\020\000\032\0020\001\"\020\b\000\020\002*\n\022\006\b\001\022\0020\0040\003*\002H\0022\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bH\000¢\006\002\020\n¨\006\013"}, d2 = {"validateTags", "", "EntityT", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "reservedTagName", "", "errorContext", "Lkotlin/Function0;", "", "(Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "tasks-provider-llm-prompt-velocity-model"})
@SourceDebugExtension({"SMAP\ntags.kt\nKotlin\n*S Kotlin\n*F\n+ 1 tags.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/TagsKt\n+ 2 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n12#2,2:40\n29#2:42\n15#2:44\n12#2,2:45\n29#2:47\n15#2:49\n12#2,2:50\n29#2:52\n15#2:54\n12#2,2:59\n29#2:61\n15#2:63\n12#2,2:64\n29#2:66\n15#2:68\n1#3:43\n1#3:48\n1#3:53\n1#3:62\n1#3:67\n1557#4:55\n1628#4,3:56\n*S KotlinDebug\n*F\n+ 1 tags.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/TagsKt\n*L\n15#1:40,2\n15#1:42\n15#1:44\n16#1:45,2\n16#1:47\n16#1:49\n17#1:50,2\n17#1:52\n17#1:54\n21#1:59,2\n21#1:61\n21#1:63\n23#1:64,2\n23#1:66\n23#1:68\n15#1:43\n16#1:48\n17#1:53\n21#1:62\n23#1:67\n19#1:55\n19#1:56,3\n*E\n"})
public final class TagsKt {
  public static final <EntityT extends TaggedEntity<? extends ai.grazie.tasks.provider.prompt.velocity.resources.lib.EntityTag>> void validateTags(@NotNull TaggedEntity $this$validateTags, @NotNull String reservedTagName, @NotNull Function0 errorContext) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 'reservedTagName'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 'errorContext'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_0
    //   19: invokeinterface getRegisteredTags : ()Ljava/util/List;
    //   24: checkcast java/lang/Iterable
    //   27: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
    //   30: astore_3
    //   31: aload_3
    //   32: checkcast java/util/Collection
    //   35: invokeinterface isEmpty : ()Z
    //   40: ifne -> 47
    //   43: iconst_1
    //   44: goto -> 48
    //   47: iconst_0
    //   48: istore #4
    //   50: nop
    //   51: iconst_0
    //   52: istore #5
    //   54: iload #4
    //   56: ifne -> 121
    //   59: iconst_0
    //   60: istore #6
    //   62: aload_2
    //   63: invokeinterface invoke : ()Ljava/lang/Object;
    //   68: dup
    //   69: ifnull -> 99
    //   72: astore #7
    //   74: iconst_0
    //   75: istore #8
    //   77: aload #7
    //   79: astore #17
    //   81: iconst_0
    //   82: istore #9
    //   84: ldc 'no tags are registered'
    //   86: aload #17
    //   88: swap
    //   89: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    //   94: nop
    //   95: dup
    //   96: ifnonnull -> 106
    //   99: pop
    //   100: iconst_0
    //   101: istore #9
    //   103: ldc 'no tags are registered'
    //   105: nop
    //   106: aconst_null
    //   107: iconst_2
    //   108: aconst_null
    //   109: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
    //   112: pop
    //   113: new kotlin/KotlinNothingValueException
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: athrow
    //   121: nop
    //   122: aload_3
    //   123: invokeinterface size : ()I
    //   128: aload_0
    //   129: invokeinterface getRegisteredTags : ()Ljava/util/List;
    //   134: invokeinterface size : ()I
    //   139: if_icmpne -> 146
    //   142: iconst_1
    //   143: goto -> 147
    //   146: iconst_0
    //   147: istore #4
    //   149: iconst_0
    //   150: istore #5
    //   152: iload #4
    //   154: ifne -> 243
    //   157: iconst_0
    //   158: istore #6
    //   160: aload_2
    //   161: invokeinterface invoke : ()Ljava/lang/Object;
    //   166: dup
    //   167: ifnull -> 209
    //   170: astore #7
    //   172: iconst_0
    //   173: istore #8
    //   175: aload #7
    //   177: astore #17
    //   179: iconst_0
    //   180: istore #9
    //   182: aload_0
    //   183: invokeinterface getRegisteredTags : ()Ljava/util/List;
    //   188: invokestatic duplicates : (Ljava/util/List;)Ljava/util/Collection;
    //   191: <illegal opcode> makeConcatWithConstants : (Ljava/util/Collection;)Ljava/lang/String;
    //   196: aload #17
    //   198: swap
    //   199: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    //   204: nop
    //   205: dup
    //   206: ifnonnull -> 228
    //   209: pop
    //   210: iconst_0
    //   211: istore #9
    //   213: aload_0
    //   214: invokeinterface getRegisteredTags : ()Ljava/util/List;
    //   219: invokestatic duplicates : (Ljava/util/List;)Ljava/util/Collection;
    //   222: <illegal opcode> makeConcatWithConstants : (Ljava/util/Collection;)Ljava/lang/String;
    //   227: nop
    //   228: aconst_null
    //   229: iconst_2
    //   230: aconst_null
    //   231: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
    //   234: pop
    //   235: new kotlin/KotlinNothingValueException
    //   238: dup
    //   239: invokespecial <init> : ()V
    //   242: athrow
    //   243: nop
    //   244: aload_3
    //   245: aload_1
    //   246: invokeinterface contains : (Ljava/lang/Object;)Z
    //   251: ifne -> 258
    //   254: iconst_1
    //   255: goto -> 259
    //   258: iconst_0
    //   259: istore #4
    //   261: iconst_0
    //   262: istore #5
    //   264: iload #4
    //   266: ifne -> 339
    //   269: iconst_0
    //   270: istore #6
    //   272: aload_2
    //   273: invokeinterface invoke : ()Ljava/lang/Object;
    //   278: dup
    //   279: ifnull -> 313
    //   282: astore #7
    //   284: iconst_0
    //   285: istore #8
    //   287: aload #7
    //   289: astore #17
    //   291: iconst_0
    //   292: istore #9
    //   294: aload_1
    //   295: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   300: aload #17
    //   302: swap
    //   303: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    //   308: nop
    //   309: dup
    //   310: ifnonnull -> 324
    //   313: pop
    //   314: iconst_0
    //   315: istore #9
    //   317: aload_1
    //   318: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   323: nop
    //   324: aconst_null
    //   325: iconst_2
    //   326: aconst_null
    //   327: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
    //   330: pop
    //   331: new kotlin/KotlinNothingValueException
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: athrow
    //   339: nop
    //   340: aload_0
    //   341: invokeinterface getTagPriorities : ()Ljava/util/List;
    //   346: checkcast java/lang/Iterable
    //   349: astore #5
    //   351: iconst_0
    //   352: istore #6
    //   354: aload #5
    //   356: astore #7
    //   358: new java/util/ArrayList
    //   361: dup
    //   362: aload #5
    //   364: bipush #10
    //   366: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   369: invokespecial <init> : (I)V
    //   372: checkcast java/util/Collection
    //   375: astore #8
    //   377: iconst_0
    //   378: istore #9
    //   380: aload #7
    //   382: invokeinterface iterator : ()Ljava/util/Iterator;
    //   387: astore #10
    //   389: aload #10
    //   391: invokeinterface hasNext : ()Z
    //   396: ifeq -> 441
    //   399: aload #10
    //   401: invokeinterface next : ()Ljava/lang/Object;
    //   406: astore #11
    //   408: aload #8
    //   410: aload #11
    //   412: checkcast ai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag
    //   415: astore #12
    //   417: astore #17
    //   419: iconst_0
    //   420: istore #13
    //   422: aload #12
    //   424: invokeinterface getTagName : ()Ljava/lang/String;
    //   429: aload #17
    //   431: swap
    //   432: invokeinterface add : (Ljava/lang/Object;)Z
    //   437: pop
    //   438: goto -> 389
    //   441: aload #8
    //   443: checkcast java/util/List
    //   446: nop
    //   447: astore #4
    //   449: aload #4
    //   451: checkcast java/lang/Iterable
    //   454: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
    //   457: astore #5
    //   459: aload #5
    //   461: invokeinterface size : ()I
    //   466: aload #4
    //   468: invokeinterface size : ()I
    //   473: if_icmpne -> 480
    //   476: iconst_1
    //   477: goto -> 481
    //   480: iconst_0
    //   481: istore #6
    //   483: iconst_0
    //   484: istore #7
    //   486: iload #6
    //   488: ifne -> 569
    //   491: iconst_0
    //   492: istore #8
    //   494: aload_2
    //   495: invokeinterface invoke : ()Ljava/lang/Object;
    //   500: dup
    //   501: ifnull -> 539
    //   504: astore #9
    //   506: iconst_0
    //   507: istore #10
    //   509: aload #9
    //   511: astore #17
    //   513: iconst_0
    //   514: istore #11
    //   516: aload #4
    //   518: invokestatic duplicates : (Ljava/util/List;)Ljava/util/Collection;
    //   521: <illegal opcode> makeConcatWithConstants : (Ljava/util/Collection;)Ljava/lang/String;
    //   526: aload #17
    //   528: swap
    //   529: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    //   534: nop
    //   535: dup
    //   536: ifnonnull -> 554
    //   539: pop
    //   540: iconst_0
    //   541: istore #11
    //   543: aload #4
    //   545: invokestatic duplicates : (Ljava/util/List;)Ljava/util/Collection;
    //   548: <illegal opcode> makeConcatWithConstants : (Ljava/util/Collection;)Ljava/lang/String;
    //   553: nop
    //   554: aconst_null
    //   555: iconst_2
    //   556: aconst_null
    //   557: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
    //   560: pop
    //   561: new kotlin/KotlinNothingValueException
    //   564: dup
    //   565: invokespecial <init> : ()V
    //   568: athrow
    //   569: nop
    //   570: aload #5
    //   572: aload_3
    //   573: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   576: istore #6
    //   578: iconst_0
    //   579: istore #7
    //   581: iload #6
    //   583: ifne -> 928
    //   586: iconst_0
    //   587: istore #8
    //   589: aload_2
    //   590: invokeinterface invoke : ()Ljava/lang/Object;
    //   595: dup
    //   596: ifnull -> 766
    //   599: astore #9
    //   601: iconst_0
    //   602: istore #10
    //   604: aload #9
    //   606: astore #17
    //   608: iconst_0
    //   609: istore #11
    //   611: new java/lang/StringBuilder
    //   614: dup
    //   615: invokespecial <init> : ()V
    //   618: astore #12
    //   620: aload #12
    //   622: astore #13
    //   624: iconst_0
    //   625: istore #14
    //   627: aload #5
    //   629: aload_3
    //   630: checkcast java/lang/Iterable
    //   633: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    //   636: astore #15
    //   638: aload #15
    //   640: checkcast java/util/Collection
    //   643: invokeinterface isEmpty : ()Z
    //   648: ifne -> 655
    //   651: iconst_1
    //   652: goto -> 656
    //   655: iconst_0
    //   656: ifeq -> 672
    //   659: aload #13
    //   661: aload #15
    //   663: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
    //   668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: pop
    //   672: aload_3
    //   673: aload #5
    //   675: checkcast java/lang/Iterable
    //   678: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    //   681: astore #16
    //   683: aload #16
    //   685: checkcast java/util/Collection
    //   688: invokeinterface isEmpty : ()Z
    //   693: ifne -> 700
    //   696: iconst_1
    //   697: goto -> 701
    //   700: iconst_0
    //   701: ifeq -> 746
    //   704: aload #15
    //   706: checkcast java/util/Collection
    //   709: invokeinterface isEmpty : ()Z
    //   714: ifne -> 721
    //   717: iconst_1
    //   718: goto -> 722
    //   721: iconst_0
    //   722: ifeq -> 733
    //   725: aload #13
    //   727: ldc ' and '
    //   729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   732: pop
    //   733: aload #13
    //   735: aload #16
    //   737: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
    //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: pop
    //   746: nop
    //   747: aload #12
    //   749: invokevirtual toString : ()Ljava/lang/String;
    //   752: nop
    //   753: aload #17
    //   755: swap
    //   756: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    //   761: nop
    //   762: dup
    //   763: ifnonnull -> 913
    //   766: pop
    //   767: iconst_0
    //   768: istore #11
    //   770: new java/lang/StringBuilder
    //   773: dup
    //   774: invokespecial <init> : ()V
    //   777: astore #12
    //   779: aload #12
    //   781: astore #13
    //   783: iconst_0
    //   784: istore #14
    //   786: aload #5
    //   788: aload_3
    //   789: checkcast java/lang/Iterable
    //   792: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    //   795: astore #15
    //   797: aload #15
    //   799: checkcast java/util/Collection
    //   802: invokeinterface isEmpty : ()Z
    //   807: ifne -> 814
    //   810: iconst_1
    //   811: goto -> 815
    //   814: iconst_0
    //   815: ifeq -> 831
    //   818: aload #13
    //   820: aload #15
    //   822: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
    //   827: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   830: pop
    //   831: aload_3
    //   832: aload #5
    //   834: checkcast java/lang/Iterable
    //   837: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
    //   840: astore #16
    //   842: aload #16
    //   844: checkcast java/util/Collection
    //   847: invokeinterface isEmpty : ()Z
    //   852: ifne -> 859
    //   855: iconst_1
    //   856: goto -> 860
    //   859: iconst_0
    //   860: ifeq -> 905
    //   863: aload #15
    //   865: checkcast java/util/Collection
    //   868: invokeinterface isEmpty : ()Z
    //   873: ifne -> 880
    //   876: iconst_1
    //   877: goto -> 881
    //   880: iconst_0
    //   881: ifeq -> 892
    //   884: aload #13
    //   886: ldc ' and '
    //   888: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   891: pop
    //   892: aload #13
    //   894: aload #16
    //   896: <illegal opcode> makeConcatWithConstants : (Ljava/util/Set;)Ljava/lang/String;
    //   901: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   904: pop
    //   905: nop
    //   906: aload #12
    //   908: invokevirtual toString : ()Ljava/lang/String;
    //   911: nop
    //   912: nop
    //   913: aconst_null
    //   914: iconst_2
    //   915: aconst_null
    //   916: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
    //   919: pop
    //   920: new kotlin/KotlinNothingValueException
    //   923: dup
    //   924: invokespecial <init> : ()V
    //   927: athrow
    //   928: nop
    //   929: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 18
    //   #15	-> 31
    //   #15	-> 50
    //   #40	-> 54
    //   #41	-> 59
    //   #42	-> 62
    //   #43	-> 74
    //   #42	-> 77
    //   #15	-> 84
    //   #42	-> 89
    //   #42	-> 94
    //   #42	-> 95
    //   #15	-> 103
    //   #42	-> 105
    //   #41	-> 106
    //   #44	-> 121
    //   #16	-> 122
    //   #45	-> 152
    //   #46	-> 157
    //   #47	-> 160
    //   #48	-> 172
    //   #47	-> 175
    //   #16	-> 182
    //   #47	-> 199
    //   #47	-> 204
    //   #47	-> 205
    //   #16	-> 213
    //   #47	-> 227
    //   #46	-> 228
    //   #49	-> 243
    //   #17	-> 244
    //   #50	-> 264
    //   #51	-> 269
    //   #52	-> 272
    //   #53	-> 284
    //   #52	-> 287
    //   #17	-> 294
    //   #52	-> 303
    //   #52	-> 308
    //   #52	-> 309
    //   #17	-> 317
    //   #52	-> 323
    //   #51	-> 324
    //   #54	-> 339
    //   #19	-> 340
    //   #55	-> 354
    //   #56	-> 380
    //   #57	-> 408
    //   #19	-> 422
    //   #57	-> 432
    //   #58	-> 441
    //   #55	-> 446
    //   #19	-> 447
    //   #20	-> 449
    //   #21	-> 459
    //   #59	-> 486
    //   #60	-> 491
    //   #61	-> 494
    //   #62	-> 506
    //   #61	-> 509
    //   #21	-> 516
    //   #61	-> 529
    //   #61	-> 534
    //   #61	-> 535
    //   #21	-> 543
    //   #61	-> 553
    //   #60	-> 554
    //   #63	-> 569
    //   #23	-> 570
    //   #64	-> 581
    //   #65	-> 586
    //   #66	-> 589
    //   #67	-> 601
    //   #66	-> 604
    //   #24	-> 611
    //   #25	-> 627
    //   #26	-> 638
    //   #26	-> 656
    //   #27	-> 659
    //   #29	-> 672
    //   #30	-> 683
    //   #30	-> 701
    //   #31	-> 704
    //   #31	-> 722
    //   #32	-> 725
    //   #34	-> 733
    //   #36	-> 746
    //   #24	-> 747
    //   #36	-> 752
    //   #66	-> 756
    //   #66	-> 761
    //   #66	-> 762
    //   #24	-> 770
    //   #25	-> 786
    //   #26	-> 797
    //   #26	-> 815
    //   #27	-> 818
    //   #29	-> 831
    //   #30	-> 842
    //   #30	-> 860
    //   #31	-> 863
    //   #31	-> 881
    //   #32	-> 884
    //   #34	-> 892
    //   #36	-> 905
    //   #24	-> 906
    //   #36	-> 911
    //   #66	-> 912
    //   #65	-> 913
    //   #68	-> 928
    //   #38	-> 929
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   84	2	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$1	I
    //   103	2	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$1	I
    //   77	17	8	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
    //   74	20	7	it$iv$iv	Ljava/lang/Object;
    //   62	44	6	$i$f$buildMessage	I
    //   54	68	5	$i$f$checkOrVelocityLibraryException	I
    //   51	71	4	condition$iv	Z
    //   182	14	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$2	I
    //   213	14	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$2	I
    //   175	29	8	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
    //   172	32	7	it$iv$iv	Ljava/lang/Object;
    //   160	68	6	$i$f$buildMessage	I
    //   152	92	5	$i$f$checkOrVelocityLibraryException	I
    //   149	95	4	condition$iv	Z
    //   294	6	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$3	I
    //   317	6	9	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$3	I
    //   287	21	8	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
    //   284	24	7	it$iv$iv	Ljava/lang/Object;
    //   272	52	6	$i$f$buildMessage	I
    //   264	76	5	$i$f$checkOrVelocityLibraryException	I
    //   261	79	4	condition$iv	Z
    //   422	7	13	$i$a$-map-TagsKt$validateTags$tagNames$1	I
    //   419	10	12	it	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;
    //   408	30	11	item$iv$iv	Ljava/lang/Object;
    //   380	63	9	$i$f$mapTo	I
    //   377	66	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   377	66	8	destination$iv$iv	Ljava/util/Collection;
    //   354	93	6	$i$f$map	I
    //   351	96	5	$this$map$iv	Ljava/lang/Iterable;
    //   516	10	11	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$4	I
    //   543	10	11	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$4	I
    //   509	25	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
    //   506	28	9	it$iv$iv	Ljava/lang/Object;
    //   494	60	8	$i$f$buildMessage	I
    //   486	84	7	$i$f$checkOrVelocityLibraryException	I
    //   483	87	6	condition$iv	Z
    //   627	120	14	$i$a$-buildString-TagsKt$validateTags$5$1	I
    //   638	109	15	diff1	Ljava/util/Set;
    //   683	64	16	diff2	Ljava/util/Set;
    //   624	123	13	$this$validateTags_u24lambda_u246_u24lambda_u245	Ljava/lang/StringBuilder;
    //   611	142	11	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$5	I
    //   786	120	14	$i$a$-buildString-TagsKt$validateTags$5$1	I
    //   797	109	15	diff1	Ljava/util/Set;
    //   842	64	16	diff2	Ljava/util/Set;
    //   783	123	13	$this$validateTags_u24lambda_u246_u24lambda_u245	Ljava/lang/StringBuilder;
    //   770	142	11	$i$a$-checkOrVelocityLibraryException-TagsKt$validateTags$5	I
    //   604	157	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
    //   601	160	9	it$iv$iv	Ljava/lang/Object;
    //   589	324	8	$i$f$buildMessage	I
    //   581	348	7	$i$f$checkOrVelocityLibraryException	I
    //   578	351	6	condition$iv	Z
    //   31	899	3	registeredTagsSet	Ljava/util/Set;
    //   449	481	4	tagNames	Ljava/util/List;
    //   459	471	5	tagNamesSet	Ljava/util/Set;
    //   0	930	0	$this$validateTags	Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;
    //   0	930	1	reservedTagName	Ljava/lang/String;
    //   0	930	2	errorContext	Lkotlin/jvm/functions/Function0;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\validation\TagsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */