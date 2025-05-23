/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlin.sequences.SequenceScope;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\034\n\002\020\b\n\000\n\002\020\t\n\002\b\003\n\002\020\025\n\002\b\t\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020(\n\002\b\005\n\002\020\016\n\002\b\002\b\001\030\000 $2\b\022\004\022\0020\0020\001:\001$B)\b\002\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\002\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ\016\020\n\032\0020\0002\006\020\013\032\0020\000J\016\020\f\032\0020\0002\006\020\013\032\0020\000J\016\020\r\032\0020\0002\006\020\016\032\0020\002J=\020\017\032\0020\0002\006\020\020\032\0020\0002'\020\021\032#\022\023\022\0210\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\004\022\0020\002\022\004\022\0020\0000\022H\bø\001\000J \020\026\032\0020\0272\022\020\030\032\016\022\004\022\0020\002\022\004\022\0020\0270\031H\bø\001\000J\016\020\032\032\0020\0332\006\020\016\032\0020\002J\017\020\034\032\b\022\004\022\0020\0020\035H\002J\016\020\036\032\0020\0022\006\020\037\032\0020\002J\016\020 \032\0020\0002\006\020\013\032\0020\000J\016\020!\032\0020\0002\006\020\016\032\0020\002J\b\020\"\032\0020#H\026R\020\020\007\032\004\030\0010\bX\004¢\006\002\n\000R\016\020\006\032\0020\002X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000\002\007\n\005\b20\001¨\006%"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,382:1\n317#1,28:385\n317#1,28:413\n317#1,28:441\n317#1,28:469\n317#1,28:497\n325#1,20:525\n13330#2,2:383\n1549#3:545\n1620#3,3:546\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n236#1:385,28\n257#1:413,28\n261#1:441,28\n283#1:469,28\n286#1:497,28\n318#1:525,20\n107#1:383,2\n354#1:545\n354#1:546,3\n*E\n"})
/*     */ public final class SnapshotIdSet
/*     */   implements Iterable<Integer>, KMappedMarker
/*     */ {
/*     */   private SnapshotIdSet(long upperSet, long lowerSet, int lowerBound, int[] belowBound) {
/*  42 */     this.upperSet = upperSet;
/*     */     
/*  44 */     this.lowerSet = lowerSet;
/*     */ 
/*     */     
/*  47 */     this.lowerBound = lowerBound;
/*     */     
/*  49 */     this.belowBound = belowBound;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean get(int bit) {
/*  56 */     int offset = bit - this.lowerBound;
/*  57 */     if (offset >= 0 && offset < 64)
/*  58 */       return ((1L << offset & this.lowerSet) != 0L); 
/*  59 */     if (offset >= 64 && offset < 128)
/*  60 */       return ((1L << offset - 64 & this.upperSet) != 0L); 
/*  61 */     if (offset > 0)
/*  62 */       return false; 
/*  63 */     int it[] = this.belowBound, $i$a$-let-SnapshotIdSet$get$1 = 0; return (this.belowBound != null) ? (
/*  64 */       (SnapshotIdSetKt.binarySearch(it, bit) >= 0)) : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet set(int bit) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: aload_0
/*     */     //   2: getfield lowerBound : I
/*     */     //   5: isub
/*     */     //   6: istore_2
/*     */     //   7: iload_2
/*     */     //   8: iflt -> 58
/*     */     //   11: iload_2
/*     */     //   12: bipush #64
/*     */     //   14: if_icmpge -> 58
/*     */     //   17: lconst_1
/*     */     //   18: iload_2
/*     */     //   19: lshl
/*     */     //   20: lstore_3
/*     */     //   21: aload_0
/*     */     //   22: getfield lowerSet : J
/*     */     //   25: lload_3
/*     */     //   26: land
/*     */     //   27: lconst_0
/*     */     //   28: lcmp
/*     */     //   29: ifne -> 540
/*     */     //   32: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   35: dup
/*     */     //   36: aload_0
/*     */     //   37: getfield upperSet : J
/*     */     //   40: aload_0
/*     */     //   41: getfield lowerSet : J
/*     */     //   44: lload_3
/*     */     //   45: lor
/*     */     //   46: aload_0
/*     */     //   47: getfield lowerBound : I
/*     */     //   50: aload_0
/*     */     //   51: getfield belowBound : [I
/*     */     //   54: invokespecial <init> : (JJI[I)V
/*     */     //   57: areturn
/*     */     //   58: iload_2
/*     */     //   59: bipush #64
/*     */     //   61: if_icmplt -> 115
/*     */     //   64: iload_2
/*     */     //   65: sipush #128
/*     */     //   68: if_icmpge -> 115
/*     */     //   71: lconst_1
/*     */     //   72: iload_2
/*     */     //   73: bipush #64
/*     */     //   75: isub
/*     */     //   76: lshl
/*     */     //   77: lstore_3
/*     */     //   78: aload_0
/*     */     //   79: getfield upperSet : J
/*     */     //   82: lload_3
/*     */     //   83: land
/*     */     //   84: lconst_0
/*     */     //   85: lcmp
/*     */     //   86: ifne -> 540
/*     */     //   89: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   92: dup
/*     */     //   93: aload_0
/*     */     //   94: getfield upperSet : J
/*     */     //   97: lload_3
/*     */     //   98: lor
/*     */     //   99: aload_0
/*     */     //   100: getfield lowerSet : J
/*     */     //   103: aload_0
/*     */     //   104: getfield lowerBound : I
/*     */     //   107: aload_0
/*     */     //   108: getfield belowBound : [I
/*     */     //   111: invokespecial <init> : (JJI[I)V
/*     */     //   114: areturn
/*     */     //   115: iload_2
/*     */     //   116: sipush #128
/*     */     //   119: if_icmplt -> 411
/*     */     //   122: aload_0
/*     */     //   123: iload_1
/*     */     //   124: invokevirtual get : (I)Z
/*     */     //   127: ifne -> 540
/*     */     //   130: aload_0
/*     */     //   131: getfield upperSet : J
/*     */     //   134: lstore_3
/*     */     //   135: lconst_0
/*     */     //   136: lstore #21
/*     */     //   138: aload_0
/*     */     //   139: getfield lowerSet : J
/*     */     //   142: lstore #21
/*     */     //   144: iconst_0
/*     */     //   145: istore #6
/*     */     //   147: aload_0
/*     */     //   148: getfield lowerBound : I
/*     */     //   151: istore #6
/*     */     //   153: aconst_null
/*     */     //   154: astore #7
/*     */     //   156: iload_1
/*     */     //   157: iconst_1
/*     */     //   158: iadd
/*     */     //   159: bipush #64
/*     */     //   161: idiv
/*     */     //   162: bipush #64
/*     */     //   164: imul
/*     */     //   165: istore #8
/*     */     //   167: iload #6
/*     */     //   169: iload #8
/*     */     //   171: if_icmpge -> 373
/*     */     //   174: lload #21
/*     */     //   176: lconst_0
/*     */     //   177: lcmp
/*     */     //   178: ifeq -> 342
/*     */     //   181: aload #7
/*     */     //   183: ifnonnull -> 286
/*     */     //   186: new java/util/ArrayList
/*     */     //   189: dup
/*     */     //   190: invokespecial <init> : ()V
/*     */     //   193: checkcast java/util/List
/*     */     //   196: astore #9
/*     */     //   198: aload #9
/*     */     //   200: astore #10
/*     */     //   202: iconst_0
/*     */     //   203: istore #11
/*     */     //   205: aload_0
/*     */     //   206: getfield belowBound : [I
/*     */     //   209: dup
/*     */     //   210: ifnull -> 279
/*     */     //   213: astore #12
/*     */     //   215: iconst_0
/*     */     //   216: istore #13
/*     */     //   218: aload #12
/*     */     //   220: astore #14
/*     */     //   222: iconst_0
/*     */     //   223: istore #15
/*     */     //   225: iconst_0
/*     */     //   226: istore #16
/*     */     //   228: aload #14
/*     */     //   230: arraylength
/*     */     //   231: istore #17
/*     */     //   233: iload #16
/*     */     //   235: iload #17
/*     */     //   237: if_icmpge -> 274
/*     */     //   240: aload #14
/*     */     //   242: iload #16
/*     */     //   244: iaload
/*     */     //   245: istore #18
/*     */     //   247: iload #18
/*     */     //   249: istore #19
/*     */     //   251: iconst_0
/*     */     //   252: istore #20
/*     */     //   254: aload #10
/*     */     //   256: iload #19
/*     */     //   258: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   261: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   266: pop
/*     */     //   267: nop
/*     */     //   268: iinc #16, 1
/*     */     //   271: goto -> 233
/*     */     //   274: nop
/*     */     //   275: nop
/*     */     //   276: goto -> 281
/*     */     //   279: pop
/*     */     //   280: nop
/*     */     //   281: nop
/*     */     //   282: aload #9
/*     */     //   284: astore #7
/*     */     //   286: bipush #64
/*     */     //   288: istore #9
/*     */     //   290: iconst_0
/*     */     //   291: istore #10
/*     */     //   293: iload #10
/*     */     //   295: iload #9
/*     */     //   297: if_icmpge -> 342
/*     */     //   300: iload #10
/*     */     //   302: istore #11
/*     */     //   304: iconst_0
/*     */     //   305: istore #12
/*     */     //   307: lload #21
/*     */     //   309: lconst_1
/*     */     //   310: iload #11
/*     */     //   312: lshl
/*     */     //   313: land
/*     */     //   314: lconst_0
/*     */     //   315: lcmp
/*     */     //   316: ifeq -> 335
/*     */     //   319: aload #7
/*     */     //   321: iload #11
/*     */     //   323: iload #6
/*     */     //   325: iadd
/*     */     //   326: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   329: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   334: pop
/*     */     //   335: nop
/*     */     //   336: iinc #10, 1
/*     */     //   339: goto -> 293
/*     */     //   342: lload_3
/*     */     //   343: lconst_0
/*     */     //   344: lcmp
/*     */     //   345: ifne -> 358
/*     */     //   348: iload #8
/*     */     //   350: istore #6
/*     */     //   352: lconst_0
/*     */     //   353: lstore #21
/*     */     //   355: goto -> 373
/*     */     //   358: lload_3
/*     */     //   359: lstore #21
/*     */     //   361: lconst_0
/*     */     //   362: lstore_3
/*     */     //   363: iload #6
/*     */     //   365: bipush #64
/*     */     //   367: iadd
/*     */     //   368: istore #6
/*     */     //   370: goto -> 167
/*     */     //   373: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   376: dup
/*     */     //   377: lload_3
/*     */     //   378: lload #21
/*     */     //   380: iload #6
/*     */     //   382: aload #7
/*     */     //   384: dup
/*     */     //   385: ifnull -> 398
/*     */     //   388: checkcast java/util/Collection
/*     */     //   391: invokestatic toIntArray : (Ljava/util/Collection;)[I
/*     */     //   394: dup
/*     */     //   395: ifnonnull -> 403
/*     */     //   398: pop
/*     */     //   399: aload_0
/*     */     //   400: getfield belowBound : [I
/*     */     //   403: invokespecial <init> : (JJI[I)V
/*     */     //   406: iload_1
/*     */     //   407: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   410: areturn
/*     */     //   411: aload_0
/*     */     //   412: getfield belowBound : [I
/*     */     //   415: dup
/*     */     //   416: ifnonnull -> 452
/*     */     //   419: pop
/*     */     //   420: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   423: dup
/*     */     //   424: aload_0
/*     */     //   425: getfield upperSet : J
/*     */     //   428: aload_0
/*     */     //   429: getfield lowerSet : J
/*     */     //   432: aload_0
/*     */     //   433: getfield lowerBound : I
/*     */     //   436: iconst_1
/*     */     //   437: newarray int
/*     */     //   439: astore #5
/*     */     //   441: aload #5
/*     */     //   443: iconst_0
/*     */     //   444: iload_1
/*     */     //   445: iastore
/*     */     //   446: aload #5
/*     */     //   448: invokespecial <init> : (JJI[I)V
/*     */     //   451: areturn
/*     */     //   452: astore_3
/*     */     //   453: aload_3
/*     */     //   454: iload_1
/*     */     //   455: invokestatic binarySearch : ([II)I
/*     */     //   458: istore #4
/*     */     //   460: iload #4
/*     */     //   462: ifge -> 540
/*     */     //   465: iload #4
/*     */     //   467: iconst_1
/*     */     //   468: iadd
/*     */     //   469: ineg
/*     */     //   470: istore #5
/*     */     //   472: aload_3
/*     */     //   473: arraylength
/*     */     //   474: iconst_1
/*     */     //   475: iadd
/*     */     //   476: istore #6
/*     */     //   478: iload #6
/*     */     //   480: newarray int
/*     */     //   482: astore #7
/*     */     //   484: aload_3
/*     */     //   485: aload #7
/*     */     //   487: iconst_0
/*     */     //   488: iconst_0
/*     */     //   489: iload #5
/*     */     //   491: invokestatic copyInto : ([I[IIII)[I
/*     */     //   494: pop
/*     */     //   495: aload_3
/*     */     //   496: aload #7
/*     */     //   498: iload #5
/*     */     //   500: iconst_1
/*     */     //   501: iadd
/*     */     //   502: iload #5
/*     */     //   504: iload #6
/*     */     //   506: iconst_1
/*     */     //   507: isub
/*     */     //   508: invokestatic copyInto : ([I[IIII)[I
/*     */     //   511: pop
/*     */     //   512: aload #7
/*     */     //   514: iload #5
/*     */     //   516: iload_1
/*     */     //   517: iastore
/*     */     //   518: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   521: dup
/*     */     //   522: aload_0
/*     */     //   523: getfield upperSet : J
/*     */     //   526: aload_0
/*     */     //   527: getfield lowerSet : J
/*     */     //   530: aload_0
/*     */     //   531: getfield lowerBound : I
/*     */     //   534: aload #7
/*     */     //   536: invokespecial <init> : (JJI[I)V
/*     */     //   539: areturn
/*     */     //   540: aload_0
/*     */     //   541: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 0
/*     */     //   #73	-> 7
/*     */     //   #74	-> 17
/*     */     //   #75	-> 21
/*     */     //   #76	-> 32
/*     */     //   #77	-> 36
/*     */     //   #78	-> 40
/*     */     //   #79	-> 46
/*     */     //   #80	-> 50
/*     */     //   #76	-> 54
/*     */     //   #83	-> 58
/*     */     //   #84	-> 71
/*     */     //   #85	-> 78
/*     */     //   #86	-> 89
/*     */     //   #87	-> 93
/*     */     //   #88	-> 99
/*     */     //   #89	-> 103
/*     */     //   #90	-> 107
/*     */     //   #86	-> 111
/*     */     //   #93	-> 115
/*     */     //   #94	-> 122
/*     */     //   #96	-> 130
/*     */     //   #97	-> 135
/*     */     //   #98	-> 144
/*     */     //   #99	-> 153
/*     */     //   #100	-> 156
/*     */     //   #101	-> 167
/*     */     //   #103	-> 174
/*     */     //   #104	-> 181
/*     */     //   #105	-> 186
/*     */     //   #105	-> 198
/*     */     //   #106	-> 205
/*     */     //   #107	-> 218
/*     */     //   #383	-> 225
/*     */     //   #107	-> 254
/*     */     //   #383	-> 267
/*     */     //   #384	-> 274
/*     */     //   #108	-> 275
/*     */     //   #106	-> 276
/*     */     //   #106	-> 279
/*     */     //   #109	-> 281
/*     */     //   #105	-> 282
/*     */     //   #105	-> 284
/*     */     //   #110	-> 286
/*     */     //   #111	-> 307
/*     */     //   #112	-> 319
/*     */     //   #114	-> 335
/*     */     //   #110	-> 336
/*     */     //   #116	-> 342
/*     */     //   #117	-> 348
/*     */     //   #118	-> 352
/*     */     //   #119	-> 355
/*     */     //   #121	-> 358
/*     */     //   #122	-> 361
/*     */     //   #123	-> 363
/*     */     //   #126	-> 373
/*     */     //   #127	-> 377
/*     */     //   #128	-> 378
/*     */     //   #129	-> 380
/*     */     //   #130	-> 382
/*     */     //   #126	-> 403
/*     */     //   #131	-> 406
/*     */     //   #126	-> 410
/*     */     //   #134	-> 411
/*     */     //   #135	-> 420
/*     */     //   #134	-> 452
/*     */     //   #137	-> 453
/*     */     //   #138	-> 460
/*     */     //   #139	-> 465
/*     */     //   #140	-> 472
/*     */     //   #141	-> 478
/*     */     //   #142	-> 484
/*     */     //   #143	-> 485
/*     */     //   #144	-> 487
/*     */     //   #145	-> 488
/*     */     //   #146	-> 489
/*     */     //   #142	-> 491
/*     */     //   #148	-> 495
/*     */     //   #149	-> 496
/*     */     //   #150	-> 498
/*     */     //   #151	-> 502
/*     */     //   #152	-> 504
/*     */     //   #148	-> 508
/*     */     //   #154	-> 512
/*     */     //   #155	-> 518
/*     */     //   #160	-> 540
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	37	3	mask	J
/*     */     //   78	37	3	mask	J
/*     */     //   254	13	20	$i$a$-forEach-SnapshotIdSet$set$1$1$1	I
/*     */     //   251	16	19	it	I
/*     */     //   247	21	18	element$iv	I
/*     */     //   225	50	15	$i$f$forEach	I
/*     */     //   222	53	14	$this$forEach$iv	[I
/*     */     //   218	58	13	$i$a$-let-SnapshotIdSet$set$1$1	I
/*     */     //   215	61	12	it	[I
/*     */     //   205	77	11	$i$a$-apply-SnapshotIdSet$set$1	I
/*     */     //   202	80	10	$this$set_u24lambda_u243	Ljava/util/List;
/*     */     //   307	29	12	$i$a$-repeat-SnapshotIdSet$set$2	I
/*     */     //   304	32	11	bitOffset	I
/*     */     //   135	276	3	newUpperSet	J
/*     */     //   138	273	21	newLowerSet	J
/*     */     //   147	264	6	newLowerBound	I
/*     */     //   156	255	7	newBelowBound	Ljava/lang/Object;
/*     */     //   167	244	8	targetLowerBound	I
/*     */     //   472	68	5	insertLocation	I
/*     */     //   478	62	6	newSize	I
/*     */     //   484	56	7	newBelowBound	[I
/*     */     //   453	87	3	array	[I
/*     */     //   460	80	4	location	I
/*     */     //   7	535	2	offset	I
/*     */     //   0	542	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	542	1	bit	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet clear(int bit) {
/* 167 */     int offset = bit - this.lowerBound;
/* 168 */     if (offset >= 0 && offset < 64) {
/* 169 */       long mask = 1L << offset;
/* 170 */       if ((this.lowerSet & mask) != 0L) {
/* 171 */         return new SnapshotIdSet(
/* 172 */             this.upperSet, 
/* 173 */             this.lowerSet & (mask ^ 0xFFFFFFFFFFFFFFFFL), 
/* 174 */             this.lowerBound, 
/* 175 */             this.belowBound);
/*     */       }
/*     */     }
/* 178 */     else if (offset >= 64 && offset < 128) {
/* 179 */       long mask = 1L << offset - 64;
/* 180 */       if ((this.upperSet & mask) != 0L) {
/* 181 */         return new SnapshotIdSet(
/* 182 */             this.upperSet & (mask ^ 0xFFFFFFFFFFFFFFFFL), 
/* 183 */             this.lowerSet, 
/* 184 */             this.lowerBound, 
/* 185 */             this.belowBound);
/*     */       }
/*     */     }
/* 188 */     else if (offset < 0) {
/* 189 */       int[] array = this.belowBound;
/* 190 */       if (array != null) {
/* 191 */         int location = SnapshotIdSetKt.binarySearch(array, bit);
/* 192 */         if (location >= 0) {
/* 193 */           int newSize = array.length - 1;
/* 194 */           if (newSize == 0) {
/* 195 */             return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
/*     */           }
/* 197 */           int[] newBelowBound = new int[newSize];
/* 198 */           if (location > 0) {
/* 199 */             ArraysKt.copyInto(array, 
/* 200 */                 newBelowBound, 
/* 201 */                 0, 
/* 202 */                 0, 
/* 203 */                 location);
/*     */           }
/*     */           
/* 206 */           if (location < newSize) {
/* 207 */             ArraysKt.copyInto(array, 
/* 208 */                 newBelowBound, 
/* 209 */                 location, 
/* 210 */                 location + 1, 
/* 211 */                 newSize + 1);
/*     */           }
/*     */           
/* 214 */           return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, newBelowBound);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 219 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet andNot(@NotNull SnapshotIdSet bits) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'bits'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   10: if_acmpne -> 15
/*     */     //   13: aload_0
/*     */     //   14: areturn
/*     */     //   15: aload_0
/*     */     //   16: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   19: if_acmpne -> 26
/*     */     //   22: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   25: areturn
/*     */     //   26: aload_1
/*     */     //   27: getfield lowerBound : I
/*     */     //   30: aload_0
/*     */     //   31: getfield lowerBound : I
/*     */     //   34: if_icmpne -> 92
/*     */     //   37: aload_1
/*     */     //   38: getfield belowBound : [I
/*     */     //   41: aload_0
/*     */     //   42: getfield belowBound : [I
/*     */     //   45: if_acmpne -> 92
/*     */     //   48: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   51: dup
/*     */     //   52: aload_0
/*     */     //   53: getfield upperSet : J
/*     */     //   56: aload_1
/*     */     //   57: getfield upperSet : J
/*     */     //   60: ldc2_w -1
/*     */     //   63: lxor
/*     */     //   64: land
/*     */     //   65: aload_0
/*     */     //   66: getfield lowerSet : J
/*     */     //   69: aload_1
/*     */     //   70: getfield lowerSet : J
/*     */     //   73: ldc2_w -1
/*     */     //   76: lxor
/*     */     //   77: land
/*     */     //   78: aload_0
/*     */     //   79: getfield lowerBound : I
/*     */     //   82: aload_0
/*     */     //   83: getfield belowBound : [I
/*     */     //   86: invokespecial <init> : (JJI[I)V
/*     */     //   89: goto -> 347
/*     */     //   92: aload_1
/*     */     //   93: astore_2
/*     */     //   94: iconst_0
/*     */     //   95: istore_3
/*     */     //   96: aconst_null
/*     */     //   97: astore #4
/*     */     //   99: aload_0
/*     */     //   100: astore #4
/*     */     //   102: aload_2
/*     */     //   103: astore #5
/*     */     //   105: iconst_0
/*     */     //   106: istore #6
/*     */     //   108: aload #5
/*     */     //   110: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   113: astore #7
/*     */     //   115: aload #7
/*     */     //   117: ifnull -> 180
/*     */     //   120: iconst_0
/*     */     //   121: istore #8
/*     */     //   123: aload #7
/*     */     //   125: arraylength
/*     */     //   126: istore #9
/*     */     //   128: iload #8
/*     */     //   130: iload #9
/*     */     //   132: if_icmpge -> 180
/*     */     //   135: aload #7
/*     */     //   137: iload #8
/*     */     //   139: iaload
/*     */     //   140: istore #10
/*     */     //   142: iload #10
/*     */     //   144: istore #11
/*     */     //   146: iconst_0
/*     */     //   147: istore #12
/*     */     //   149: aload #4
/*     */     //   151: iload #11
/*     */     //   153: istore #13
/*     */     //   155: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   158: astore #14
/*     */     //   160: iconst_0
/*     */     //   161: istore #15
/*     */     //   163: aload #14
/*     */     //   165: iload #13
/*     */     //   167: invokevirtual clear : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   170: astore #4
/*     */     //   172: nop
/*     */     //   173: nop
/*     */     //   174: iinc #8, 1
/*     */     //   177: goto -> 128
/*     */     //   180: aload #5
/*     */     //   182: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   185: lconst_0
/*     */     //   186: lcmp
/*     */     //   187: ifeq -> 259
/*     */     //   190: iconst_0
/*     */     //   191: istore #8
/*     */     //   193: iload #8
/*     */     //   195: bipush #64
/*     */     //   197: if_icmpge -> 259
/*     */     //   200: aload #5
/*     */     //   202: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   205: lconst_1
/*     */     //   206: iload #8
/*     */     //   208: lshl
/*     */     //   209: land
/*     */     //   210: lconst_0
/*     */     //   211: lcmp
/*     */     //   212: ifeq -> 253
/*     */     //   215: iload #8
/*     */     //   217: aload #5
/*     */     //   219: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   222: iadd
/*     */     //   223: istore #11
/*     */     //   225: iconst_0
/*     */     //   226: istore #12
/*     */     //   228: aload #4
/*     */     //   230: iload #11
/*     */     //   232: istore #13
/*     */     //   234: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   237: astore #14
/*     */     //   239: iconst_0
/*     */     //   240: istore #15
/*     */     //   242: aload #14
/*     */     //   244: iload #13
/*     */     //   246: invokevirtual clear : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   249: astore #4
/*     */     //   251: nop
/*     */     //   252: nop
/*     */     //   253: iinc #8, 1
/*     */     //   256: goto -> 193
/*     */     //   259: aload #5
/*     */     //   261: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   264: lconst_0
/*     */     //   265: lcmp
/*     */     //   266: ifeq -> 341
/*     */     //   269: iconst_0
/*     */     //   270: istore #8
/*     */     //   272: iload #8
/*     */     //   274: bipush #64
/*     */     //   276: if_icmpge -> 341
/*     */     //   279: aload #5
/*     */     //   281: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   284: lconst_1
/*     */     //   285: iload #8
/*     */     //   287: lshl
/*     */     //   288: land
/*     */     //   289: lconst_0
/*     */     //   290: lcmp
/*     */     //   291: ifeq -> 335
/*     */     //   294: iload #8
/*     */     //   296: bipush #64
/*     */     //   298: iadd
/*     */     //   299: aload #5
/*     */     //   301: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   304: iadd
/*     */     //   305: istore #11
/*     */     //   307: iconst_0
/*     */     //   308: istore #12
/*     */     //   310: aload #4
/*     */     //   312: iload #11
/*     */     //   314: istore #13
/*     */     //   316: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   319: astore #14
/*     */     //   321: iconst_0
/*     */     //   322: istore #15
/*     */     //   324: aload #14
/*     */     //   326: iload #13
/*     */     //   328: invokevirtual clear : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   331: astore #4
/*     */     //   333: nop
/*     */     //   334: nop
/*     */     //   335: iinc #8, 1
/*     */     //   338: goto -> 272
/*     */     //   341: nop
/*     */     //   342: aload #4
/*     */     //   344: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   347: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #226	-> 6
/*     */     //   #227	-> 15
/*     */     //   #228	-> 26
/*     */     //   #229	-> 48
/*     */     //   #230	-> 52
/*     */     //   #231	-> 65
/*     */     //   #232	-> 78
/*     */     //   #233	-> 82
/*     */     //   #229	-> 86
/*     */     //   #236	-> 92
/*     */     //   #385	-> 96
/*     */     //   #386	-> 102
/*     */     //   #393	-> 108
/*     */     //   #394	-> 115
/*     */     //   #395	-> 120
/*     */     //   #396	-> 142
/*     */     //   #387	-> 149
/*     */     //   #236	-> 163
/*     */     //   #387	-> 170
/*     */     //   #388	-> 172
/*     */     //   #396	-> 173
/*     */     //   #395	-> 174
/*     */     //   #398	-> 180
/*     */     //   #399	-> 190
/*     */     //   #400	-> 200
/*     */     //   #401	-> 215
/*     */     //   #387	-> 228
/*     */     //   #236	-> 242
/*     */     //   #387	-> 249
/*     */     //   #388	-> 251
/*     */     //   #401	-> 252
/*     */     //   #399	-> 253
/*     */     //   #405	-> 259
/*     */     //   #406	-> 269
/*     */     //   #407	-> 279
/*     */     //   #408	-> 294
/*     */     //   #387	-> 310
/*     */     //   #236	-> 324
/*     */     //   #387	-> 331
/*     */     //   #388	-> 333
/*     */     //   #408	-> 334
/*     */     //   #406	-> 335
/*     */     //   #412	-> 341
/*     */     //   #389	-> 342
/*     */     //   #228	-> 347
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   163	7	15	$i$a$-fastFold-SnapshotIdSet$andNot$1	I
/*     */     //   160	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   160	10	13	index	I
/*     */     //   242	7	15	$i$a$-fastFold-SnapshotIdSet$andNot$1	I
/*     */     //   239	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   239	10	13	index	I
/*     */     //   324	7	15	$i$a$-fastFold-SnapshotIdSet$andNot$1	I
/*     */     //   321	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   321	10	13	index	I
/*     */     //   149	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   146	27	11	element$iv	I
/*     */     //   228	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   225	27	11	element$iv	I
/*     */     //   310	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   307	27	11	element$iv	I
/*     */     //   142	32	10	element$iv$iv	I
/*     */     //   193	66	8	index$iv$iv	I
/*     */     //   272	69	8	index$iv$iv	I
/*     */     //   108	234	6	$i$f$fastForEach	I
/*     */     //   115	227	7	belowBound$iv$iv	[I
/*     */     //   105	237	5	this_$iv$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   96	251	3	$i$f$fastFold	I
/*     */     //   99	248	4	accumulator$iv	Ljava/lang/Object;
/*     */     //   94	253	2	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	348	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	348	1	bits	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet and(@NotNull SnapshotIdSet bits) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'bits'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   10: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   13: ifeq -> 20
/*     */     //   16: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   19: areturn
/*     */     //   20: aload_0
/*     */     //   21: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   24: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   27: ifeq -> 34
/*     */     //   30: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   33: areturn
/*     */     //   34: aload_1
/*     */     //   35: getfield lowerBound : I
/*     */     //   38: aload_0
/*     */     //   39: getfield lowerBound : I
/*     */     //   42: if_icmpne -> 139
/*     */     //   45: aload_1
/*     */     //   46: getfield belowBound : [I
/*     */     //   49: aload_0
/*     */     //   50: getfield belowBound : [I
/*     */     //   53: if_acmpne -> 139
/*     */     //   56: aload_0
/*     */     //   57: getfield upperSet : J
/*     */     //   60: aload_1
/*     */     //   61: getfield upperSet : J
/*     */     //   64: land
/*     */     //   65: lstore_2
/*     */     //   66: aload_0
/*     */     //   67: getfield lowerSet : J
/*     */     //   70: aload_1
/*     */     //   71: getfield lowerSet : J
/*     */     //   74: land
/*     */     //   75: lstore #4
/*     */     //   77: lload_2
/*     */     //   78: lconst_0
/*     */     //   79: lcmp
/*     */     //   80: ifne -> 103
/*     */     //   83: lload #4
/*     */     //   85: lconst_0
/*     */     //   86: lcmp
/*     */     //   87: ifne -> 103
/*     */     //   90: aload_0
/*     */     //   91: getfield belowBound : [I
/*     */     //   94: ifnonnull -> 103
/*     */     //   97: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   100: goto -> 729
/*     */     //   103: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   106: dup
/*     */     //   107: aload_0
/*     */     //   108: getfield upperSet : J
/*     */     //   111: aload_1
/*     */     //   112: getfield upperSet : J
/*     */     //   115: land
/*     */     //   116: aload_0
/*     */     //   117: getfield lowerSet : J
/*     */     //   120: aload_1
/*     */     //   121: getfield lowerSet : J
/*     */     //   124: land
/*     */     //   125: aload_0
/*     */     //   126: getfield lowerBound : I
/*     */     //   129: aload_0
/*     */     //   130: getfield belowBound : [I
/*     */     //   133: invokespecial <init> : (JJI[I)V
/*     */     //   136: goto -> 729
/*     */     //   139: aload_0
/*     */     //   140: getfield belowBound : [I
/*     */     //   143: ifnonnull -> 439
/*     */     //   146: aload_0
/*     */     //   147: astore_2
/*     */     //   148: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   151: astore_3
/*     */     //   152: iconst_0
/*     */     //   153: istore #4
/*     */     //   155: aconst_null
/*     */     //   156: astore #5
/*     */     //   158: aload_3
/*     */     //   159: astore #5
/*     */     //   161: aload_2
/*     */     //   162: astore #6
/*     */     //   164: iconst_0
/*     */     //   165: istore #7
/*     */     //   167: aload #6
/*     */     //   169: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   172: astore #8
/*     */     //   174: aload #8
/*     */     //   176: ifnull -> 250
/*     */     //   179: iconst_0
/*     */     //   180: istore #9
/*     */     //   182: aload #8
/*     */     //   184: arraylength
/*     */     //   185: istore #10
/*     */     //   187: iload #9
/*     */     //   189: iload #10
/*     */     //   191: if_icmpge -> 250
/*     */     //   194: aload #8
/*     */     //   196: iload #9
/*     */     //   198: iaload
/*     */     //   199: istore #11
/*     */     //   201: iload #11
/*     */     //   203: istore #12
/*     */     //   205: iconst_0
/*     */     //   206: istore #13
/*     */     //   208: aload #5
/*     */     //   210: iload #12
/*     */     //   212: istore #14
/*     */     //   214: astore #15
/*     */     //   216: iconst_0
/*     */     //   217: istore #16
/*     */     //   219: aload_1
/*     */     //   220: iload #14
/*     */     //   222: invokevirtual get : (I)Z
/*     */     //   225: ifeq -> 238
/*     */     //   228: aload #15
/*     */     //   230: iload #14
/*     */     //   232: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   235: goto -> 240
/*     */     //   238: aload #15
/*     */     //   240: astore #5
/*     */     //   242: nop
/*     */     //   243: nop
/*     */     //   244: iinc #9, 1
/*     */     //   247: goto -> 187
/*     */     //   250: aload #6
/*     */     //   252: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   255: lconst_0
/*     */     //   256: lcmp
/*     */     //   257: ifeq -> 340
/*     */     //   260: iconst_0
/*     */     //   261: istore #9
/*     */     //   263: iload #9
/*     */     //   265: bipush #64
/*     */     //   267: if_icmpge -> 340
/*     */     //   270: aload #6
/*     */     //   272: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   275: lconst_1
/*     */     //   276: iload #9
/*     */     //   278: lshl
/*     */     //   279: land
/*     */     //   280: lconst_0
/*     */     //   281: lcmp
/*     */     //   282: ifeq -> 334
/*     */     //   285: iload #9
/*     */     //   287: aload #6
/*     */     //   289: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   292: iadd
/*     */     //   293: istore #12
/*     */     //   295: iconst_0
/*     */     //   296: istore #13
/*     */     //   298: aload #5
/*     */     //   300: iload #12
/*     */     //   302: istore #14
/*     */     //   304: astore #15
/*     */     //   306: iconst_0
/*     */     //   307: istore #16
/*     */     //   309: aload_1
/*     */     //   310: iload #14
/*     */     //   312: invokevirtual get : (I)Z
/*     */     //   315: ifeq -> 328
/*     */     //   318: aload #15
/*     */     //   320: iload #14
/*     */     //   322: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   325: goto -> 330
/*     */     //   328: aload #15
/*     */     //   330: astore #5
/*     */     //   332: nop
/*     */     //   333: nop
/*     */     //   334: iinc #9, 1
/*     */     //   337: goto -> 263
/*     */     //   340: aload #6
/*     */     //   342: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   345: lconst_0
/*     */     //   346: lcmp
/*     */     //   347: ifeq -> 433
/*     */     //   350: iconst_0
/*     */     //   351: istore #9
/*     */     //   353: iload #9
/*     */     //   355: bipush #64
/*     */     //   357: if_icmpge -> 433
/*     */     //   360: aload #6
/*     */     //   362: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   365: lconst_1
/*     */     //   366: iload #9
/*     */     //   368: lshl
/*     */     //   369: land
/*     */     //   370: lconst_0
/*     */     //   371: lcmp
/*     */     //   372: ifeq -> 427
/*     */     //   375: iload #9
/*     */     //   377: bipush #64
/*     */     //   379: iadd
/*     */     //   380: aload #6
/*     */     //   382: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   385: iadd
/*     */     //   386: istore #12
/*     */     //   388: iconst_0
/*     */     //   389: istore #13
/*     */     //   391: aload #5
/*     */     //   393: iload #12
/*     */     //   395: istore #14
/*     */     //   397: astore #15
/*     */     //   399: iconst_0
/*     */     //   400: istore #16
/*     */     //   402: aload_1
/*     */     //   403: iload #14
/*     */     //   405: invokevirtual get : (I)Z
/*     */     //   408: ifeq -> 421
/*     */     //   411: aload #15
/*     */     //   413: iload #14
/*     */     //   415: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   418: goto -> 423
/*     */     //   421: aload #15
/*     */     //   423: astore #5
/*     */     //   425: nop
/*     */     //   426: nop
/*     */     //   427: iinc #9, 1
/*     */     //   430: goto -> 353
/*     */     //   433: nop
/*     */     //   434: aload #5
/*     */     //   436: goto -> 729
/*     */     //   439: aload_1
/*     */     //   440: astore_2
/*     */     //   441: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   444: astore_3
/*     */     //   445: iconst_0
/*     */     //   446: istore #4
/*     */     //   448: aconst_null
/*     */     //   449: astore #5
/*     */     //   451: aload_3
/*     */     //   452: astore #5
/*     */     //   454: aload_2
/*     */     //   455: astore #6
/*     */     //   457: iconst_0
/*     */     //   458: istore #7
/*     */     //   460: aload #6
/*     */     //   462: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   465: astore #8
/*     */     //   467: aload #8
/*     */     //   469: ifnull -> 543
/*     */     //   472: iconst_0
/*     */     //   473: istore #9
/*     */     //   475: aload #8
/*     */     //   477: arraylength
/*     */     //   478: istore #10
/*     */     //   480: iload #9
/*     */     //   482: iload #10
/*     */     //   484: if_icmpge -> 543
/*     */     //   487: aload #8
/*     */     //   489: iload #9
/*     */     //   491: iaload
/*     */     //   492: istore #11
/*     */     //   494: iload #11
/*     */     //   496: istore #12
/*     */     //   498: iconst_0
/*     */     //   499: istore #13
/*     */     //   501: aload #5
/*     */     //   503: iload #12
/*     */     //   505: istore #14
/*     */     //   507: astore #15
/*     */     //   509: iconst_0
/*     */     //   510: istore #16
/*     */     //   512: aload_0
/*     */     //   513: iload #14
/*     */     //   515: invokevirtual get : (I)Z
/*     */     //   518: ifeq -> 531
/*     */     //   521: aload #15
/*     */     //   523: iload #14
/*     */     //   525: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   528: goto -> 533
/*     */     //   531: aload #15
/*     */     //   533: astore #5
/*     */     //   535: nop
/*     */     //   536: nop
/*     */     //   537: iinc #9, 1
/*     */     //   540: goto -> 480
/*     */     //   543: aload #6
/*     */     //   545: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   548: lconst_0
/*     */     //   549: lcmp
/*     */     //   550: ifeq -> 633
/*     */     //   553: iconst_0
/*     */     //   554: istore #9
/*     */     //   556: iload #9
/*     */     //   558: bipush #64
/*     */     //   560: if_icmpge -> 633
/*     */     //   563: aload #6
/*     */     //   565: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   568: lconst_1
/*     */     //   569: iload #9
/*     */     //   571: lshl
/*     */     //   572: land
/*     */     //   573: lconst_0
/*     */     //   574: lcmp
/*     */     //   575: ifeq -> 627
/*     */     //   578: iload #9
/*     */     //   580: aload #6
/*     */     //   582: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   585: iadd
/*     */     //   586: istore #12
/*     */     //   588: iconst_0
/*     */     //   589: istore #13
/*     */     //   591: aload #5
/*     */     //   593: iload #12
/*     */     //   595: istore #14
/*     */     //   597: astore #15
/*     */     //   599: iconst_0
/*     */     //   600: istore #16
/*     */     //   602: aload_0
/*     */     //   603: iload #14
/*     */     //   605: invokevirtual get : (I)Z
/*     */     //   608: ifeq -> 621
/*     */     //   611: aload #15
/*     */     //   613: iload #14
/*     */     //   615: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   618: goto -> 623
/*     */     //   621: aload #15
/*     */     //   623: astore #5
/*     */     //   625: nop
/*     */     //   626: nop
/*     */     //   627: iinc #9, 1
/*     */     //   630: goto -> 556
/*     */     //   633: aload #6
/*     */     //   635: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   638: lconst_0
/*     */     //   639: lcmp
/*     */     //   640: ifeq -> 726
/*     */     //   643: iconst_0
/*     */     //   644: istore #9
/*     */     //   646: iload #9
/*     */     //   648: bipush #64
/*     */     //   650: if_icmpge -> 726
/*     */     //   653: aload #6
/*     */     //   655: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   658: lconst_1
/*     */     //   659: iload #9
/*     */     //   661: lshl
/*     */     //   662: land
/*     */     //   663: lconst_0
/*     */     //   664: lcmp
/*     */     //   665: ifeq -> 720
/*     */     //   668: iload #9
/*     */     //   670: bipush #64
/*     */     //   672: iadd
/*     */     //   673: aload #6
/*     */     //   675: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   678: iadd
/*     */     //   679: istore #12
/*     */     //   681: iconst_0
/*     */     //   682: istore #13
/*     */     //   684: aload #5
/*     */     //   686: iload #12
/*     */     //   688: istore #14
/*     */     //   690: astore #15
/*     */     //   692: iconst_0
/*     */     //   693: istore #16
/*     */     //   695: aload_0
/*     */     //   696: iload #14
/*     */     //   698: invokevirtual get : (I)Z
/*     */     //   701: ifeq -> 714
/*     */     //   704: aload #15
/*     */     //   706: iload #14
/*     */     //   708: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   711: goto -> 716
/*     */     //   714: aload #15
/*     */     //   716: astore #5
/*     */     //   718: nop
/*     */     //   719: nop
/*     */     //   720: iinc #9, 1
/*     */     //   723: goto -> 646
/*     */     //   726: nop
/*     */     //   727: aload #5
/*     */     //   729: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #241	-> 6
/*     */     //   #242	-> 20
/*     */     //   #243	-> 34
/*     */     //   #244	-> 56
/*     */     //   #245	-> 66
/*     */     //   #246	-> 77
/*     */     //   #247	-> 97
/*     */     //   #249	-> 103
/*     */     //   #250	-> 107
/*     */     //   #251	-> 116
/*     */     //   #252	-> 125
/*     */     //   #253	-> 129
/*     */     //   #249	-> 133
/*     */     //   #256	-> 139
/*     */     //   #257	-> 146
/*     */     //   #413	-> 155
/*     */     //   #414	-> 161
/*     */     //   #421	-> 167
/*     */     //   #422	-> 174
/*     */     //   #423	-> 179
/*     */     //   #424	-> 201
/*     */     //   #415	-> 208
/*     */     //   #258	-> 219
/*     */     //   #415	-> 240
/*     */     //   #416	-> 242
/*     */     //   #424	-> 243
/*     */     //   #423	-> 244
/*     */     //   #426	-> 250
/*     */     //   #427	-> 260
/*     */     //   #428	-> 270
/*     */     //   #429	-> 285
/*     */     //   #415	-> 298
/*     */     //   #258	-> 309
/*     */     //   #415	-> 330
/*     */     //   #416	-> 332
/*     */     //   #429	-> 333
/*     */     //   #427	-> 334
/*     */     //   #433	-> 340
/*     */     //   #434	-> 350
/*     */     //   #435	-> 360
/*     */     //   #436	-> 375
/*     */     //   #415	-> 391
/*     */     //   #258	-> 402
/*     */     //   #415	-> 423
/*     */     //   #416	-> 425
/*     */     //   #436	-> 426
/*     */     //   #434	-> 427
/*     */     //   #440	-> 433
/*     */     //   #417	-> 434
/*     */     //   #261	-> 439
/*     */     //   #441	-> 448
/*     */     //   #442	-> 454
/*     */     //   #449	-> 460
/*     */     //   #450	-> 467
/*     */     //   #451	-> 472
/*     */     //   #452	-> 494
/*     */     //   #443	-> 501
/*     */     //   #262	-> 512
/*     */     //   #443	-> 533
/*     */     //   #444	-> 535
/*     */     //   #452	-> 536
/*     */     //   #451	-> 537
/*     */     //   #454	-> 543
/*     */     //   #455	-> 553
/*     */     //   #456	-> 563
/*     */     //   #457	-> 578
/*     */     //   #443	-> 591
/*     */     //   #262	-> 602
/*     */     //   #443	-> 623
/*     */     //   #444	-> 625
/*     */     //   #457	-> 626
/*     */     //   #455	-> 627
/*     */     //   #461	-> 633
/*     */     //   #462	-> 643
/*     */     //   #463	-> 653
/*     */     //   #464	-> 668
/*     */     //   #443	-> 684
/*     */     //   #262	-> 695
/*     */     //   #443	-> 716
/*     */     //   #444	-> 718
/*     */     //   #464	-> 719
/*     */     //   #462	-> 720
/*     */     //   #468	-> 726
/*     */     //   #445	-> 727
/*     */     //   #243	-> 729
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   66	70	2	newUpper	J
/*     */     //   77	59	4	newLower	J
/*     */     //   219	21	16	$i$a$-fastFold-SnapshotIdSet$and$1	I
/*     */     //   216	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   216	24	14	index	I
/*     */     //   309	21	16	$i$a$-fastFold-SnapshotIdSet$and$1	I
/*     */     //   306	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   306	24	14	index	I
/*     */     //   402	21	16	$i$a$-fastFold-SnapshotIdSet$and$1	I
/*     */     //   399	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   399	24	14	index	I
/*     */     //   208	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   205	38	12	element$iv	I
/*     */     //   298	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   295	38	12	element$iv	I
/*     */     //   391	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   388	38	12	element$iv	I
/*     */     //   201	43	11	element$iv$iv	I
/*     */     //   263	77	9	index$iv$iv	I
/*     */     //   353	80	9	index$iv$iv	I
/*     */     //   167	267	7	$i$f$fastForEach	I
/*     */     //   174	260	8	belowBound$iv$iv	[I
/*     */     //   164	270	6	this_$iv$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   155	281	4	$i$f$fastFold	I
/*     */     //   158	278	5	accumulator$iv	Ljava/lang/Object;
/*     */     //   152	284	2	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   152	284	3	initial$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   512	21	16	$i$a$-fastFold-SnapshotIdSet$and$2	I
/*     */     //   509	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   509	24	14	index	I
/*     */     //   602	21	16	$i$a$-fastFold-SnapshotIdSet$and$2	I
/*     */     //   599	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   599	24	14	index	I
/*     */     //   695	21	16	$i$a$-fastFold-SnapshotIdSet$and$2	I
/*     */     //   692	24	15	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   692	24	14	index	I
/*     */     //   501	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   498	38	12	element$iv	I
/*     */     //   591	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   588	38	12	element$iv	I
/*     */     //   684	35	13	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   681	38	12	element$iv	I
/*     */     //   494	43	11	element$iv$iv	I
/*     */     //   556	77	9	index$iv$iv	I
/*     */     //   646	80	9	index$iv$iv	I
/*     */     //   460	267	7	$i$f$fastForEach	I
/*     */     //   467	260	8	belowBound$iv$iv	[I
/*     */     //   457	270	6	this_$iv$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   448	281	4	$i$f$fastFold	I
/*     */     //   451	278	5	accumulator$iv	Ljava/lang/Object;
/*     */     //   445	284	2	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   445	284	3	initial$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	730	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	730	1	bits	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet or(@NotNull SnapshotIdSet bits) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'bits'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   10: if_acmpne -> 15
/*     */     //   13: aload_0
/*     */     //   14: areturn
/*     */     //   15: aload_0
/*     */     //   16: getstatic androidx/compose/runtime/snapshots/SnapshotIdSet.EMPTY : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   19: if_acmpne -> 24
/*     */     //   22: aload_1
/*     */     //   23: areturn
/*     */     //   24: aload_1
/*     */     //   25: getfield lowerBound : I
/*     */     //   28: aload_0
/*     */     //   29: getfield lowerBound : I
/*     */     //   32: if_icmpne -> 82
/*     */     //   35: aload_1
/*     */     //   36: getfield belowBound : [I
/*     */     //   39: aload_0
/*     */     //   40: getfield belowBound : [I
/*     */     //   43: if_acmpne -> 82
/*     */     //   46: new androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   49: dup
/*     */     //   50: aload_0
/*     */     //   51: getfield upperSet : J
/*     */     //   54: aload_1
/*     */     //   55: getfield upperSet : J
/*     */     //   58: lor
/*     */     //   59: aload_0
/*     */     //   60: getfield lowerSet : J
/*     */     //   63: aload_1
/*     */     //   64: getfield lowerSet : J
/*     */     //   67: lor
/*     */     //   68: aload_0
/*     */     //   69: getfield lowerBound : I
/*     */     //   72: aload_0
/*     */     //   73: getfield belowBound : [I
/*     */     //   76: invokespecial <init> : (JJI[I)V
/*     */     //   79: goto -> 590
/*     */     //   82: aload_0
/*     */     //   83: getfield belowBound : [I
/*     */     //   86: ifnonnull -> 335
/*     */     //   89: aload_0
/*     */     //   90: astore_2
/*     */     //   91: iconst_0
/*     */     //   92: istore_3
/*     */     //   93: aconst_null
/*     */     //   94: astore #4
/*     */     //   96: aload_1
/*     */     //   97: astore #4
/*     */     //   99: aload_2
/*     */     //   100: astore #5
/*     */     //   102: iconst_0
/*     */     //   103: istore #6
/*     */     //   105: aload #5
/*     */     //   107: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   110: astore #7
/*     */     //   112: aload #7
/*     */     //   114: ifnull -> 174
/*     */     //   117: iconst_0
/*     */     //   118: istore #8
/*     */     //   120: aload #7
/*     */     //   122: arraylength
/*     */     //   123: istore #9
/*     */     //   125: iload #8
/*     */     //   127: iload #9
/*     */     //   129: if_icmpge -> 174
/*     */     //   132: aload #7
/*     */     //   134: iload #8
/*     */     //   136: iaload
/*     */     //   137: istore #10
/*     */     //   139: iload #10
/*     */     //   141: istore #11
/*     */     //   143: iconst_0
/*     */     //   144: istore #12
/*     */     //   146: aload #4
/*     */     //   148: iload #11
/*     */     //   150: istore #13
/*     */     //   152: astore #14
/*     */     //   154: iconst_0
/*     */     //   155: istore #15
/*     */     //   157: aload #14
/*     */     //   159: iload #13
/*     */     //   161: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   164: astore #4
/*     */     //   166: nop
/*     */     //   167: nop
/*     */     //   168: iinc #8, 1
/*     */     //   171: goto -> 125
/*     */     //   174: aload #5
/*     */     //   176: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   179: lconst_0
/*     */     //   180: lcmp
/*     */     //   181: ifeq -> 250
/*     */     //   184: iconst_0
/*     */     //   185: istore #8
/*     */     //   187: iload #8
/*     */     //   189: bipush #64
/*     */     //   191: if_icmpge -> 250
/*     */     //   194: aload #5
/*     */     //   196: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   199: lconst_1
/*     */     //   200: iload #8
/*     */     //   202: lshl
/*     */     //   203: land
/*     */     //   204: lconst_0
/*     */     //   205: lcmp
/*     */     //   206: ifeq -> 244
/*     */     //   209: iload #8
/*     */     //   211: aload #5
/*     */     //   213: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   216: iadd
/*     */     //   217: istore #11
/*     */     //   219: iconst_0
/*     */     //   220: istore #12
/*     */     //   222: aload #4
/*     */     //   224: iload #11
/*     */     //   226: istore #13
/*     */     //   228: astore #14
/*     */     //   230: iconst_0
/*     */     //   231: istore #15
/*     */     //   233: aload #14
/*     */     //   235: iload #13
/*     */     //   237: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   240: astore #4
/*     */     //   242: nop
/*     */     //   243: nop
/*     */     //   244: iinc #8, 1
/*     */     //   247: goto -> 187
/*     */     //   250: aload #5
/*     */     //   252: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   255: lconst_0
/*     */     //   256: lcmp
/*     */     //   257: ifeq -> 329
/*     */     //   260: iconst_0
/*     */     //   261: istore #8
/*     */     //   263: iload #8
/*     */     //   265: bipush #64
/*     */     //   267: if_icmpge -> 329
/*     */     //   270: aload #5
/*     */     //   272: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   275: lconst_1
/*     */     //   276: iload #8
/*     */     //   278: lshl
/*     */     //   279: land
/*     */     //   280: lconst_0
/*     */     //   281: lcmp
/*     */     //   282: ifeq -> 323
/*     */     //   285: iload #8
/*     */     //   287: bipush #64
/*     */     //   289: iadd
/*     */     //   290: aload #5
/*     */     //   292: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   295: iadd
/*     */     //   296: istore #11
/*     */     //   298: iconst_0
/*     */     //   299: istore #12
/*     */     //   301: aload #4
/*     */     //   303: iload #11
/*     */     //   305: istore #13
/*     */     //   307: astore #14
/*     */     //   309: iconst_0
/*     */     //   310: istore #15
/*     */     //   312: aload #14
/*     */     //   314: iload #13
/*     */     //   316: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   319: astore #4
/*     */     //   321: nop
/*     */     //   322: nop
/*     */     //   323: iinc #8, 1
/*     */     //   326: goto -> 263
/*     */     //   329: nop
/*     */     //   330: aload #4
/*     */     //   332: goto -> 590
/*     */     //   335: aload_1
/*     */     //   336: astore_2
/*     */     //   337: iconst_0
/*     */     //   338: istore_3
/*     */     //   339: aconst_null
/*     */     //   340: astore #4
/*     */     //   342: aload_0
/*     */     //   343: astore #4
/*     */     //   345: aload_2
/*     */     //   346: astore #5
/*     */     //   348: iconst_0
/*     */     //   349: istore #6
/*     */     //   351: aload #5
/*     */     //   353: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   356: astore #7
/*     */     //   358: aload #7
/*     */     //   360: ifnull -> 423
/*     */     //   363: iconst_0
/*     */     //   364: istore #8
/*     */     //   366: aload #7
/*     */     //   368: arraylength
/*     */     //   369: istore #9
/*     */     //   371: iload #8
/*     */     //   373: iload #9
/*     */     //   375: if_icmpge -> 423
/*     */     //   378: aload #7
/*     */     //   380: iload #8
/*     */     //   382: iaload
/*     */     //   383: istore #10
/*     */     //   385: iload #10
/*     */     //   387: istore #11
/*     */     //   389: iconst_0
/*     */     //   390: istore #12
/*     */     //   392: aload #4
/*     */     //   394: iload #11
/*     */     //   396: istore #13
/*     */     //   398: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   401: astore #14
/*     */     //   403: iconst_0
/*     */     //   404: istore #15
/*     */     //   406: aload #14
/*     */     //   408: iload #13
/*     */     //   410: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   413: astore #4
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: iinc #8, 1
/*     */     //   420: goto -> 371
/*     */     //   423: aload #5
/*     */     //   425: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   428: lconst_0
/*     */     //   429: lcmp
/*     */     //   430: ifeq -> 502
/*     */     //   433: iconst_0
/*     */     //   434: istore #8
/*     */     //   436: iload #8
/*     */     //   438: bipush #64
/*     */     //   440: if_icmpge -> 502
/*     */     //   443: aload #5
/*     */     //   445: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   448: lconst_1
/*     */     //   449: iload #8
/*     */     //   451: lshl
/*     */     //   452: land
/*     */     //   453: lconst_0
/*     */     //   454: lcmp
/*     */     //   455: ifeq -> 496
/*     */     //   458: iload #8
/*     */     //   460: aload #5
/*     */     //   462: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   465: iadd
/*     */     //   466: istore #11
/*     */     //   468: iconst_0
/*     */     //   469: istore #12
/*     */     //   471: aload #4
/*     */     //   473: iload #11
/*     */     //   475: istore #13
/*     */     //   477: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   480: astore #14
/*     */     //   482: iconst_0
/*     */     //   483: istore #15
/*     */     //   485: aload #14
/*     */     //   487: iload #13
/*     */     //   489: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   492: astore #4
/*     */     //   494: nop
/*     */     //   495: nop
/*     */     //   496: iinc #8, 1
/*     */     //   499: goto -> 436
/*     */     //   502: aload #5
/*     */     //   504: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   507: lconst_0
/*     */     //   508: lcmp
/*     */     //   509: ifeq -> 584
/*     */     //   512: iconst_0
/*     */     //   513: istore #8
/*     */     //   515: iload #8
/*     */     //   517: bipush #64
/*     */     //   519: if_icmpge -> 584
/*     */     //   522: aload #5
/*     */     //   524: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   527: lconst_1
/*     */     //   528: iload #8
/*     */     //   530: lshl
/*     */     //   531: land
/*     */     //   532: lconst_0
/*     */     //   533: lcmp
/*     */     //   534: ifeq -> 578
/*     */     //   537: iload #8
/*     */     //   539: bipush #64
/*     */     //   541: iadd
/*     */     //   542: aload #5
/*     */     //   544: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   547: iadd
/*     */     //   548: istore #11
/*     */     //   550: iconst_0
/*     */     //   551: istore #12
/*     */     //   553: aload #4
/*     */     //   555: iload #11
/*     */     //   557: istore #13
/*     */     //   559: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   562: astore #14
/*     */     //   564: iconst_0
/*     */     //   565: istore #15
/*     */     //   567: aload #14
/*     */     //   569: iload #13
/*     */     //   571: invokevirtual set : (I)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   574: astore #4
/*     */     //   576: nop
/*     */     //   577: nop
/*     */     //   578: iinc #8, 1
/*     */     //   581: goto -> 515
/*     */     //   584: nop
/*     */     //   585: aload #4
/*     */     //   587: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   590: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #271	-> 6
/*     */     //   #272	-> 15
/*     */     //   #273	-> 24
/*     */     //   #274	-> 46
/*     */     //   #275	-> 50
/*     */     //   #276	-> 59
/*     */     //   #277	-> 68
/*     */     //   #278	-> 72
/*     */     //   #274	-> 76
/*     */     //   #281	-> 82
/*     */     //   #283	-> 89
/*     */     //   #469	-> 93
/*     */     //   #470	-> 99
/*     */     //   #477	-> 105
/*     */     //   #478	-> 112
/*     */     //   #479	-> 117
/*     */     //   #480	-> 139
/*     */     //   #471	-> 146
/*     */     //   #283	-> 157
/*     */     //   #471	-> 164
/*     */     //   #472	-> 166
/*     */     //   #480	-> 167
/*     */     //   #479	-> 168
/*     */     //   #482	-> 174
/*     */     //   #483	-> 184
/*     */     //   #484	-> 194
/*     */     //   #485	-> 209
/*     */     //   #471	-> 222
/*     */     //   #283	-> 233
/*     */     //   #471	-> 240
/*     */     //   #472	-> 242
/*     */     //   #485	-> 243
/*     */     //   #483	-> 244
/*     */     //   #489	-> 250
/*     */     //   #490	-> 260
/*     */     //   #491	-> 270
/*     */     //   #492	-> 285
/*     */     //   #471	-> 301
/*     */     //   #283	-> 312
/*     */     //   #471	-> 319
/*     */     //   #472	-> 321
/*     */     //   #492	-> 322
/*     */     //   #490	-> 323
/*     */     //   #496	-> 329
/*     */     //   #473	-> 330
/*     */     //   #286	-> 335
/*     */     //   #497	-> 339
/*     */     //   #498	-> 345
/*     */     //   #505	-> 351
/*     */     //   #506	-> 358
/*     */     //   #507	-> 363
/*     */     //   #508	-> 385
/*     */     //   #499	-> 392
/*     */     //   #286	-> 406
/*     */     //   #499	-> 413
/*     */     //   #500	-> 415
/*     */     //   #508	-> 416
/*     */     //   #507	-> 417
/*     */     //   #510	-> 423
/*     */     //   #511	-> 433
/*     */     //   #512	-> 443
/*     */     //   #513	-> 458
/*     */     //   #499	-> 471
/*     */     //   #286	-> 485
/*     */     //   #499	-> 492
/*     */     //   #500	-> 494
/*     */     //   #513	-> 495
/*     */     //   #511	-> 496
/*     */     //   #517	-> 502
/*     */     //   #518	-> 512
/*     */     //   #519	-> 522
/*     */     //   #520	-> 537
/*     */     //   #499	-> 553
/*     */     //   #286	-> 567
/*     */     //   #499	-> 574
/*     */     //   #500	-> 576
/*     */     //   #520	-> 577
/*     */     //   #518	-> 578
/*     */     //   #524	-> 584
/*     */     //   #501	-> 585
/*     */     //   #273	-> 590
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   157	7	15	$i$a$-fastFold-SnapshotIdSet$or$1	I
/*     */     //   154	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   154	10	13	index	I
/*     */     //   233	7	15	$i$a$-fastFold-SnapshotIdSet$or$1	I
/*     */     //   230	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   230	10	13	index	I
/*     */     //   312	7	15	$i$a$-fastFold-SnapshotIdSet$or$1	I
/*     */     //   309	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   309	10	13	index	I
/*     */     //   146	21	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   143	24	11	element$iv	I
/*     */     //   222	21	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   219	24	11	element$iv	I
/*     */     //   301	21	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   298	24	11	element$iv	I
/*     */     //   139	29	10	element$iv$iv	I
/*     */     //   187	63	8	index$iv$iv	I
/*     */     //   263	66	8	index$iv$iv	I
/*     */     //   105	225	6	$i$f$fastForEach	I
/*     */     //   112	218	7	belowBound$iv$iv	[I
/*     */     //   102	228	5	this_$iv$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   93	239	3	$i$f$fastFold	I
/*     */     //   96	236	4	accumulator$iv	Ljava/lang/Object;
/*     */     //   91	241	2	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   406	7	15	$i$a$-fastFold-SnapshotIdSet$or$2	I
/*     */     //   403	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   403	10	13	index	I
/*     */     //   485	7	15	$i$a$-fastFold-SnapshotIdSet$or$2	I
/*     */     //   482	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   482	10	13	index	I
/*     */     //   567	7	15	$i$a$-fastFold-SnapshotIdSet$or$2	I
/*     */     //   564	10	14	previous	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   564	10	13	index	I
/*     */     //   392	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   389	27	11	element$iv	I
/*     */     //   471	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   468	27	11	element$iv	I
/*     */     //   553	24	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1$iv	I
/*     */     //   550	27	11	element$iv	I
/*     */     //   385	32	10	element$iv$iv	I
/*     */     //   436	66	8	index$iv$iv	I
/*     */     //   515	69	8	index$iv$iv	I
/*     */     //   351	234	6	$i$f$fastForEach	I
/*     */     //   358	227	7	belowBound$iv$iv	[I
/*     */     //   348	237	5	this_$iv$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   339	251	3	$i$f$fastFold	I
/*     */     //   342	248	4	accumulator$iv	Ljava/lang/Object;
/*     */     //   337	253	2	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	591	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	591	1	bits	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "SnapshotIdSet.kt", l = {295, 300, 307}, i = {0, 0, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"}, n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, m = "invokeSuspend", c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\b\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
/*     */   static final class SnapshotIdSet$iterator$1
/*     */     extends RestrictedSuspendLambda
/*     */     implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object>
/*     */   {
/*     */     Object L$1;
/*     */ 
/*     */ 
/*     */     
/*     */     int I$0;
/*     */ 
/*     */ 
/*     */     
/*     */     int I$1;
/*     */ 
/*     */ 
/*     */     
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SnapshotIdSet$iterator$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 412, 0 -> 40, 1 -> 133, 2 -> 263, 3 -> 382
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: aload_0
/*     */       //   45: getfield L$0 : Ljava/lang/Object;
/*     */       //   48: checkcast kotlin/sequences/SequenceScope
/*     */       //   51: astore_2
/*     */       //   52: aload_0
/*     */       //   53: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   56: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */       //   59: astore_3
/*     */       //   60: aload_3
/*     */       //   61: ifnull -> 173
/*     */       //   64: iconst_0
/*     */       //   65: istore #4
/*     */       //   67: aload_3
/*     */       //   68: arraylength
/*     */       //   69: istore #5
/*     */       //   71: iload #4
/*     */       //   73: iload #5
/*     */       //   75: if_icmpge -> 173
/*     */       //   78: aload_3
/*     */       //   79: iload #4
/*     */       //   81: iaload
/*     */       //   82: istore #6
/*     */       //   84: aload_2
/*     */       //   85: iload #6
/*     */       //   87: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */       //   90: aload_0
/*     */       //   91: checkcast kotlin/coroutines/Continuation
/*     */       //   94: aload_0
/*     */       //   95: aload_2
/*     */       //   96: putfield L$0 : Ljava/lang/Object;
/*     */       //   99: aload_0
/*     */       //   100: aload_3
/*     */       //   101: putfield L$1 : Ljava/lang/Object;
/*     */       //   104: aload_0
/*     */       //   105: iload #4
/*     */       //   107: putfield I$0 : I
/*     */       //   110: aload_0
/*     */       //   111: iload #5
/*     */       //   113: putfield I$1 : I
/*     */       //   116: aload_0
/*     */       //   117: iconst_1
/*     */       //   118: putfield label : I
/*     */       //   121: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   124: dup
/*     */       //   125: aload #7
/*     */       //   127: if_acmpne -> 166
/*     */       //   130: aload #7
/*     */       //   132: areturn
/*     */       //   133: aload_0
/*     */       //   134: getfield I$1 : I
/*     */       //   137: istore #5
/*     */       //   139: aload_0
/*     */       //   140: getfield I$0 : I
/*     */       //   143: istore #4
/*     */       //   145: aload_0
/*     */       //   146: getfield L$1 : Ljava/lang/Object;
/*     */       //   149: checkcast [I
/*     */       //   152: astore_3
/*     */       //   153: aload_0
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast kotlin/sequences/SequenceScope
/*     */       //   160: astore_2
/*     */       //   161: aload_1
/*     */       //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   165: aload_1
/*     */       //   166: pop
/*     */       //   167: iinc #4, 1
/*     */       //   170: goto -> 71
/*     */       //   173: aload_0
/*     */       //   174: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   177: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */       //   180: lconst_0
/*     */       //   181: lcmp
/*     */       //   182: ifeq -> 289
/*     */       //   185: iconst_0
/*     */       //   186: istore #4
/*     */       //   188: iload #4
/*     */       //   190: bipush #64
/*     */       //   192: if_icmpge -> 289
/*     */       //   195: aload_0
/*     */       //   196: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   199: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */       //   202: lconst_1
/*     */       //   203: iload #4
/*     */       //   205: lshl
/*     */       //   206: land
/*     */       //   207: lconst_0
/*     */       //   208: lcmp
/*     */       //   209: ifeq -> 283
/*     */       //   212: aload_2
/*     */       //   213: iload #4
/*     */       //   215: aload_0
/*     */       //   216: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   219: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */       //   222: iadd
/*     */       //   223: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */       //   226: aload_0
/*     */       //   227: checkcast kotlin/coroutines/Continuation
/*     */       //   230: aload_0
/*     */       //   231: aload_2
/*     */       //   232: putfield L$0 : Ljava/lang/Object;
/*     */       //   235: aload_0
/*     */       //   236: aconst_null
/*     */       //   237: putfield L$1 : Ljava/lang/Object;
/*     */       //   240: aload_0
/*     */       //   241: iload #4
/*     */       //   243: putfield I$0 : I
/*     */       //   246: aload_0
/*     */       //   247: iconst_2
/*     */       //   248: putfield label : I
/*     */       //   251: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   254: dup
/*     */       //   255: aload #7
/*     */       //   257: if_acmpne -> 282
/*     */       //   260: aload #7
/*     */       //   262: areturn
/*     */       //   263: aload_0
/*     */       //   264: getfield I$0 : I
/*     */       //   267: istore #4
/*     */       //   269: aload_0
/*     */       //   270: getfield L$0 : Ljava/lang/Object;
/*     */       //   273: checkcast kotlin/sequences/SequenceScope
/*     */       //   276: astore_2
/*     */       //   277: aload_1
/*     */       //   278: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   281: aload_1
/*     */       //   282: pop
/*     */       //   283: iinc #4, 1
/*     */       //   286: goto -> 188
/*     */       //   289: aload_0
/*     */       //   290: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   293: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */       //   296: lconst_0
/*     */       //   297: lcmp
/*     */       //   298: ifeq -> 408
/*     */       //   301: iconst_0
/*     */       //   302: istore #4
/*     */       //   304: iload #4
/*     */       //   306: bipush #64
/*     */       //   308: if_icmpge -> 408
/*     */       //   311: aload_0
/*     */       //   312: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   315: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */       //   318: lconst_1
/*     */       //   319: iload #4
/*     */       //   321: lshl
/*     */       //   322: land
/*     */       //   323: lconst_0
/*     */       //   324: lcmp
/*     */       //   325: ifeq -> 402
/*     */       //   328: aload_2
/*     */       //   329: iload #4
/*     */       //   331: bipush #64
/*     */       //   333: iadd
/*     */       //   334: aload_0
/*     */       //   335: getfield this$0 : Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */       //   338: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */       //   341: iadd
/*     */       //   342: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */       //   345: aload_0
/*     */       //   346: checkcast kotlin/coroutines/Continuation
/*     */       //   349: aload_0
/*     */       //   350: aload_2
/*     */       //   351: putfield L$0 : Ljava/lang/Object;
/*     */       //   354: aload_0
/*     */       //   355: aconst_null
/*     */       //   356: putfield L$1 : Ljava/lang/Object;
/*     */       //   359: aload_0
/*     */       //   360: iload #4
/*     */       //   362: putfield I$0 : I
/*     */       //   365: aload_0
/*     */       //   366: iconst_3
/*     */       //   367: putfield label : I
/*     */       //   370: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   373: dup
/*     */       //   374: aload #7
/*     */       //   376: if_acmpne -> 401
/*     */       //   379: aload #7
/*     */       //   381: areturn
/*     */       //   382: aload_0
/*     */       //   383: getfield I$0 : I
/*     */       //   386: istore #4
/*     */       //   388: aload_0
/*     */       //   389: getfield L$0 : Ljava/lang/Object;
/*     */       //   392: checkcast kotlin/sequences/SequenceScope
/*     */       //   395: astore_2
/*     */       //   396: aload_1
/*     */       //   397: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   400: aload_1
/*     */       //   401: pop
/*     */       //   402: iinc #4, 1
/*     */       //   405: goto -> 304
/*     */       //   408: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   411: areturn
/*     */       //   412: new java/lang/IllegalStateException
/*     */       //   415: dup
/*     */       //   416: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   418: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   421: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #291	-> 3
/*     */       //   #292	-> 52
/*     */       //   #293	-> 60
/*     */       //   #294	-> 64
/*     */       //   #295	-> 84
/*     */       //   #291	-> 130
/*     */       //   #294	-> 166
/*     */       //   #297	-> 173
/*     */       //   #298	-> 185
/*     */       //   #299	-> 195
/*     */       //   #300	-> 212
/*     */       //   #291	-> 260
/*     */       //   #298	-> 282
/*     */       //   #304	-> 289
/*     */       //   #305	-> 301
/*     */       //   #306	-> 311
/*     */       //   #307	-> 328
/*     */       //   #291	-> 379
/*     */       //   #305	-> 401
/*     */       //   #311	-> 408
/*     */       //   #291	-> 412
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   52	81	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   161	102	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   277	105	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   396	12	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   60	73	3	belowBound	[I
/*     */       //   153	20	3	belowBound	[I
/*     */       //   188	75	4	index	I
/*     */       //   269	20	4	index	I
/*     */       //   304	78	4	index	I
/*     */       //   388	20	4	index	I
/*     */       //   84	40	6	element	I
/*     */       //   44	368	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1;
/*     */       //   44	368	1	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SnapshotIdSet$iterator$1> $completion) {
/*     */       SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1($completion);
/*     */       snapshotIdSet$iterator$1.L$0 = value;
/*     */       return (Continuation<Unit>)snapshotIdSet$iterator$1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((SnapshotIdSet$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Iterator<Integer> iterator() {
/* 311 */     return SequencesKt.sequence(new SnapshotIdSet$iterator$1(null)).iterator();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotIdSet fastFold(@NotNull SnapshotIdSet initial, @NotNull Function2 operation) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'initial'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'operation'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore_3
/*     */     //   14: aconst_null
/*     */     //   15: astore #4
/*     */     //   17: aload_1
/*     */     //   18: astore #4
/*     */     //   20: aload_0
/*     */     //   21: astore #5
/*     */     //   23: iconst_0
/*     */     //   24: istore #6
/*     */     //   26: aload #5
/*     */     //   28: invokestatic access$getBelowBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[I
/*     */     //   31: astore #7
/*     */     //   33: aload #7
/*     */     //   35: ifnull -> 90
/*     */     //   38: iconst_0
/*     */     //   39: istore #8
/*     */     //   41: aload #7
/*     */     //   43: arraylength
/*     */     //   44: istore #9
/*     */     //   46: iload #8
/*     */     //   48: iload #9
/*     */     //   50: if_icmpge -> 90
/*     */     //   53: aload #7
/*     */     //   55: iload #8
/*     */     //   57: iaload
/*     */     //   58: istore #10
/*     */     //   60: iload #10
/*     */     //   62: istore #11
/*     */     //   64: iconst_0
/*     */     //   65: istore #12
/*     */     //   67: aload_2
/*     */     //   68: aload #4
/*     */     //   70: iload #11
/*     */     //   72: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   75: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   80: astore #4
/*     */     //   82: nop
/*     */     //   83: nop
/*     */     //   84: iinc #8, 1
/*     */     //   87: goto -> 46
/*     */     //   90: aload #5
/*     */     //   92: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   95: lconst_0
/*     */     //   96: lcmp
/*     */     //   97: ifeq -> 161
/*     */     //   100: iconst_0
/*     */     //   101: istore #8
/*     */     //   103: iload #8
/*     */     //   105: bipush #64
/*     */     //   107: if_icmpge -> 161
/*     */     //   110: aload #5
/*     */     //   112: invokestatic access$getLowerSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   115: lconst_1
/*     */     //   116: iload #8
/*     */     //   118: lshl
/*     */     //   119: land
/*     */     //   120: lconst_0
/*     */     //   121: lcmp
/*     */     //   122: ifeq -> 155
/*     */     //   125: iload #8
/*     */     //   127: aload #5
/*     */     //   129: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   132: iadd
/*     */     //   133: istore #11
/*     */     //   135: iconst_0
/*     */     //   136: istore #12
/*     */     //   138: aload_2
/*     */     //   139: aload #4
/*     */     //   141: iload #11
/*     */     //   143: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   146: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   151: astore #4
/*     */     //   153: nop
/*     */     //   154: nop
/*     */     //   155: iinc #8, 1
/*     */     //   158: goto -> 103
/*     */     //   161: aload #5
/*     */     //   163: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   166: lconst_0
/*     */     //   167: lcmp
/*     */     //   168: ifeq -> 235
/*     */     //   171: iconst_0
/*     */     //   172: istore #8
/*     */     //   174: iload #8
/*     */     //   176: bipush #64
/*     */     //   178: if_icmpge -> 235
/*     */     //   181: aload #5
/*     */     //   183: invokestatic access$getUpperSet$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
/*     */     //   186: lconst_1
/*     */     //   187: iload #8
/*     */     //   189: lshl
/*     */     //   190: land
/*     */     //   191: lconst_0
/*     */     //   192: lcmp
/*     */     //   193: ifeq -> 229
/*     */     //   196: iload #8
/*     */     //   198: bipush #64
/*     */     //   200: iadd
/*     */     //   201: aload #5
/*     */     //   203: invokestatic access$getLowerBound$p : (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)I
/*     */     //   206: iadd
/*     */     //   207: istore #11
/*     */     //   209: iconst_0
/*     */     //   210: istore #12
/*     */     //   212: aload_2
/*     */     //   213: aload #4
/*     */     //   215: iload #11
/*     */     //   217: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   220: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   225: astore #4
/*     */     //   227: nop
/*     */     //   228: nop
/*     */     //   229: iinc #8, 1
/*     */     //   232: goto -> 174
/*     */     //   235: nop
/*     */     //   236: aload #4
/*     */     //   238: checkcast androidx/compose/runtime/snapshots/SnapshotIdSet
/*     */     //   241: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #317	-> 14
/*     */     //   #318	-> 20
/*     */     //   #525	-> 26
/*     */     //   #526	-> 33
/*     */     //   #527	-> 38
/*     */     //   #528	-> 60
/*     */     //   #319	-> 67
/*     */     //   #320	-> 82
/*     */     //   #528	-> 83
/*     */     //   #527	-> 84
/*     */     //   #530	-> 90
/*     */     //   #531	-> 100
/*     */     //   #532	-> 110
/*     */     //   #533	-> 125
/*     */     //   #319	-> 138
/*     */     //   #320	-> 153
/*     */     //   #533	-> 154
/*     */     //   #531	-> 155
/*     */     //   #537	-> 161
/*     */     //   #538	-> 171
/*     */     //   #539	-> 181
/*     */     //   #540	-> 196
/*     */     //   #319	-> 212
/*     */     //   #320	-> 227
/*     */     //   #540	-> 228
/*     */     //   #538	-> 229
/*     */     //   #544	-> 235
/*     */     //   #321	-> 236
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   67	16	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1	I
/*     */     //   64	19	11	element	I
/*     */     //   138	16	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1	I
/*     */     //   135	19	11	element	I
/*     */     //   212	16	12	$i$a$-fastForEach-SnapshotIdSet$fastFold$1	I
/*     */     //   209	19	11	element	I
/*     */     //   60	24	10	element$iv	I
/*     */     //   103	58	8	index$iv	I
/*     */     //   174	61	8	index$iv	I
/*     */     //   26	210	6	$i$f$fastForEach	I
/*     */     //   33	203	7	belowBound$iv	[I
/*     */     //   23	213	5	this_$iv	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   14	228	3	$i$f$fastFold	I
/*     */     //   17	225	4	accumulator	Ljava/lang/Object;
/*     */     //   0	242	0	this	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	242	1	initial	Landroidx/compose/runtime/snapshots/SnapshotIdSet;
/*     */     //   0	242	2	operation	Lkotlin/jvm/functions/Function2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void fastForEach(@NotNull Function1 block) {
/* 325 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$fastForEach = 0, belowBound[] = this.belowBound;
/* 326 */     if (belowBound != null) {
/* 327 */       byte b; int i; for (b = 0, i = belowBound.length; b < i; ) { int element = belowBound[b];
/* 328 */         block.invoke(Integer.valueOf(element)); b++; }
/*     */     
/* 330 */     }  if (this.lowerSet != 0L) {
/* 331 */       for (int index = 0; index < 64; index++) {
/* 332 */         if ((this.lowerSet & 1L << index) != 0L) {
/* 333 */           block.invoke(Integer.valueOf(index + this.lowerBound));
/*     */         }
/*     */       } 
/*     */     }
/* 337 */     if (this.upperSet != 0L) {
/* 338 */       for (int index = 0; index < 64; index++) {
/* 339 */         if ((this.upperSet & 1L << index) != 0L) {
/* 340 */           block.invoke(Integer.valueOf(index + 64 + this.lowerBound));
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public final int lowest(int default) {
/* 347 */     int[] belowBound = this.belowBound;
/* 348 */     if (belowBound != null) return belowBound[0]; 
/* 349 */     if (this.lowerSet != 0L) return this.lowerBound + Long.numberOfTrailingZeros(this.lowerSet); 
/* 350 */     if (this.upperSet != 0L) return this.lowerBound + 64 + Long.numberOfTrailingZeros(this.upperSet); 
/* 351 */     return default;
/*     */   } @NotNull
/*     */   public String toString() {
/* 354 */     SnapshotIdSet snapshotIdSet1 = this; StringBuilder stringBuilder = (new StringBuilder()).append(super.toString()).append(" ["); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 545 */     SnapshotIdSet snapshotIdSet2 = snapshotIdSet1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotIdSet1, 10)); int $i$f$mapTo = 0;
/* 546 */     for (Object item$iv$iv : snapshotIdSet2) {
/* 547 */       int i = ((Number)item$iv$iv).intValue(); Collection<String> collection = destination$iv$iv; int $i$a$-map-SnapshotIdSet$toString$1 = 0; collection.add(String.valueOf(i));
/* 548 */     }  return stringBuilder.append(ListUtilsKt.fastJoinToString$default((List)destination$iv$iv, null, null, null, 0, null, null, 63, null)).append(']').toString();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final SnapshotIdSet getEMPTY() {
/*     */       return SnapshotIdSet.EMPTY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long upperSet;
/*     */   private final long lowerSet;
/*     */   private final int lowerBound;
/*     */   @Nullable
/*     */   private final int[] belowBound;
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0L, 0L, 0, null);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotIdSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */