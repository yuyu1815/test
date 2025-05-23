/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Arrays;
/*     */ import java.util.ListIterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\r\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020*\n\002\b\016\n\002\030\002\n\002\020\013\n\002\b\t\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B5\022\016\020\004\032\n\022\006\022\004\030\0010\0060\005\022\016\020\007\032\n\022\006\022\004\030\0010\0060\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\002\020\013J\033\020\017\032\b\022\004\022\0028\0000\0022\006\020\020\032\0028\000H\026¢\006\002\020\021J#\020\017\032\b\022\004\022\0028\0000\0022\006\020\022\032\0020\t2\006\020\020\032\0028\000H\026¢\006\002\020\023J\035\020\024\032\n\022\006\022\004\030\0010\0060\0052\006\020\022\032\0020\tH\002¢\006\002\020\025J\016\020\026\032\b\022\004\022\0028\0000\027H\026J\026\020\030\032\0028\0002\006\020\022\032\0020\tH\002¢\006\002\020\031JG\020\032\032\n\022\006\022\004\030\0010\0060\0052\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020\033\032\0020\t2\006\020\022\032\0020\t2\b\020\020\032\004\030\0010\0062\006\020\034\032\0020\035H\002¢\006\002\020\036J5\020\037\032\b\022\004\022\0028\0000\0002\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020 \032\0020\t2\b\020\020\032\004\030\0010\006H\002¢\006\002\020!J\026\020\"\032\b\022\004\022\0028\0000#2\006\020\022\032\0020\tH\026J?\020$\032\f\022\006\022\004\030\0010\006\030\0010\0052\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020\033\032\0020\t2\006\020\022\032\0020\t2\006\020%\032\0020\035H\002¢\006\002\020&J3\020'\032\b\022\004\022\0028\0000\0022\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020(\032\0020\t2\006\020\033\032\0020\tH\002¢\006\002\020)JC\020*\032\b\022\004\022\0028\0000\0002\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\016\020+\032\n\022\006\022\004\030\0010\0060\0052\016\020,\032\n\022\006\022\004\030\0010\0060\005H\002¢\006\002\020-J?\020.\032\n\022\006\022\004\030\0010\0060\0052\020\020\004\032\f\022\006\022\004\030\0010\006\030\0010\0052\006\020\033\032\0020\t2\016\020\007\032\n\022\006\022\004\030\0010\0060\005H\002¢\006\002\020/J\"\0200\032\b\022\004\022\0028\0000\0022\022\0201\032\016\022\004\022\0028\000\022\004\022\0020302H\026J\026\0204\032\b\022\004\022\0028\0000\0022\006\020\022\032\0020\tH\026J=\0205\032\n\022\006\022\004\030\0010\0060\0052\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020\033\032\0020\t2\006\020\022\032\0020\t2\006\020%\032\0020\035H\002¢\006\002\020&J;\0206\032\b\022\004\022\0028\0000\0022\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020(\032\0020\t2\006\020\033\032\0020\t2\006\020\022\032\0020\tH\002¢\006\002\0207J\b\020(\032\0020\tH\002J#\0208\032\b\022\004\022\0028\0000\0022\006\020\022\032\0020\t2\006\020\020\032\0028\000H\026¢\006\002\020\023J?\0209\032\n\022\006\022\004\030\0010\0060\0052\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\006\020\033\032\0020\t2\006\020\022\032\0020\t2\b\020:\032\004\030\0010\006H\002¢\006\002\020;R\030\020\004\032\n\022\006\022\004\030\0010\0060\005X\004¢\006\004\n\002\020\fR\016\020\n\032\0020\tX\004¢\006\002\n\000R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\r\020\016R\030\020\007\032\n\022\006\022\004\030\0010\0060\005X\004¢\006\004\n\002\020\f¨\006<"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "root", "", "", "tail", "size", "", "rootShift", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "bufferFor", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "get", "(I)Ljava/lang/Object;", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "insertIntoTail", "tailIndex", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "listIterator", "", "pullLastBuffer", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "rootSize", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "set", "setInRoot", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n33#2,7:329\n1#3:336\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,7\n*E\n"})
/*     */ public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
/*     */   @NotNull
/*     */   private final Object[] root;
/*     */   @NotNull
/*     */   private final Object[] tail;
/*     */   
/*     */   public int getSize() {
/*  26 */     return this.size;
/*     */   }
/*     */   private final int size;
/*     */   private final int rootShift;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public PersistentVector(@NotNull Object[] root, @NotNull Object[] tail, int size, int rootShift) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'root'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'tail'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: invokespecial <init> : ()V
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: putfield root : [Ljava/lang/Object;
/*     */     //   21: aload_0
/*     */     //   22: aload_2
/*     */     //   23: putfield tail : [Ljava/lang/Object;
/*     */     //   26: aload_0
/*     */     //   27: iload_3
/*     */     //   28: putfield size : I
/*     */     //   31: aload_0
/*     */     //   32: iload #4
/*     */     //   34: putfield rootShift : I
/*     */     //   37: nop
/*     */     //   38: aload_0
/*     */     //   39: invokevirtual size : ()I
/*     */     //   42: bipush #32
/*     */     //   44: if_icmple -> 51
/*     */     //   47: iconst_1
/*     */     //   48: goto -> 52
/*     */     //   51: iconst_0
/*     */     //   52: istore #5
/*     */     //   54: iconst_0
/*     */     //   55: istore #6
/*     */     //   57: nop
/*     */     //   58: iload #5
/*     */     //   60: ifne -> 91
/*     */     //   63: iconst_0
/*     */     //   64: istore #7
/*     */     //   66: new java/lang/StringBuilder
/*     */     //   69: dup
/*     */     //   70: invokespecial <init> : ()V
/*     */     //   73: ldc 'Trie-based persistent vector should have at least 33 elements, got '
/*     */     //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   78: aload_0
/*     */     //   79: invokevirtual size : ()I
/*     */     //   82: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   85: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   88: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   91: nop
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual size : ()I
/*     */     //   96: aload_0
/*     */     //   97: invokevirtual size : ()I
/*     */     //   100: invokestatic rootSize : (I)I
/*     */     //   103: isub
/*     */     //   104: aload_0
/*     */     //   105: getfield tail : [Ljava/lang/Object;
/*     */     //   108: arraylength
/*     */     //   109: bipush #32
/*     */     //   111: invokestatic coerceAtMost : (II)I
/*     */     //   114: if_icmpgt -> 121
/*     */     //   117: iconst_1
/*     */     //   118: goto -> 122
/*     */     //   121: iconst_0
/*     */     //   122: invokestatic assert : (Z)V
/*     */     //   125: nop
/*     */     //   126: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #27	-> 12
/*     */     //   #24	-> 16
/*     */     //   #25	-> 21
/*     */     //   #26	-> 26
/*     */     //   #27	-> 31
/*     */     //   #29	-> 37
/*     */     //   #30	-> 38
/*     */     //   #329	-> 57
/*     */     //   #332	-> 58
/*     */     //   #333	-> 63
/*     */     //   #31	-> 66
/*     */     //   #32	-> 78
/*     */     //   #31	-> 82
/*     */     //   #333	-> 88
/*     */     //   #335	-> 91
/*     */     //   #34	-> 92
/*     */     //   #35	-> 125
/*     */     //   #24	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   66	22	7	$i$a$-requirePrecondition-PersistentVector$1	I
/*     */     //   57	35	6	$i$f$requirePrecondition	I
/*     */     //   54	38	5	value$iv	Z
/*     */     //   0	127	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;
/*     */     //   0	127	1	root	[Ljava/lang/Object;
/*     */     //   0	127	2	tail	[Ljava/lang/Object;
/*     */     //   0	127	3	size	I
/*     */     //   0	127	4	rootShift	I
/*     */   }
/*     */   
/*     */   private final int rootSize() {
/*  37 */     return UtilsKt.rootSize(size());
/*     */   } @NotNull
/*     */   public PersistentList<E> add(Object element) {
/*  40 */     int tailSize = size() - rootSize();
/*  41 */     if (tailSize < 32) {
/*  42 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.tail, 32), "copyOf(...)"); Object[] arrayOfObject = Arrays.copyOf(this.tail, 32);
/*  43 */       arrayOfObject[tailSize] = element;
/*  44 */       return new PersistentVector(this.root, arrayOfObject, size() + 1, this.rootShift);
/*     */     } 
/*     */     
/*  47 */     Object[] newTail = UtilsKt.presizedBufferWith(element);
/*  48 */     return pushFilledTail(this.root, this.tail, newTail);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final PersistentVector<E> pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
/*  55 */     if (size() >> 5 > 1 << this.rootShift) {
/*     */       
/*  57 */       Object[] arrayOfObject = UtilsKt.presizedBufferWith(root);
/*  58 */       int newRootShift = this.rootShift + 5;
/*  59 */       arrayOfObject = pushTail(arrayOfObject, newRootShift, filledTail);
/*  60 */       return new PersistentVector(arrayOfObject, newTail, size() + 1, newRootShift);
/*     */     } 
/*     */     
/*  63 */     Object[] newRoot = pushTail(root, this.rootShift, filledTail);
/*  64 */     return new PersistentVector(newRoot, newTail, size() + 1, this.rootShift);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object[] pushTail(Object[] root, int shift, Object[] tail) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual size : ()I
/*     */     //   4: iconst_1
/*     */     //   5: isub
/*     */     //   6: iload_2
/*     */     //   7: invokestatic indexSegment : (II)I
/*     */     //   10: istore #4
/*     */     //   12: aload_1
/*     */     //   13: dup
/*     */     //   14: ifnull -> 32
/*     */     //   17: bipush #32
/*     */     //   19: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   22: dup
/*     */     //   23: ldc 'copyOf(...)'
/*     */     //   25: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   28: dup
/*     */     //   29: ifnonnull -> 38
/*     */     //   32: pop
/*     */     //   33: bipush #32
/*     */     //   35: anewarray java/lang/Object
/*     */     //   38: astore #5
/*     */     //   40: iload_2
/*     */     //   41: iconst_5
/*     */     //   42: if_icmpne -> 54
/*     */     //   45: aload #5
/*     */     //   47: iload #4
/*     */     //   49: aload_3
/*     */     //   50: aastore
/*     */     //   51: goto -> 75
/*     */     //   54: aload #5
/*     */     //   56: iload #4
/*     */     //   58: aload_0
/*     */     //   59: aload #5
/*     */     //   61: iload #4
/*     */     //   63: aaload
/*     */     //   64: checkcast [Ljava/lang/Object;
/*     */     //   67: iload_2
/*     */     //   68: iconst_5
/*     */     //   69: isub
/*     */     //   70: aload_3
/*     */     //   71: invokespecial pushTail : ([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   74: aastore
/*     */     //   75: aload #5
/*     */     //   77: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 0
/*     */     //   #73	-> 12
/*     */     //   #73	-> 28
/*     */     //   #75	-> 40
/*     */     //   #76	-> 45
/*     */     //   #80	-> 54
/*     */     //   #82	-> 75
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   12	66	4	bufferIndex	I
/*     */     //   40	38	5	newRootNode	[Ljava/lang/Object;
/*     */     //   0	78	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;
/*     */     //   0	78	1	root	[Ljava/lang/Object;
/*     */     //   0	78	2	shift	I
/*     */     //   0	78	3	tail	[Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public PersistentList<E> add(int index, Object element) {
/*  86 */     ListImplementation.checkPositionIndex$runtime(index, size());
/*  87 */     if (index == size()) {
/*  88 */       return add((E)element);
/*     */     }
/*     */     
/*  91 */     int rootSize = rootSize();
/*  92 */     if (index >= rootSize) {
/*  93 */       return insertIntoTail(this.root, index - rootSize, element);
/*     */     }
/*     */     
/*  96 */     ObjectRef elementCarry = new ObjectRef(null);
/*  97 */     Object[] newRoot = insertIntoRoot(this.root, this.rootShift, index, element, elementCarry);
/*  98 */     return insertIntoTail(newRoot, 0, elementCarry.getValue());
/*     */   }
/*     */   
/*     */   private final PersistentVector<E> insertIntoTail(Object[] root, int tailIndex, Object element) {
/* 102 */     int tailSize = size() - rootSize();
/* 103 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.tail, 32), "copyOf(...)"); Object[] newTail = Arrays.copyOf(this.tail, 32);
/* 104 */     if (tailSize < 32) {
/* 105 */       ArraysKt.copyInto(this.tail, newTail, tailIndex + 1, tailIndex, tailSize);
/* 106 */       newTail[tailIndex] = element;
/* 107 */       return new PersistentVector(root, newTail, size() + 1, this.rootShift);
/*     */     } 
/*     */     
/* 110 */     Object lastElement = this.tail[31];
/* 111 */     ArraysKt.copyInto(this.tail, newTail, tailIndex + 1, tailIndex, tailSize - 1);
/* 112 */     newTail[tailIndex] = element;
/* 113 */     return pushFilledTail(root, newTail, UtilsKt.presizedBufferWith(lastElement));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
/* 124 */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*     */     
/* 126 */     if (shift == 0) {
/* 127 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] arrayOfObject = (bufferIndex == 0) ? new Object[32] : Arrays.copyOf(root, 32);
/* 128 */       ArraysKt.copyInto(root, arrayOfObject, bufferIndex + 1, bufferIndex, 31);
/* 129 */       elementCarry.setValue(root[31]);
/* 130 */       arrayOfObject[bufferIndex] = element;
/* 131 */       return arrayOfObject;
/*     */     } 
/*     */     
/* 134 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] newRoot = Arrays.copyOf(root, 32);
/* 135 */     int lowerLevelShift = shift - 5;
/*     */ 
/*     */     
/* 138 */     Intrinsics.checkNotNull(root[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); newRoot[bufferIndex] = insertIntoRoot((Object[])root[bufferIndex], lowerLevelShift, index, element, elementCarry);
/*     */     
/* 140 */     for (int i = bufferIndex + 1; i < 32 && 
/* 141 */       newRoot[i] != null; i++) {
/*     */ 
/*     */       
/* 144 */       Intrinsics.checkNotNull(root[i], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); newRoot[i] = insertIntoRoot((Object[])root[i], lowerLevelShift, 0, elementCarry.getValue(), elementCarry);
/*     */     } 
/*     */     
/* 147 */     return newRoot;
/*     */   }
/*     */   @NotNull
/*     */   public PersistentList<E> removeAt(int index) {
/* 151 */     ListImplementation.checkElementIndex$runtime(index, size());
/* 152 */     int rootSize = rootSize();
/* 153 */     if (index >= rootSize) {
/* 154 */       return removeFromTailAt(this.root, rootSize, this.rootShift, index - rootSize);
/*     */     }
/* 156 */     Object[] newRoot = removeFromRootAt(this.root, this.rootShift, index, new ObjectRef(this.tail[0]));
/* 157 */     return removeFromTailAt(newRoot, rootSize, this.rootShift, 0);
/*     */   }
/*     */   
/*     */   private final PersistentList<E> removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
/* 161 */     int tailSize = size() - rootSize;
/* 162 */     CommonFunctionsKt.assert((index < tailSize));
/*     */     
/* 164 */     if (tailSize == 1) {
/* 165 */       return pullLastBufferFromRoot(root, rootSize, shift);
/*     */     }
/* 167 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.tail, 32), "copyOf(...)"); Object[] newTail = Arrays.copyOf(this.tail, 32);
/* 168 */     if (index < tailSize - 1) {
/* 169 */       ArraysKt.copyInto(this.tail, newTail, index, index + 1, tailSize);
/*     */     }
/* 171 */     newTail[tailSize - 1] = null;
/* 172 */     return new PersistentVector(root, newTail, rootSize + tailSize - 1, shift);
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
/*     */   private final PersistentList<E> pullLastBufferFromRoot(Object[] root, int rootSize, int shift) {
/* 185 */     if (shift == 0) {
/* 186 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] buffer = (root.length == 33) ? Arrays.copyOf(root, 32) : root;
/* 187 */       return new SmallPersistentVector<>(buffer);
/*     */     } 
/* 189 */     ObjectRef tailCarry = new ObjectRef(null);
/* 190 */     Intrinsics.checkNotNull(pullLastBuffer(root, shift, rootSize - 1, tailCarry)); Object[] newRoot = pullLastBuffer(root, shift, rootSize - 1, tailCarry);
/*     */     
/* 192 */     Intrinsics.checkNotNull(tailCarry.getValue(), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); Object[] newTail = (Object[])tailCarry.getValue();
/*     */ 
/*     */     
/* 195 */     if (newRoot[1] == null) {
/*     */ 
/*     */       
/* 198 */       Intrinsics.checkNotNull(newRoot[0], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); Object[] lowerLevelRoot = (Object[])newRoot[0];
/* 199 */       return new PersistentVector(lowerLevelRoot, newTail, rootSize, shift - 5);
/*     */     } 
/* 201 */     return new PersistentVector(newRoot, newTail, rootSize, shift);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object[] pullLastBuffer(Object[] root, int shift, int index, ObjectRef tailCarry) {
/* 210 */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*     */ 
/*     */     
/* 213 */     tailCarry.setValue(root[bufferIndex]);
/*     */ 
/*     */ 
/*     */     
/* 217 */     Intrinsics.checkNotNull(root[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); Object[] newBufferAtIndex = (shift == 5) ? null : pullLastBuffer((Object[])root[bufferIndex], shift - 5, index, tailCarry);
/*     */ 
/*     */     
/* 220 */     if (newBufferAtIndex == null && bufferIndex == 0) {
/* 221 */       return null;
/*     */     }
/*     */     
/* 224 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] newRoot = Arrays.copyOf(root, 32);
/* 225 */     newRoot[bufferIndex] = newBufferAtIndex;
/* 226 */     return newRoot;
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
/*     */   private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
/* 238 */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*     */     
/* 240 */     if (shift == 0) {
/* 241 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] arrayOfObject = (bufferIndex == 0) ? new Object[32] : Arrays.copyOf(root, 32);
/* 242 */       ArraysKt.copyInto(root, arrayOfObject, bufferIndex, bufferIndex + 1, 32);
/* 243 */       arrayOfObject[31] = tailCarry.getValue();
/* 244 */       tailCarry.setValue(root[bufferIndex]);
/* 245 */       return arrayOfObject;
/*     */     } 
/*     */     
/* 248 */     int bufferLastIndex = 31;
/* 249 */     if (root[bufferLastIndex] == null) {
/* 250 */       bufferLastIndex = UtilsKt.indexSegment(rootSize() - 1, shift);
/*     */     }
/*     */     
/* 253 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)"); Object[] newRoot = Arrays.copyOf(root, 32);
/* 254 */     int lowerLevelShift = shift - 5;
/*     */     
/* 256 */     int i = bufferLastIndex, j = bufferIndex + 1; if (j <= i)
/*     */       while (true) {
/* 258 */         Intrinsics.checkNotNull(newRoot[i], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); newRoot[i] = removeFromRootAt((Object[])newRoot[i], lowerLevelShift, 0, tailCarry); if (i != j) {
/*     */           i--; continue;
/*     */         }  break;
/* 261 */       }   Intrinsics.checkNotNull(newRoot[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); newRoot[bufferIndex] = removeFromRootAt((Object[])newRoot[bufferIndex], lowerLevelShift, index, tailCarry);
/*     */     
/* 263 */     return newRoot;
/*     */   }
/*     */   @NotNull
/*     */   public PersistentList<E> removeAll(@NotNull Function1<? super E, Boolean> predicate) {
/* 267 */     Intrinsics.checkNotNullParameter(predicate, "predicate"); PersistentVectorBuilder<E> persistentVectorBuilder1 = builder(), it = persistentVectorBuilder1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     int $i$a$-also-PersistentVector$removeAll$1 = 0;
/*     */     it.removeAllWithPredicate(predicate);
/*     */     return persistentVectorBuilder1.build();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentVectorBuilder<E> builder() {
/*     */     return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<E> listIterator(int index) {
/*     */     ListImplementation.checkPositionIndex$runtime(index, size());
/*     */     return new PersistentVectorIterator<>(this.root, (E[])this.tail, index, size(), this.rootShift / 5 + 1);
/*     */   }
/*     */   
/*     */   private final Object[] bufferFor(int index) {
/*     */     if (rootSize() <= index)
/*     */       return this.tail; 
/*     */     Object[] buffer = this.root;
/*     */     int shift = this.rootShift;
/*     */     while (shift > 0) {
/*     */       Intrinsics.checkNotNull(buffer[UtilsKt.indexSegment(index, shift)], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*     */       buffer = (Object[])buffer[UtilsKt.indexSegment(index, shift)];
/*     */       shift -= 5;
/*     */     } 
/*     */     return buffer;
/*     */   }
/*     */   
/*     */   public E get(int index) {
/*     */     ListImplementation.checkElementIndex$runtime(index, size());
/*     */     Object[] buffer = bufferFor(index);
/*     */     return (E)buffer[index & 0x1F];
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentList<E> set(int index, Object element) {
/*     */     ListImplementation.checkElementIndex$runtime(index, size());
/*     */     if (rootSize() <= index) {
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.tail, 32), "copyOf(...)");
/*     */       Object[] newTail = Arrays.copyOf(this.tail, 32);
/*     */       newTail[index & 0x1F] = element;
/*     */       return new PersistentVector(this.root, newTail, size(), this.rootShift);
/*     */     } 
/*     */     Object[] newRoot = setInRoot(this.root, this.rootShift, index, element);
/*     */     return new PersistentVector(newRoot, this.tail, size(), this.rootShift);
/*     */   }
/*     */   
/*     */   private final Object[] setInRoot(Object[] root, int shift, int index, Object e) {
/*     */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*     */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(root, 32), "copyOf(...)");
/*     */     Object[] newRoot = Arrays.copyOf(root, 32);
/*     */     if (shift == 0) {
/*     */       newRoot[bufferIndex] = e;
/*     */     } else {
/*     */       Intrinsics.checkNotNull(newRoot[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*     */       newRoot[bufferIndex] = setInRoot((Object[])newRoot[bufferIndex], shift - 5, index, e);
/*     */     } 
/*     */     return newRoot;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\PersistentVector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */