/*    */ package androidx.compose.runtime.collection;
/*    */ 
/*    */ import androidx.collection.ScatterSet;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\013\n\002\020\"\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\032*\020\000\032\0020\001*\b\022\004\022\0020\0030\0022\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\005H\bø\001\000\0324\020\006\032\0020\007\"\b\b\000\020\b*\0020\003*\b\022\004\022\002H\b0\0022\022\020\004\032\016\022\004\022\002H\b\022\004\022\0020\0070\005H\bø\001\000\032\036\020\t\032\b\022\004\022\002H\b0\002\"\004\b\000\020\b*\b\022\004\022\002H\b0\nH\000\002\007\n\005\b20\001¨\006\013"}, d2 = {"fastAny", "", "", "", "block", "Lkotlin/Function1;", "fastForEach", "", "T", "wrapIntoSet", "Landroidx/collection/ScatterSet;", "runtime"})
/*    */ @SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n296#2,2:93\n267#2,4:95\n237#2,7:99\n248#2,3:107\n251#2,2:111\n272#2:113\n298#2,2:114\n273#2:116\n254#2,6:117\n274#2:123\n300#2:124\n1810#3:75\n1672#3:79\n1810#3:106\n1672#3:110\n1855#4,2:91\n1747#4,3:125\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n50#1:64,4\n50#1:68,7\n50#1:76,3\n50#1:80,2\n50#1:82,2\n50#1:84,6\n50#1:90\n59#1:93,2\n59#1:95,4\n59#1:99,7\n59#1:107,3\n59#1:111,2\n59#1:113\n59#1:114,2\n59#1:116\n59#1:117,6\n59#1:123\n59#1:124\n50#1:75\n50#1:79\n59#1:106\n59#1:110\n53#1:91,2\n61#1:125,3\n*E\n"})
/*    */ public final class ScatterSetWrapperKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> Set<T> wrapIntoSet(@NotNull ScatterSet<T> $this$wrapIntoSet) {
/* 45 */     Intrinsics.checkNotNullParameter($this$wrapIntoSet, "<this>"); return new ScatterSetWrapper<>($this$wrapIntoSet);
/*    */   }
/*    */   public static final <T> void fastForEach(@NotNull Set $this$fastForEach, @NotNull Function1 block) {
/* 48 */     Intrinsics.checkNotNullParameter($this$fastForEach, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$fastForEach = 0;
/*    */     
/* 50 */     ScatterSet this_$iv = ((ScatterSetWrapper)$this$fastForEach).getSet$runtime(); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 65 */     Object[] k$iv = this_$iv.elements;
/*    */     
/* 67 */     ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*    */     
/* 69 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 70 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*    */     
/* 72 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 73 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 74 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 75 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 76 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 77 */           for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 78 */             long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 79 */             if ((value$iv$iv$iv < 128L)) {
/* 80 */               int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 81 */               int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 82 */               block.invoke(k$iv[index$iv]);
/*    */             } 
/* 84 */             slot$iv$iv >>= 8L;
/*    */           } 
/* 86 */           if (bitCount$iv$iv == 8)
/*    */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*    */          // Byte code: goto -> 223
/*    */       }  }
/*    */     else {  }
/* 91 */      Iterable $this$forEach$iv = $this$fastForEach; $i$f$forEach = 0; for (Object element$iv : $this$forEach$iv) block.invoke(element$iv); 
/*    */   }
/*    */   
/*    */   public static final boolean fastAny(@NotNull Set $this$fastAny, @NotNull Function1 block) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'block'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: iconst_0
/*    */     //   13: istore_2
/*    */     //   14: aload_0
/*    */     //   15: instanceof androidx/compose/runtime/collection/ScatterSetWrapper
/*    */     //   18: ifeq -> 259
/*    */     //   21: aload_0
/*    */     //   22: checkcast androidx/compose/runtime/collection/ScatterSetWrapper
/*    */     //   25: invokevirtual getSet$runtime : ()Landroidx/collection/ScatterSet;
/*    */     //   28: astore_3
/*    */     //   29: iconst_0
/*    */     //   30: istore #4
/*    */     //   32: nop
/*    */     //   33: aload_3
/*    */     //   34: astore #5
/*    */     //   36: iconst_0
/*    */     //   37: istore #6
/*    */     //   39: nop
/*    */     //   40: aload #5
/*    */     //   42: getfield elements : [Ljava/lang/Object;
/*    */     //   45: astore #7
/*    */     //   47: aload #5
/*    */     //   49: astore #8
/*    */     //   51: iconst_0
/*    */     //   52: istore #9
/*    */     //   54: nop
/*    */     //   55: aload #8
/*    */     //   57: getfield metadata : [J
/*    */     //   60: astore #10
/*    */     //   62: aload #10
/*    */     //   64: arraylength
/*    */     //   65: iconst_2
/*    */     //   66: isub
/*    */     //   67: istore #11
/*    */     //   69: iconst_0
/*    */     //   70: istore #12
/*    */     //   72: iload #12
/*    */     //   74: iload #11
/*    */     //   76: if_icmpgt -> 253
/*    */     //   79: aload #10
/*    */     //   81: iload #12
/*    */     //   83: laload
/*    */     //   84: lstore #13
/*    */     //   86: lload #13
/*    */     //   88: lstore #15
/*    */     //   90: iconst_0
/*    */     //   91: istore #17
/*    */     //   93: lload #15
/*    */     //   95: lload #15
/*    */     //   97: ldc2_w -1
/*    */     //   100: lxor
/*    */     //   101: bipush #7
/*    */     //   103: lshl
/*    */     //   104: land
/*    */     //   105: ldc2_w -9187201950435737472
/*    */     //   108: land
/*    */     //   109: ldc2_w -9187201950435737472
/*    */     //   112: lcmp
/*    */     //   113: ifeq -> 240
/*    */     //   116: bipush #8
/*    */     //   118: iload #12
/*    */     //   120: iload #11
/*    */     //   122: isub
/*    */     //   123: iconst_m1
/*    */     //   124: ixor
/*    */     //   125: bipush #31
/*    */     //   127: iushr
/*    */     //   128: isub
/*    */     //   129: istore #18
/*    */     //   131: iconst_0
/*    */     //   132: istore #19
/*    */     //   134: iload #19
/*    */     //   136: iload #18
/*    */     //   138: if_icmpge -> 233
/*    */     //   141: lload #13
/*    */     //   143: ldc2_w 255
/*    */     //   146: land
/*    */     //   147: lstore #20
/*    */     //   149: iconst_0
/*    */     //   150: istore #22
/*    */     //   152: lload #20
/*    */     //   154: ldc2_w 128
/*    */     //   157: lcmp
/*    */     //   158: ifge -> 165
/*    */     //   161: iconst_1
/*    */     //   162: goto -> 166
/*    */     //   165: iconst_0
/*    */     //   166: ifeq -> 220
/*    */     //   169: iload #12
/*    */     //   171: iconst_3
/*    */     //   172: ishl
/*    */     //   173: iload #19
/*    */     //   175: iadd
/*    */     //   176: istore #17
/*    */     //   178: iload #17
/*    */     //   180: istore #23
/*    */     //   182: iconst_0
/*    */     //   183: istore #24
/*    */     //   185: aload #7
/*    */     //   187: iload #23
/*    */     //   189: aaload
/*    */     //   190: astore #25
/*    */     //   192: iconst_0
/*    */     //   193: istore #26
/*    */     //   195: aload_1
/*    */     //   196: aload #25
/*    */     //   198: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   203: checkcast java/lang/Boolean
/*    */     //   206: invokevirtual booleanValue : ()Z
/*    */     //   209: ifeq -> 216
/*    */     //   212: iconst_1
/*    */     //   213: goto -> 339
/*    */     //   216: nop
/*    */     //   217: nop
/*    */     //   218: nop
/*    */     //   219: nop
/*    */     //   220: lload #13
/*    */     //   222: bipush #8
/*    */     //   224: lshr
/*    */     //   225: lstore #13
/*    */     //   227: iinc #19, 1
/*    */     //   230: goto -> 134
/*    */     //   233: iload #18
/*    */     //   235: bipush #8
/*    */     //   237: if_icmpne -> 254
/*    */     //   240: iload #12
/*    */     //   242: iload #11
/*    */     //   244: if_icmpeq -> 253
/*    */     //   247: iinc #12, 1
/*    */     //   250: goto -> 79
/*    */     //   253: nop
/*    */     //   254: nop
/*    */     //   255: iconst_0
/*    */     //   256: goto -> 339
/*    */     //   259: aload_0
/*    */     //   260: checkcast java/lang/Iterable
/*    */     //   263: astore_3
/*    */     //   264: iconst_0
/*    */     //   265: istore #4
/*    */     //   267: aload_3
/*    */     //   268: instanceof java/util/Collection
/*    */     //   271: ifeq -> 290
/*    */     //   274: aload_3
/*    */     //   275: checkcast java/util/Collection
/*    */     //   278: invokeinterface isEmpty : ()Z
/*    */     //   283: ifeq -> 290
/*    */     //   286: iconst_0
/*    */     //   287: goto -> 339
/*    */     //   290: aload_3
/*    */     //   291: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   296: astore #5
/*    */     //   298: aload #5
/*    */     //   300: invokeinterface hasNext : ()Z
/*    */     //   305: ifeq -> 338
/*    */     //   308: aload #5
/*    */     //   310: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   315: astore #6
/*    */     //   317: aload_1
/*    */     //   318: aload #6
/*    */     //   320: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   325: checkcast java/lang/Boolean
/*    */     //   328: invokevirtual booleanValue : ()Z
/*    */     //   331: ifeq -> 298
/*    */     //   334: iconst_1
/*    */     //   335: goto -> 339
/*    */     //   338: iconst_0
/*    */     //   339: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 14
/*    */     //   #59	-> 21
/*    */     //   #93	-> 32
/*    */     //   #94	-> 33
/*    */     //   #95	-> 39
/*    */     //   #96	-> 40
/*    */     //   #98	-> 47
/*    */     //   #99	-> 54
/*    */     //   #100	-> 55
/*    */     //   #101	-> 62
/*    */     //   #103	-> 69
/*    */     //   #104	-> 79
/*    */     //   #105	-> 86
/*    */     //   #106	-> 93
/*    */     //   #105	-> 109
/*    */     //   #107	-> 116
/*    */     //   #108	-> 131
/*    */     //   #109	-> 141
/*    */     //   #110	-> 152
/*    */     //   #109	-> 166
/*    */     //   #111	-> 169
/*    */     //   #112	-> 178
/*    */     //   #113	-> 185
/*    */     //   #114	-> 195
/*    */     //   #115	-> 216
/*    */     //   #113	-> 217
/*    */     //   #116	-> 218
/*    */     //   #112	-> 219
/*    */     //   #117	-> 220
/*    */     //   #108	-> 227
/*    */     //   #119	-> 233
/*    */     //   #103	-> 240
/*    */     //   #122	-> 253
/*    */     //   #123	-> 254
/*    */     //   #124	-> 255
/*    */     //   #61	-> 259
/*    */     //   #125	-> 267
/*    */     //   #126	-> 290
/*    */     //   #127	-> 338
/*    */     //   #62	-> 339
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   195	22	26	$i$a$-forEach-ScatterSet$any$2$iv	I
/*    */     //   192	25	25	element$iv	Ljava/lang/Object;
/*    */     //   185	34	24	$i$a$-forEachIndex-ScatterSet$forEach$2$iv$iv	I
/*    */     //   182	37	23	index$iv$iv	I
/*    */     //   93	16	17	$i$f$maskEmptyOrDeleted	I
/*    */     //   90	19	15	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*    */     //   152	14	22	$i$f$isFull	I
/*    */     //   149	17	20	value$iv$iv$iv$iv	J
/*    */     //   178	42	17	index$iv$iv$iv	I
/*    */     //   134	99	19	j$iv$iv$iv	I
/*    */     //   131	109	18	bitCount$iv$iv$iv	I
/*    */     //   86	154	13	slot$iv$iv$iv	J
/*    */     //   72	181	12	i$iv$iv$iv	I
/*    */     //   54	200	9	$i$f$forEachIndex	I
/*    */     //   62	192	10	m$iv$iv$iv	[J
/*    */     //   69	185	11	lastIndex$iv$iv$iv	I
/*    */     //   51	203	8	this_$iv$iv$iv	Landroidx/collection/ScatterSet;
/*    */     //   39	216	6	$i$f$forEach	I
/*    */     //   47	208	7	k$iv$iv	[Ljava/lang/Object;
/*    */     //   36	219	5	this_$iv$iv	Landroidx/collection/ScatterSet;
/*    */     //   32	224	4	$i$f$any	I
/*    */     //   29	227	3	this_$iv	Landroidx/collection/ScatterSet;
/*    */     //   317	21	6	element$iv	Ljava/lang/Object;
/*    */     //   267	72	4	$i$f$any	I
/*    */     //   264	75	3	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   14	326	2	$i$f$fastAny	I
/*    */     //   0	340	0	$this$fastAny	Ljava/util/Set;
/*    */     //   0	340	1	block	Lkotlin/jvm/functions/Function1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\ScatterSetWrapperKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */