package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032R\020\000\032\026\022\f\022\n\022\004\022\0020\003\030\0010\002\022\004\022\0020\0040\001*\b\022\004\022\0020\0030\0022\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\022\020\013\032\016\022\004\022\0020\006\022\004\022\0020\0040\fH\002¨\006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text"})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.kt\nandroidx/compose/ui/text/SynchronizationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n33#3:434\n33#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
public final class FontListFontFamilyTypefaceAdapterKt {
  private static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<Font> $this$firstImmediatelyAvailable, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 createDefaultTypeface) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #5
    //   3: iconst_0
    //   4: istore #6
    //   6: aload_0
    //   7: invokeinterface size : ()I
    //   12: istore #7
    //   14: iload #6
    //   16: iload #7
    //   18: if_icmpge -> 722
    //   21: aload_0
    //   22: iload #6
    //   24: invokeinterface get : (I)Ljava/lang/Object;
    //   29: checkcast androidx/compose/ui/text/font/Font
    //   32: astore #8
    //   34: aload #8
    //   36: invokeinterface getLoadingStrategy-PKNRLFQ : ()I
    //   41: istore #9
    //   43: iload #9
    //   45: getstatic androidx/compose/ui/text/font/FontLoadingStrategy.Companion : Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;
    //   48: invokevirtual getBlocking-PKNRLFQ : ()I
    //   51: invokestatic equals-impl0 : (II)Z
    //   54: ifeq -> 317
    //   57: aload_2
    //   58: astore #12
    //   60: iconst_0
    //   61: istore #13
    //   63: aload #12
    //   65: invokestatic access$getCacheLock$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/SynchronizedObject;
    //   68: astore #14
    //   70: iconst_0
    //   71: istore #15
    //   73: aload #14
    //   75: astore #16
    //   77: aload #16
    //   79: monitorenter
    //   80: nop
    //   81: iconst_0
    //   82: istore #17
    //   84: new androidx/compose/ui/text/font/AsyncTypefaceCache$Key
    //   87: dup
    //   88: aload #8
    //   90: aload_3
    //   91: invokeinterface getCacheKey : ()Ljava/lang/Object;
    //   96: invokespecial <init> : (Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V
    //   99: astore #18
    //   101: aload #12
    //   103: invokestatic access$getResultCache$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/LruCache;
    //   106: aload #18
    //   108: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   111: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
    //   114: dup
    //   115: ifnonnull -> 132
    //   118: pop
    //   119: aload #12
    //   121: invokestatic access$getPermanentCache$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/SimpleArrayMap;
    //   124: aload #18
    //   126: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
    //   132: astore #19
    //   134: aload #19
    //   136: ifnull -> 154
    //   139: aload #19
    //   141: invokevirtual unbox-impl : ()Ljava/lang/Object;
    //   144: astore #20
    //   146: aload #16
    //   148: monitorexit
    //   149: aload #20
    //   151: goto -> 257
    //   154: nop
    //   155: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   158: astore #21
    //   160: aload #16
    //   162: monitorexit
    //   163: goto -> 174
    //   166: astore #21
    //   168: aload #16
    //   170: monitorexit
    //   171: aload #21
    //   173: athrow
    //   174: nop
    //   175: iconst_0
    //   176: istore #22
    //   178: nop
    //   179: aload_3
    //   180: aload #8
    //   182: invokeinterface loadBlocking : (Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;
    //   187: astore #23
    //   189: goto -> 227
    //   192: astore #24
    //   194: new java/lang/IllegalStateException
    //   197: dup
    //   198: new java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: ldc 'Unable to load font '
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: aload #8
    //   212: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: aload #24
    //   220: checkcast java/lang/Throwable
    //   223: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   226: athrow
    //   227: aload #23
    //   229: nop
    //   230: astore #14
    //   232: aload #14
    //   234: astore #15
    //   236: iconst_0
    //   237: istore #16
    //   239: aload #12
    //   241: aload #8
    //   243: aload_3
    //   244: aload #15
    //   246: iconst_0
    //   247: bipush #8
    //   249: aconst_null
    //   250: invokestatic put$default : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;ZILjava/lang/Object;)V
    //   253: nop
    //   254: aload #14
    //   256: nop
    //   257: dup
    //   258: ifnonnull -> 290
    //   261: pop
    //   262: new java/lang/IllegalStateException
    //   265: dup
    //   266: new java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial <init> : ()V
    //   273: ldc 'Unable to load font '
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload #8
    //   280: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   283: invokevirtual toString : ()Ljava/lang/String;
    //   286: invokespecial <init> : (Ljava/lang/String;)V
    //   289: athrow
    //   290: astore #10
    //   292: aload #5
    //   294: aload_1
    //   295: invokevirtual getFontSynthesis-GVVA2EU : ()I
    //   298: aload #10
    //   300: aload #8
    //   302: aload_1
    //   303: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
    //   306: aload_1
    //   307: invokevirtual getFontStyle-_-LCdwA : ()I
    //   310: invokestatic synthesizeTypeface-FxwP2eA : (ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;
    //   313: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   316: areturn
    //   317: iload #9
    //   319: getstatic androidx/compose/ui/text/font/FontLoadingStrategy.Companion : Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;
    //   322: invokevirtual getOptionalLocal-PKNRLFQ : ()I
    //   325: invokestatic equals-impl0 : (II)Z
    //   328: ifeq -> 570
    //   331: aload_2
    //   332: astore #11
    //   334: iconst_0
    //   335: istore #12
    //   337: aload #11
    //   339: invokestatic access$getCacheLock$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/SynchronizedObject;
    //   342: astore #13
    //   344: iconst_0
    //   345: istore #14
    //   347: aload #13
    //   349: astore #15
    //   351: aload #15
    //   353: monitorenter
    //   354: nop
    //   355: iconst_0
    //   356: istore #16
    //   358: new androidx/compose/ui/text/font/AsyncTypefaceCache$Key
    //   361: dup
    //   362: aload #8
    //   364: aload_3
    //   365: invokeinterface getCacheKey : ()Ljava/lang/Object;
    //   370: invokespecial <init> : (Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V
    //   373: astore #17
    //   375: aload #11
    //   377: invokestatic access$getResultCache$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/LruCache;
    //   380: aload #17
    //   382: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   385: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
    //   388: dup
    //   389: ifnonnull -> 406
    //   392: pop
    //   393: aload #11
    //   395: invokestatic access$getPermanentCache$p : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;)Landroidx/compose/ui/text/caches/SimpleArrayMap;
    //   398: aload #17
    //   400: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   403: checkcast androidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult
    //   406: astore #18
    //   408: aload #18
    //   410: ifnull -> 428
    //   413: aload #18
    //   415: invokevirtual unbox-impl : ()Ljava/lang/Object;
    //   418: astore #19
    //   420: aload #15
    //   422: monitorexit
    //   423: aload #19
    //   425: goto -> 538
    //   428: nop
    //   429: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   432: astore #20
    //   434: aload #15
    //   436: monitorexit
    //   437: goto -> 448
    //   440: astore #20
    //   442: aload #15
    //   444: monitorexit
    //   445: aload #20
    //   447: athrow
    //   448: nop
    //   449: iconst_0
    //   450: istore #21
    //   452: nop
    //   453: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   456: pop
    //   457: iconst_0
    //   458: istore #22
    //   460: aload_3
    //   461: aload #8
    //   463: invokeinterface loadBlocking : (Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;
    //   468: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   471: astore #22
    //   473: goto -> 492
    //   476: astore #23
    //   478: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   481: pop
    //   482: aload #23
    //   484: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   487: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   490: astore #22
    //   492: aload #22
    //   494: astore #22
    //   496: aload #22
    //   498: invokestatic isFailure-impl : (Ljava/lang/Object;)Z
    //   501: ifeq -> 508
    //   504: aconst_null
    //   505: goto -> 510
    //   508: aload #22
    //   510: nop
    //   511: astore #13
    //   513: aload #13
    //   515: astore #14
    //   517: iconst_0
    //   518: istore #15
    //   520: aload #11
    //   522: aload #8
    //   524: aload_3
    //   525: aload #14
    //   527: iconst_0
    //   528: bipush #8
    //   530: aconst_null
    //   531: invokestatic put$default : (Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;ZILjava/lang/Object;)V
    //   534: nop
    //   535: aload #13
    //   537: nop
    //   538: astore #10
    //   540: aload #10
    //   542: ifnull -> 716
    //   545: aload #5
    //   547: aload_1
    //   548: invokevirtual getFontSynthesis-GVVA2EU : ()I
    //   551: aload #10
    //   553: aload #8
    //   555: aload_1
    //   556: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
    //   559: aload_1
    //   560: invokevirtual getFontStyle-_-LCdwA : ()I
    //   563: invokestatic synthesizeTypeface-FxwP2eA : (ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;
    //   566: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   569: areturn
    //   570: iload #9
    //   572: getstatic androidx/compose/ui/text/font/FontLoadingStrategy.Companion : Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;
    //   575: invokevirtual getAsync-PKNRLFQ : ()I
    //   578: invokestatic equals-impl0 : (II)Z
    //   581: ifeq -> 688
    //   584: aload_2
    //   585: aload #8
    //   587: aload_3
    //   588: invokevirtual get-1ASDuI8 : (Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   591: astore #10
    //   593: aload #10
    //   595: ifnonnull -> 638
    //   598: aload #5
    //   600: ifnonnull -> 625
    //   603: iconst_1
    //   604: anewarray androidx/compose/ui/text/font/Font
    //   607: astore #11
    //   609: aload #11
    //   611: iconst_0
    //   612: aload #8
    //   614: aastore
    //   615: aload #11
    //   617: invokestatic mutableListOf : ([Ljava/lang/Object;)Ljava/util/List;
    //   620: astore #5
    //   622: goto -> 716
    //   625: aload #5
    //   627: aload #8
    //   629: invokeinterface add : (Ljava/lang/Object;)Z
    //   634: pop
    //   635: goto -> 716
    //   638: aload #10
    //   640: invokevirtual unbox-impl : ()Ljava/lang/Object;
    //   643: invokestatic isPermanentFailure-impl : (Ljava/lang/Object;)Z
    //   646: ifeq -> 652
    //   649: goto -> 716
    //   652: aload #10
    //   654: invokevirtual unbox-impl : ()Ljava/lang/Object;
    //   657: ifnull -> 716
    //   660: aload #5
    //   662: aload_1
    //   663: invokevirtual getFontSynthesis-GVVA2EU : ()I
    //   666: aload #10
    //   668: invokevirtual unbox-impl : ()Ljava/lang/Object;
    //   671: aload #8
    //   673: aload_1
    //   674: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
    //   677: aload_1
    //   678: invokevirtual getFontStyle-_-LCdwA : ()I
    //   681: invokestatic synthesizeTypeface-FxwP2eA : (ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;
    //   684: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   687: areturn
    //   688: new java/lang/IllegalStateException
    //   691: dup
    //   692: new java/lang/StringBuilder
    //   695: dup
    //   696: invokespecial <init> : ()V
    //   699: ldc 'Unknown font type '
    //   701: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: aload #8
    //   706: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   709: invokevirtual toString : ()Ljava/lang/String;
    //   712: invokespecial <init> : (Ljava/lang/String;)V
    //   715: athrow
    //   716: iinc #6, 1
    //   719: goto -> 14
    //   722: aload #4
    //   724: aload_1
    //   725: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   730: astore #6
    //   732: aload #5
    //   734: aload #6
    //   736: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   739: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #184	-> 0
    //   #185	-> 3
    //   #186	-> 21
    //   #187	-> 34
    //   #188	-> 43
    //   #189	-> 57
    //   #433	-> 63
    //   #434	-> 73
    //   #435	-> 84
    //   #436	-> 101
    //   #437	-> 134
    //   #438	-> 139
    //   #440	-> 154
    //   #434	-> 158
    //   #434	-> 174
    //   #441	-> 175
    //   #190	-> 178
    //   #191	-> 179
    //   #192	-> 192
    //   #193	-> 194
    //   #190	-> 229
    //   #441	-> 230
    //   #442	-> 239
    //   #443	-> 253
    //   #441	-> 254
    //   #441	-> 256
    //   #189	-> 257
    //   #195	-> 262
    //   #189	-> 290
    //   #196	-> 292
    //   #197	-> 294
    //   #198	-> 298
    //   #199	-> 300
    //   #200	-> 302
    //   #201	-> 306
    //   #197	-> 310
    //   #196	-> 313
    //   #204	-> 317
    //   #205	-> 331
    //   #444	-> 337
    //   #445	-> 347
    //   #446	-> 358
    //   #447	-> 375
    //   #448	-> 408
    //   #449	-> 413
    //   #451	-> 428
    //   #445	-> 432
    //   #445	-> 448
    //   #452	-> 449
    //   #207	-> 452
    //   #453	-> 457
    //   #207	-> 460
    //   #207	-> 468
    //   #207	-> 496
    //   #207	-> 510
    //   #452	-> 511
    //   #454	-> 520
    //   #455	-> 534
    //   #452	-> 535
    //   #452	-> 537
    //   #205	-> 538
    //   #209	-> 540
    //   #210	-> 545
    //   #211	-> 547
    //   #212	-> 551
    //   #213	-> 553
    //   #214	-> 555
    //   #215	-> 559
    //   #211	-> 563
    //   #210	-> 566
    //   #219	-> 570
    //   #220	-> 584
    //   #221	-> 593
    //   #222	-> 598
    //   #223	-> 603
    //   #225	-> 625
    //   #227	-> 638
    //   #228	-> 649
    //   #229	-> 652
    //   #231	-> 660
    //   #232	-> 662
    //   #233	-> 666
    //   #234	-> 671
    //   #235	-> 673
    //   #236	-> 677
    //   #232	-> 681
    //   #231	-> 684
    //   #240	-> 688
    //   #185	-> 716
    //   #244	-> 722
    //   #245	-> 732
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   194	33	24	cause	Ljava/lang/Exception;
    //   178	52	22	$i$a$-runCachedBlocking-FontListFontFamilyTypefaceAdapterKt$firstImmediatelyAvailable$result$1	I
    //   84	60	17	$i$a$-synchronized-AsyncTypefaceCache$runCachedBlocking$1$iv	I
    //   101	43	18	key$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
    //   134	10	19	priorResult$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   73	71	15	$i$f$synchronized	I
    //   70	74	14	lock$iv$iv	Landroidx/compose/ui/text/SynchronizedObject;
    //   154	21	15	$i$f$synchronized	I
    //   154	21	14	lock$iv$iv	Landroidx/compose/ui/text/SynchronizedObject;
    //   154	1	17	$i$a$-synchronized-AsyncTypefaceCache$runCachedBlocking$1$iv	I
    //   154	1	18	key$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
    //   154	1	19	priorResult$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   239	15	16	$i$a$-also-AsyncTypefaceCache$runCachedBlocking$2$iv	I
    //   236	18	15	it$iv	Ljava/lang/Object;
    //   63	194	13	$i$f$runCachedBlocking	I
    //   60	197	12	this_$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
    //   292	25	10	result	Ljava/lang/Object;
    //   460	8	22	$i$a$-runCatching-FontListFontFamilyTypefaceAdapterKt$firstImmediatelyAvailable$result$2$1	I
    //   452	59	21	$i$a$-runCachedBlocking-FontListFontFamilyTypefaceAdapterKt$firstImmediatelyAvailable$result$2	I
    //   358	60	16	$i$a$-synchronized-AsyncTypefaceCache$runCachedBlocking$1$iv	I
    //   375	43	17	key$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
    //   408	10	18	priorResult$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   347	71	14	$i$f$synchronized	I
    //   344	74	13	lock$iv$iv	Landroidx/compose/ui/text/SynchronizedObject;
    //   428	21	14	$i$f$synchronized	I
    //   428	21	13	lock$iv$iv	Landroidx/compose/ui/text/SynchronizedObject;
    //   428	1	16	$i$a$-synchronized-AsyncTypefaceCache$runCachedBlocking$1$iv	I
    //   428	1	17	key$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;
    //   428	1	18	priorResult$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   520	15	15	$i$a$-also-AsyncTypefaceCache$runCachedBlocking$2$iv	I
    //   517	18	14	it$iv	Ljava/lang/Object;
    //   337	201	12	$i$f$runCachedBlocking	I
    //   334	204	11	this_$iv	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
    //   540	30	10	result	Ljava/lang/Object;
    //   593	95	10	cacheResult	Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;
    //   34	682	8	font	Landroidx/compose/ui/text/font/Font;
    //   6	716	6	idx	I
    //   3	737	5	asyncFontsToLoad	Ljava/util/List;
    //   732	8	6	fallbackTypeface	Ljava/lang/Object;
    //   0	740	0	$this$firstImmediatelyAvailable	Ljava/util/List;
    //   0	740	1	typefaceRequest	Landroidx/compose/ui/text/font/TypefaceRequest;
    //   0	740	2	asyncTypefaceCache	Landroidx/compose/ui/text/font/AsyncTypefaceCache;
    //   0	740	3	platformFontLoader	Landroidx/compose/ui/text/font/PlatformFontLoader;
    //   0	740	4	createDefaultTypeface	Lkotlin/jvm/functions/Function1;
    // Exception table:
    //   from	to	target	type
    //   80	146	166	finally
    //   154	160	166	finally
    //   166	168	166	finally
    //   178	189	192	java/lang/Exception
    //   354	420	440	finally
    //   428	434	440	finally
    //   440	442	440	finally
    //   452	473	476	java/lang/Throwable
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontListFontFamilyTypefaceAdapterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */