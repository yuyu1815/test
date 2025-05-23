/*    */ package androidx.compose.runtime.collection;
/*    */ 
/*    */ import androidx.collection.ScatterSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*    */ import kotlin.jvm.internal.CollectionToArray;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import kotlin.sequences.SequenceScope;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\000\n\002\020\"\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\036\n\002\b\002\n\002\020(\n\000\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\026\020\f\032\0020\r2\006\020\016\032\0028\000H\002¢\006\002\020\017J\026\020\020\032\0020\r2\f\020\021\032\b\022\004\022\0028\0000\022H\026J\b\020\023\032\0020\rH\026J\017\020\024\032\b\022\004\022\0028\0000\025H\002R\032\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\026"}, d2 = {"Landroidx/compose/runtime/collection/ScatterSetWrapper;", "T", "", "set", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "getSet$runtime", "()Landroidx/collection/ScatterSet;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1726#2,3:64\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n39#1:64,3\n*E\n"})
/*    */ public final class ScatterSetWrapper<T> implements Set<T>, KMappedMarker {
/*    */   @NotNull
/*    */   private final ScatterSet<T> set;
/*    */   
/* 26 */   public ScatterSetWrapper(@NotNull ScatterSet<T> set) { this.set = set; } public static final int $stable = 8; @NotNull public final ScatterSet<T> getSet$runtime() { return this.set; }
/*    */   
/*    */   public int getSize() {
/* 29 */     return this.set.getSize();
/*    */   }
/* 31 */   public boolean isEmpty() { return this.set.isEmpty(); } @NotNull
/* 32 */   public Iterator<T> iterator() { return SequencesKt.iterator(new ScatterSetWrapper$iterator$1(null)); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean contains(Object element) {
/* 42 */     return this.set.contains(element);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ScatterSetWrapper.kt", l = {34}, i = {0, 0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"}, n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, m = "invokeSuspend", c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"})
/*    */   @SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n1810#3:75\n1672#3:79\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1\n*L\n33#1:64,4\n33#1:68,7\n33#1:76,3\n33#1:80,2\n33#1:82,2\n33#1:84,6\n33#1:90\n33#1:75\n33#1:79\n*E\n"})
/*    */   static final class ScatterSetWrapper$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2;
/*    */     int I$3;
/*    */     long J$0;
/*    */     int label;
/*    */     
/*    */     ScatterSetWrapper$iterator$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #25
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 392, 0 -> 32, 1 -> 277
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield L$0 : Ljava/lang/Object;
/*    */       //   40: checkcast kotlin/sequences/SequenceScope
/*    */       //   43: astore_2
/*    */       //   44: aload_0
/*    */       //   45: getfield this$0 : Landroidx/compose/runtime/collection/ScatterSetWrapper;
/*    */       //   48: invokevirtual getSet$runtime : ()Landroidx/collection/ScatterSet;
/*    */       //   51: astore_3
/*    */       //   52: iconst_0
/*    */       //   53: istore #4
/*    */       //   55: nop
/*    */       //   56: aload_3
/*    */       //   57: getfield elements : [Ljava/lang/Object;
/*    */       //   60: astore #5
/*    */       //   62: aload_3
/*    */       //   63: astore #6
/*    */       //   65: iconst_0
/*    */       //   66: istore #7
/*    */       //   68: nop
/*    */       //   69: aload #6
/*    */       //   71: getfield metadata : [J
/*    */       //   74: astore #8
/*    */       //   76: aload #8
/*    */       //   78: arraylength
/*    */       //   79: iconst_2
/*    */       //   80: isub
/*    */       //   81: istore #9
/*    */       //   83: iconst_0
/*    */       //   84: istore #10
/*    */       //   86: iload #10
/*    */       //   88: iload #9
/*    */       //   90: if_icmpgt -> 386
/*    */       //   93: aload #8
/*    */       //   95: iload #10
/*    */       //   97: laload
/*    */       //   98: lstore #11
/*    */       //   100: lload #11
/*    */       //   102: lstore #13
/*    */       //   104: iconst_0
/*    */       //   105: istore #15
/*    */       //   107: lload #13
/*    */       //   109: lload #13
/*    */       //   111: ldc2_w -1
/*    */       //   114: lxor
/*    */       //   115: bipush #7
/*    */       //   117: lshl
/*    */       //   118: land
/*    */       //   119: ldc2_w -9187201950435737472
/*    */       //   122: land
/*    */       //   123: ldc2_w -9187201950435737472
/*    */       //   126: lcmp
/*    */       //   127: ifeq -> 373
/*    */       //   130: bipush #8
/*    */       //   132: iload #10
/*    */       //   134: iload #9
/*    */       //   136: isub
/*    */       //   137: iconst_m1
/*    */       //   138: ixor
/*    */       //   139: bipush #31
/*    */       //   141: iushr
/*    */       //   142: isub
/*    */       //   143: istore #16
/*    */       //   145: iconst_0
/*    */       //   146: istore #17
/*    */       //   148: iload #17
/*    */       //   150: iload #16
/*    */       //   152: if_icmpge -> 366
/*    */       //   155: lload #11
/*    */       //   157: ldc2_w 255
/*    */       //   160: land
/*    */       //   161: lstore #18
/*    */       //   163: iconst_0
/*    */       //   164: istore #20
/*    */       //   166: lload #18
/*    */       //   168: ldc2_w 128
/*    */       //   171: lcmp
/*    */       //   172: ifge -> 179
/*    */       //   175: iconst_1
/*    */       //   176: goto -> 180
/*    */       //   179: iconst_0
/*    */       //   180: ifeq -> 353
/*    */       //   183: iload #10
/*    */       //   185: iconst_3
/*    */       //   186: ishl
/*    */       //   187: iload #17
/*    */       //   189: iadd
/*    */       //   190: istore #15
/*    */       //   192: iload #15
/*    */       //   194: istore #21
/*    */       //   196: iconst_0
/*    */       //   197: istore #22
/*    */       //   199: aload #5
/*    */       //   201: iload #21
/*    */       //   203: aaload
/*    */       //   204: astore #23
/*    */       //   206: iconst_0
/*    */       //   207: istore #24
/*    */       //   209: aload_2
/*    */       //   210: aload #23
/*    */       //   212: aload_0
/*    */       //   213: aload_0
/*    */       //   214: aload_2
/*    */       //   215: putfield L$0 : Ljava/lang/Object;
/*    */       //   218: aload_0
/*    */       //   219: aload #5
/*    */       //   221: putfield L$1 : Ljava/lang/Object;
/*    */       //   224: aload_0
/*    */       //   225: aload #8
/*    */       //   227: putfield L$2 : Ljava/lang/Object;
/*    */       //   230: aload_0
/*    */       //   231: iload #9
/*    */       //   233: putfield I$0 : I
/*    */       //   236: aload_0
/*    */       //   237: iload #10
/*    */       //   239: putfield I$1 : I
/*    */       //   242: aload_0
/*    */       //   243: lload #11
/*    */       //   245: putfield J$0 : J
/*    */       //   248: aload_0
/*    */       //   249: iload #16
/*    */       //   251: putfield I$2 : I
/*    */       //   254: aload_0
/*    */       //   255: iload #17
/*    */       //   257: putfield I$3 : I
/*    */       //   260: aload_0
/*    */       //   261: iconst_1
/*    */       //   262: putfield label : I
/*    */       //   265: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   268: dup
/*    */       //   269: aload #25
/*    */       //   271: if_acmpne -> 350
/*    */       //   274: aload #25
/*    */       //   276: areturn
/*    */       //   277: iconst_0
/*    */       //   278: istore #4
/*    */       //   280: iconst_0
/*    */       //   281: istore #7
/*    */       //   283: iconst_0
/*    */       //   284: istore #22
/*    */       //   286: iconst_0
/*    */       //   287: istore #24
/*    */       //   289: aload_0
/*    */       //   290: getfield I$3 : I
/*    */       //   293: istore #17
/*    */       //   295: aload_0
/*    */       //   296: getfield I$2 : I
/*    */       //   299: istore #16
/*    */       //   301: aload_0
/*    */       //   302: getfield J$0 : J
/*    */       //   305: lstore #11
/*    */       //   307: aload_0
/*    */       //   308: getfield I$1 : I
/*    */       //   311: istore #10
/*    */       //   313: aload_0
/*    */       //   314: getfield I$0 : I
/*    */       //   317: istore #9
/*    */       //   319: aload_0
/*    */       //   320: getfield L$2 : Ljava/lang/Object;
/*    */       //   323: checkcast [J
/*    */       //   326: astore #8
/*    */       //   328: aload_0
/*    */       //   329: getfield L$1 : Ljava/lang/Object;
/*    */       //   332: checkcast [Ljava/lang/Object;
/*    */       //   335: astore #5
/*    */       //   337: aload_0
/*    */       //   338: getfield L$0 : Ljava/lang/Object;
/*    */       //   341: checkcast kotlin/sequences/SequenceScope
/*    */       //   344: astore_2
/*    */       //   345: aload_1
/*    */       //   346: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   349: aload_1
/*    */       //   350: pop
/*    */       //   351: nop
/*    */       //   352: nop
/*    */       //   353: lload #11
/*    */       //   355: bipush #8
/*    */       //   357: lshr
/*    */       //   358: lstore #11
/*    */       //   360: iinc #17, 1
/*    */       //   363: goto -> 148
/*    */       //   366: iload #16
/*    */       //   368: bipush #8
/*    */       //   370: if_icmpne -> 387
/*    */       //   373: iload #10
/*    */       //   375: iload #9
/*    */       //   377: if_icmpeq -> 386
/*    */       //   380: iinc #10, 1
/*    */       //   383: goto -> 93
/*    */       //   386: nop
/*    */       //   387: nop
/*    */       //   388: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   391: areturn
/*    */       //   392: new java/lang/IllegalStateException
/*    */       //   395: dup
/*    */       //   396: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   398: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   401: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #32	-> 3
/*    */       //   #33	-> 44
/*    */       //   #64	-> 55
/*    */       //   #65	-> 56
/*    */       //   #67	-> 62
/*    */       //   #68	-> 68
/*    */       //   #69	-> 69
/*    */       //   #70	-> 76
/*    */       //   #72	-> 83
/*    */       //   #73	-> 93
/*    */       //   #74	-> 100
/*    */       //   #75	-> 107
/*    */       //   #74	-> 123
/*    */       //   #76	-> 130
/*    */       //   #77	-> 145
/*    */       //   #78	-> 155
/*    */       //   #79	-> 166
/*    */       //   #78	-> 180
/*    */       //   #80	-> 183
/*    */       //   #81	-> 192
/*    */       //   #82	-> 199
/*    */       //   #34	-> 209
/*    */       //   #32	-> 274
/*    */       //   #35	-> 350
/*    */       //   #82	-> 351
/*    */       //   #83	-> 351
/*    */       //   #81	-> 352
/*    */       //   #84	-> 353
/*    */       //   #77	-> 360
/*    */       //   #86	-> 366
/*    */       //   #72	-> 373
/*    */       //   #89	-> 386
/*    */       //   #90	-> 387
/*    */       //   #36	-> 388
/*    */       //   #32	-> 392
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   44	233	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*    */       //   345	6	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*    */       //   351	35	2	$this$iterator	Lkotlin/sequences/SequenceScope;
/*    */       //   52	13	3	this_$iv	Landroidx/collection/ScatterSet;
/*    */       //   62	215	5	k$iv	[Ljava/lang/Object;
/*    */       //   337	14	5	k$iv	[Ljava/lang/Object;
/*    */       //   351	35	5	k$iv	[Ljava/lang/Object;
/*    */       //   65	11	6	this_$iv$iv	Landroidx/collection/ScatterSet;
/*    */       //   76	201	8	m$iv$iv	[J
/*    */       //   328	23	8	m$iv$iv	[J
/*    */       //   351	35	8	m$iv$iv	[J
/*    */       //   83	194	9	lastIndex$iv$iv	I
/*    */       //   319	32	9	lastIndex$iv$iv	I
/*    */       //   351	35	9	lastIndex$iv$iv	I
/*    */       //   86	191	10	i$iv$iv	I
/*    */       //   313	38	10	i$iv$iv	I
/*    */       //   351	35	10	i$iv$iv	I
/*    */       //   100	177	11	slot$iv$iv	J
/*    */       //   307	44	11	slot$iv$iv	J
/*    */       //   351	22	11	slot$iv$iv	J
/*    */       //   104	19	13	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*    */       //   192	4	15	index$iv$iv	I
/*    */       //   145	132	16	bitCount$iv$iv	I
/*    */       //   301	50	16	bitCount$iv$iv	I
/*    */       //   351	22	16	bitCount$iv$iv	I
/*    */       //   148	129	17	j$iv$iv	I
/*    */       //   295	56	17	j$iv$iv	I
/*    */       //   351	15	17	j$iv$iv	I
/*    */       //   163	17	18	value$iv$iv$iv	J
/*    */       //   196	10	21	index$iv	I
/*    */       //   206	62	23	it	Ljava/lang/Object;
/*    */       //   209	68	24	$i$a$-forEach-ScatterSetWrapper$iterator$1$1	I
/*    */       //   199	78	22	$i$a$-forEachIndex-ScatterSet$forEach$2$iv	I
/*    */       //   107	16	15	$i$f$maskEmptyOrDeleted	I
/*    */       //   166	14	20	$i$f$isFull	I
/*    */       //   68	209	7	$i$f$forEachIndex	I
/*    */       //   55	222	4	$i$f$forEach	I
/*    */       //   36	356	0	this	Landroidx/compose/runtime/collection/ScatterSetWrapper$iterator$1;
/*    */       //   36	356	1	$result	Ljava/lang/Object;
/*    */       //   289	62	24	$i$a$-forEach-ScatterSetWrapper$iterator$1$1	I
/*    */       //   286	66	22	$i$a$-forEachIndex-ScatterSet$forEach$2$iv	I
/*    */       //   283	104	7	$i$f$forEachIndex	I
/*    */       //   280	108	4	$i$f$forEach	I
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ScatterSetWrapper$iterator$1> $completion) {
/*    */       ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1($completion);
/*    */       scatterSetWrapper$iterator$1.L$0 = value;
/*    */       return (Continuation<Unit>)scatterSetWrapper$iterator$1;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((ScatterSetWrapper$iterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean containsAll(@NotNull Collection elements) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'elements'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast java/lang/Iterable
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: checkcast java/util/Collection
/*    */     //   17: invokeinterface isEmpty : ()Z
/*    */     //   22: ifeq -> 29
/*    */     //   25: iconst_1
/*    */     //   26: goto -> 80
/*    */     //   29: aload_2
/*    */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   35: astore #4
/*    */     //   37: aload #4
/*    */     //   39: invokeinterface hasNext : ()Z
/*    */     //   44: ifeq -> 79
/*    */     //   47: aload #4
/*    */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   54: astore #5
/*    */     //   56: aload #5
/*    */     //   58: astore #6
/*    */     //   60: iconst_0
/*    */     //   61: istore #7
/*    */     //   63: aload_0
/*    */     //   64: getfield set : Landroidx/collection/ScatterSet;
/*    */     //   67: aload #6
/*    */     //   69: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   72: ifne -> 37
/*    */     //   75: iconst_0
/*    */     //   76: goto -> 80
/*    */     //   79: iconst_1
/*    */     //   80: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 6
/*    */     //   #64	-> 13
/*    */     //   #65	-> 29
/*    */     //   #39	-> 63
/*    */     //   #65	-> 72
/*    */     //   #66	-> 79
/*    */     //   #39	-> 80
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   63	9	7	$i$a$-all-ScatterSetWrapper$containsAll$1	I
/*    */     //   60	12	6	it	Ljava/lang/Object;
/*    */     //   56	23	5	element$iv	Ljava/lang/Object;
/*    */     //   13	67	3	$i$f$all	I
/*    */     //   11	69	2	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   0	81	0	this	Landroidx/compose/runtime/collection/ScatterSetWrapper;
/*    */     //   0	81	1	elements	Ljava/util/Collection;
/*    */   }
/*    */   
/*    */   public boolean add(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean addAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean remove(Object element) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean removeAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean retainAll(Collection elements) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public <T> T[] toArray(Object[] array) {
/*    */     Intrinsics.checkNotNullParameter(array, "array");
/*    */     return (T[])CollectionToArray.toArray(this, array);
/*    */   }
/*    */   
/*    */   public Object[] toArray() {
/*    */     return CollectionToArray.toArray(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\ScatterSetWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */