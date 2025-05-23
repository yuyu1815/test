/*      */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\007\n\002\020(\n\002\b\b\n\002\030\002\n\002\b\013\n\002\020)\n\000\n\002\020*\n\000\n\002\020+\n\002\b\035\n\002\030\002\n\002\b\004\n\002\020!\n\002\b\030\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B=\022\f\020\004\032\b\022\004\022\0028\0000\005\022\020\020\006\032\f\022\006\022\004\030\0010\b\030\0010\007\022\016\020\t\032\n\022\006\022\004\030\0010\b0\007\022\006\020\n\032\0020\013¢\006\002\020\fJ\025\020\034\032\0020\0352\006\020\036\032\0028\000H\026¢\006\002\020\037J\035\020\034\032\0020 2\006\020!\032\0020\0132\006\020\036\032\0028\000H\026¢\006\002\020\"J\036\020#\032\0020\0352\006\020!\032\0020\0132\f\020$\032\b\022\004\022\0028\0000%H\026J\026\020#\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J\035\020&\032\n\022\006\022\004\030\0010\b0\0072\006\020!\032\0020\013H\002¢\006\002\020'J\016\020(\032\b\022\004\022\0028\0000\005H\026J=\020)\032\n\022\006\022\004\030\0010\b0\0072\016\020*\032\n\022\006\022\004\030\0010\b0\0072\006\020+\032\0020\0132\016\020,\032\n\022\006\022\004\030\0010\b0-H\002¢\006\002\020.J\026\020/\032\0028\0002\006\020!\032\0020\013H\002¢\006\002\0200J\r\0201\032\0020\013H\000¢\006\002\b2JG\0203\032\n\022\006\022\004\030\0010\b0\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\0204\032\0020\0132\006\020!\032\0020\0132\b\020\036\032\004\030\0010\b2\006\0205\032\00206H\002¢\006\002\0207J[\0203\032\0020 2\f\020$\032\b\022\004\022\0028\0000%2\006\020!\032\0020\0132\006\0208\032\0020\0132\026\0209\032\022\022\016\022\f\022\006\022\004\030\0010\b\030\0010\0070\0072\006\020:\032\0020\0132\016\020;\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\002\020<J/\020=\032\0020 2\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\006\020!\032\0020\0132\006\020\036\032\0028\000H\002¢\006\002\020>J\035\020?\032\0020\0352\016\020*\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\002\020@J\017\020A\032\b\022\004\022\0028\0000BH\002J\036\020C\032\020\022\f\022\n\022\006\022\004\030\0010\b0\0070D2\006\020!\032\0020\013H\002J\016\020E\032\b\022\004\022\0028\0000FH\026J\026\020E\032\b\022\004\022\0028\0000F2\006\020!\032\0020\013H\026J'\020G\032\n\022\006\022\004\030\0010\b0\0072\020\020*\032\f\022\006\022\004\030\0010\b\030\0010\007H\002¢\006\002\020HJ-\020I\032\n\022\006\022\004\030\0010\b0\0072\016\020*\032\n\022\006\022\004\030\0010\b0\0072\006\020J\032\0020\013H\002¢\006\002\020KJ\025\020L\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\002\020\022J\037\020M\032\n\022\006\022\004\030\0010\b0\0072\b\020\036\032\004\030\0010\bH\002¢\006\002\020NJ5\020O\032\n\022\006\022\004\030\0010\b0\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\020!\032\0020\0132\006\0204\032\0020\013H\002¢\006\002\020PJ?\020Q\032\f\022\006\022\004\030\0010\b\030\0010\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\0204\032\0020\0132\006\020R\032\0020\0132\006\020S\032\00206H\002¢\006\002\020TJ/\020U\032\0020 2\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\006\020R\032\0020\0132\006\0204\032\0020\013H\002¢\006\002\020VJM\020W\032\n\022\006\022\004\030\0010\b0\0072\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\006\020R\032\0020\0132\006\0204\032\0020\0132\024\020X\032\020\022\f\022\n\022\006\022\004\030\0010\b0\0070-H\002¢\006\002\020YJE\020Z\032\n\022\006\022\004\030\0010\b0\0072\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\006\020R\032\0020\0132\024\0209\032\020\022\f\022\n\022\006\022\004\030\0010\b0\0070\007H\002¢\006\002\020[J?\020\\\032\0020 2\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\016\020]\032\n\022\006\022\004\030\0010\b0\0072\016\020^\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\002\020_J?\020`\032\n\022\006\022\004\030\0010\b0\0072\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\016\020\032\032\n\022\006\022\004\030\0010\b0\0072\006\0204\032\0020\013H\002¢\006\002\020aJu\020b\032\0020\0132\022\020c\032\016\022\004\022\0028\000\022\004\022\0020\0350d2\016\020*\032\n\022\006\022\004\030\0010\b0\0072\006\020e\032\0020\0132\006\020f\032\0020\0132\006\020g\032\002062\024\020h\032\020\022\f\022\n\022\006\022\004\030\0010\b0\0070i2\024\0209\032\020\022\f\022\n\022\006\022\004\030\0010\b0\0070iH\002¢\006\002\020jJ\034\020k\032\0020\0352\022\020c\032\016\022\004\022\0028\000\022\004\022\0020\0350dH\002JA\020k\032\0020\0132\022\020c\032\016\022\004\022\0028\000\022\004\022\0020\0350d2\016\020*\032\n\022\006\022\004\030\0010\b0\0072\006\020e\032\0020\0132\006\020g\032\00206H\002¢\006\002\020lJ\026\020k\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J,\020m\032\0020\0132\022\020c\032\016\022\004\022\0028\000\022\004\022\0020\0350d2\006\020n\032\0020\0132\006\020g\032\00206H\002J\032\020o\032\0020\0352\022\020c\032\016\022\004\022\0028\000\022\004\022\0020\0350dJ\025\020p\032\0028\0002\006\020!\032\0020\013H\026¢\006\002\0200J=\020q\032\n\022\006\022\004\030\0010\b0\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\0204\032\0020\0132\006\020!\032\0020\0132\006\020S\032\00206H\002¢\006\002\020TJ9\020r\032\004\030\0010\b2\020\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\006\020R\032\0020\0132\006\0204\032\0020\0132\006\020!\032\0020\013H\002¢\006\002\020sJ/\020t\032\f\022\006\022\004\030\0010\b\030\0010\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\020\030\032\0020\013H\002¢\006\002\020KJ\b\020R\032\0020\013H\002J\036\020u\032\0028\0002\006\020!\032\0020\0132\006\020\036\032\0028\000H\002¢\006\002\020vJE\020w\032\n\022\006\022\004\030\0010\b0\0072\016\020\020\032\n\022\006\022\004\030\0010\b0\0072\006\0204\032\0020\0132\006\020!\032\0020\0132\006\020x\032\0028\0002\006\020y\032\00206H\002¢\006\002\0207JU\020z\032\n\022\006\022\004\030\0010\b0\0072\006\020{\032\0020\0132\006\0208\032\0020\0132\026\0209\032\022\022\016\022\f\022\006\022\004\030\0010\b\030\0010\0070\0072\006\020:\032\0020\0132\016\020;\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\002\020|Jl\020}\032\0020 2\f\020$\032\b\022\004\022\0028\0000%2\006\020!\032\0020\0132\016\020~\032\n\022\006\022\004\030\0010\b0\0072\006\020\032\0020\0132\026\0209\032\022\022\016\022\f\022\006\022\004\030\0010\b\030\0010\0070\0072\006\020:\032\0020\0132\016\020;\032\n\022\006\022\004\030\0010\b0\007H\002¢\006\003\020\001J\b\020n\032\0020\013H\002J\020\020n\032\0020\0132\006\020\030\032\0020\013H\002R\016\020\r\032\0020\016X\016¢\006\002\n\000R4\020\020\032\f\022\006\022\004\030\0010\b\030\0010\0072\020\020\017\032\f\022\006\022\004\030\0010\b\030\0010\007@BX\016¢\006\n\n\002\020\023\032\004\b\021\020\022R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R\036\020\030\032\0020\0132\006\020\017\032\0020\013@RX\016¢\006\b\n\000\032\004\b\031\020\025R0\020\032\032\n\022\006\022\004\030\0010\b0\0072\016\020\017\032\n\022\006\022\004\030\0010\b0\007@BX\016¢\006\n\n\002\020\023\032\004\b\033\020\022R\024\020\004\032\b\022\004\022\0028\0000\005X\016¢\006\002\n\000R\032\020\006\032\f\022\006\022\004\030\0010\b\030\0010\007X\016¢\006\004\n\002\020\023R\030\020\t\032\n\022\006\022\004\030\0010\b0\007X\016¢\006\004\n\002\020\023¨\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "", "", "vectorTail", "rootShift", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "root", "getRoot$runtime", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getRootShift$runtime", "()I", "setRootShift$runtime", "(I)V", "size", "getSize", "tail", "getTail$runtime", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "bufferFor", "(I)[Ljava/lang/Object;", "build", "copyToBuffer", "buffer", "bufferIndex", "sourceIterator", "", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "getModCount", "getModCount$runtime", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rightShift", "buffers", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "isMutable", "([Ljava/lang/Object;)Z", "iterator", "", "leafBufferIterator", "", "listIterator", "", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "makeMutableShiftingRight", "distance", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBuffer", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "pullLastBuffer", "rootSize", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pushBuffers", "buffersIterator", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "recyclableRemoveAll", "predicate", "Lkotlin/Function1;", "bufferSize", "toBufferSize", "bufferRef", "recyclableBuffers", "", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "removeAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "removeAllFromTail", "tailSize", "removeAllWithPredicate", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "retainFirst", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setInRoot", "e", "oldElementCarry", "shiftLeafBuffers", "startLeafIndex", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "splitToBuffers", "startBuffer", "startBufferSize", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,995:1\n33#2,7:996\n33#2,7:1003\n33#2,7:1011\n33#2,7:1019\n33#2,7:1026\n1#3:1010\n26#4:1018\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,7\n243#1:1003,7\n480#1:1011,7\n746#1:1019,7\n769#1:1026,7\n623#1:1018\n*E\n"})
/*      */ public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
/*      */   @NotNull
/*      */   private PersistentList<? extends E> vector;
/*      */   @Nullable
/*      */   private Object[] vectorRoot;
/*      */   @NotNull
/*      */   private Object[] vectorTail;
/*      */   private int rootShift;
/*      */   
/*   15 */   public PersistentVectorBuilder(@NotNull PersistentList<? extends E> vector, @Nullable Object[] vectorRoot, @NotNull Object[] vectorTail, int rootShift) { this.vector = vector;
/*   16 */     this.vectorRoot = vectorRoot;
/*   17 */     this.vectorTail = vectorTail;
/*   18 */     this.rootShift = rootShift;
/*   19 */     this.ownership = new MutabilityOwnership();
/*   20 */     this.root = this.vectorRoot;
/*      */     
/*   22 */     this.tail = this.vectorTail;
/*      */     
/*   24 */     this.size = this.vector.size(); } @NotNull private MutabilityOwnership ownership; @Nullable private Object[] root; @NotNull private Object[] tail; private int size; public static final int $stable = 8; public final int getRootShift$runtime() { return this.rootShift; } public final void setRootShift$runtime(int <set-?>) { this.rootShift = <set-?>; } @Nullable public final Object[] getRoot$runtime() { return this.root; } @NotNull public final Object[] getTail$runtime() { return this.tail; } public int getSize() { return this.size; }
/*      */   
/*      */   public final int getModCount$runtime() {
/*   27 */     return this.modCount;
/*      */   }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public PersistentList<E> build() {
/*   33 */     this.ownership = new MutabilityOwnership();
/*   34 */     this.vectorRoot = this.root;
/*   35 */     this.vectorTail = this.tail;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   40 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.tail, size()), "copyOf(...)");
/*      */ 
/*      */     
/*   43 */     Intrinsics.checkNotNull(this.root); this.vector = (this.root == this.vectorRoot && this.tail == this.vectorTail) ? this.vector : ((this.root == null) ? (((this.tail.length == 0)) ? UtilsKt.<E>persistentVectorOf() : new SmallPersistentVector<>(Arrays.copyOf(this.tail, size()))) : new PersistentVector<>(this.root, this.tail, size(), this.rootShift));
/*      */ 
/*      */     
/*   46 */     return (PersistentList)this.vector;
/*      */   }
/*      */   
/*      */   private final int rootSize() {
/*   50 */     if (size() <= 32) {
/*   51 */       return 0;
/*      */     }
/*   53 */     return UtilsKt.rootSize(size());
/*      */   }
/*      */   
/*      */   private final int tailSize(int size) {
/*   57 */     if (size <= 32) {
/*   58 */       return size;
/*      */     }
/*   60 */     return size - UtilsKt.rootSize(size);
/*      */   }
/*      */   
/*      */   private final int tailSize() {
/*   64 */     return tailSize(size());
/*      */   }
/*      */   
/*      */   private final boolean isMutable(Object[] buffer) {
/*   68 */     return (buffer.length == 33 && buffer[32] == this.ownership);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Object[] makeMutable(Object[] buffer) {
/*   75 */     if (buffer == null) {
/*   76 */       return mutableBuffer();
/*      */     }
/*   78 */     if (isMutable(buffer)) {
/*   79 */       return buffer;
/*      */     }
/*   81 */     return ArraysKt.copyInto$default(buffer, mutableBuffer(), 0, 0, RangesKt.coerceAtMost(buffer.length, 32), 6, null);
/*      */   }
/*      */   
/*      */   private final Object[] makeMutableShiftingRight(Object[] buffer, int distance) {
/*   85 */     if (isMutable(buffer)) {
/*   86 */       return ArraysKt.copyInto(buffer, buffer, distance, 0, 32 - distance);
/*      */     }
/*   88 */     return ArraysKt.copyInto(buffer, mutableBuffer(), distance, 0, 32 - distance);
/*      */   }
/*      */   
/*      */   private final Object[] mutableBufferWith(Object element) {
/*   92 */     Object[] buffer = new Object[33];
/*   93 */     buffer[0] = element;
/*   94 */     buffer[32] = this.ownership;
/*   95 */     return buffer;
/*      */   }
/*      */   
/*      */   private final Object[] mutableBuffer() {
/*   99 */     Object[] buffer = new Object[33];
/*  100 */     buffer[32] = this.ownership;
/*  101 */     return buffer;
/*      */   }
/*      */   
/*      */   public boolean add(Object element) {
/*  105 */     this.modCount++;
/*      */     
/*  107 */     int tailSize = tailSize();
/*  108 */     if (tailSize < 32) {
/*  109 */       Object[] mutableTail = makeMutable(this.tail);
/*  110 */       mutableTail[tailSize] = element;
/*  111 */       this.tail = mutableTail;
/*  112 */       this.size = size() + 1;
/*      */     } else {
/*  114 */       Object[] newTail = mutableBufferWith(element);
/*  115 */       pushFilledTail(this.root, this.tail, newTail);
/*      */     } 
/*  117 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final void pushFilledTail(Object[] root, Object[] filledTail, Object[] newTail) {
/*  124 */     if (size() >> 5 > 1 << this.rootShift) {
/*      */       
/*  126 */       this.root = pushTail(mutableBufferWith(root), filledTail, this.rootShift + 5);
/*  127 */       this.tail = newTail;
/*  128 */       this.rootShift += 5;
/*  129 */       this.size = size() + 1;
/*      */     }
/*  131 */     else if (root == null) {
/*  132 */       this.root = filledTail;
/*  133 */       this.tail = newTail;
/*  134 */       this.size = size() + 1;
/*      */     } else {
/*      */       
/*  137 */       this.root = pushTail(root, filledTail, this.rootShift);
/*  138 */       this.tail = newTail;
/*  139 */       this.size = size() + 1;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Object[] pushTail(Object[] root, Object[] tail, int shift) {
/*  148 */     int index = UtilsKt.indexSegment(size() - 1, shift);
/*  149 */     Object[] mutableRoot = makeMutable(root);
/*      */     
/*  151 */     if (shift == 5) {
/*  152 */       mutableRoot[index] = tail;
/*      */     } else {
/*      */       
/*  155 */       mutableRoot[index] = pushTail((Object[])mutableRoot[index], tail, shift - 5);
/*      */     } 
/*  157 */     return mutableRoot;
/*      */   }
/*      */   
/*      */   public boolean addAll(@NotNull Collection elements) {
/*  161 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) {
/*  162 */       return false;
/*      */     }
/*      */     
/*  165 */     int i = this.modCount; this.modCount = i + 1;
/*      */     
/*  167 */     int tailSize = tailSize();
/*  168 */     Iterator<? extends Object> elementsIterator = elements.iterator();
/*      */     
/*  170 */     if (32 - tailSize >= elements.size()) {
/*      */       
/*  172 */       this.tail = copyToBuffer(makeMutable(this.tail), tailSize, elementsIterator);
/*  173 */       this.size = size() + elements.size();
/*      */     } else {
/*  175 */       int buffersSize = (elements.size() + tailSize - 1) / 32;
/*  176 */       Object[][] buffers = new Object[buffersSize][];
/*      */ 
/*      */       
/*  179 */       buffers[0] = copyToBuffer(makeMutable(this.tail), tailSize, elementsIterator);
/*      */       
/*  181 */       for (int index = 1; index < buffersSize; index++) {
/*  182 */         buffers[index] = copyToBuffer(mutableBuffer(), 0, elementsIterator);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  187 */       this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), buffers);
/*      */       
/*  189 */       this.tail = copyToBuffer(mutableBuffer(), 0, elementsIterator);
/*  190 */       this.size = size() + elements.size();
/*      */     } 
/*      */     
/*  193 */     return true;
/*      */   }
/*      */   
/*      */   private final Object[] copyToBuffer(Object[] buffer, int bufferIndex, Iterator sourceIterator) {
/*  197 */     int index = bufferIndex;
/*  198 */     while (index < 32 && sourceIterator.hasNext()) {
/*  199 */       buffer[index++] = sourceIterator.next();
/*      */     }
/*  201 */     return buffer;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] root, int rootSize, Object[][] buffers) {
/*  211 */     Iterator<Object[]> buffersIterator = ArrayIteratorKt.iterator((Object[])buffers);
/*      */     
/*  213 */     Object[] mutableRoot = 
/*  214 */       (rootSize >> 5 < 1 << this.rootShift) ? 
/*      */       
/*  216 */       pushBuffers(root, rootSize, this.rootShift, buffersIterator) : 
/*      */ 
/*      */       
/*  219 */       makeMutable(root);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  224 */     while (buffersIterator.hasNext()) {
/*      */       
/*  226 */       this.rootShift += 5;
/*  227 */       mutableRoot = mutableBufferWith(mutableRoot);
/*      */       
/*  229 */       pushBuffers(mutableRoot, 1 << this.rootShift, this.rootShift, buffersIterator);
/*      */     } 
/*      */     
/*  232 */     return mutableRoot;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Object[] pushBuffers(Object[] root, int rootSize, int shift, Iterator buffersIterator) {
/*      */     // Byte code:
/*      */     //   0: aload #4
/*      */     //   2: invokeinterface hasNext : ()Z
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: nop
/*      */     //   13: iload #5
/*      */     //   15: ifne -> 26
/*      */     //   18: iconst_0
/*      */     //   19: istore #7
/*      */     //   21: ldc 'invalid buffersIterator'
/*      */     //   23: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   26: nop
/*      */     //   27: iload_3
/*      */     //   28: iflt -> 35
/*      */     //   31: iconst_1
/*      */     //   32: goto -> 36
/*      */     //   35: iconst_0
/*      */     //   36: istore #5
/*      */     //   38: iconst_0
/*      */     //   39: istore #6
/*      */     //   41: nop
/*      */     //   42: iload #5
/*      */     //   44: ifne -> 55
/*      */     //   47: iconst_0
/*      */     //   48: istore #7
/*      */     //   50: ldc 'negative shift'
/*      */     //   52: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   55: nop
/*      */     //   56: iload_3
/*      */     //   57: ifne -> 71
/*      */     //   60: aload #4
/*      */     //   62: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   67: checkcast [Ljava/lang/Object;
/*      */     //   70: areturn
/*      */     //   71: aload_0
/*      */     //   72: aload_1
/*      */     //   73: invokespecial makeMutable : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*      */     //   76: astore #5
/*      */     //   78: iload_2
/*      */     //   79: iload_3
/*      */     //   80: invokestatic indexSegment : (II)I
/*      */     //   83: istore #6
/*      */     //   85: aload #5
/*      */     //   87: iload #6
/*      */     //   89: aload_0
/*      */     //   90: aload #5
/*      */     //   92: iload #6
/*      */     //   94: aaload
/*      */     //   95: checkcast [Ljava/lang/Object;
/*      */     //   98: iload_2
/*      */     //   99: iload_3
/*      */     //   100: iconst_5
/*      */     //   101: isub
/*      */     //   102: aload #4
/*      */     //   104: invokespecial pushBuffers : ([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;
/*      */     //   107: aastore
/*      */     //   108: iinc #6, 1
/*      */     //   111: iload #6
/*      */     //   113: bipush #32
/*      */     //   115: if_icmpge -> 154
/*      */     //   118: aload #4
/*      */     //   120: invokeinterface hasNext : ()Z
/*      */     //   125: ifeq -> 154
/*      */     //   128: aload #5
/*      */     //   130: iload #6
/*      */     //   132: aload_0
/*      */     //   133: aload #5
/*      */     //   135: iload #6
/*      */     //   137: aaload
/*      */     //   138: checkcast [Ljava/lang/Object;
/*      */     //   141: iconst_0
/*      */     //   142: iload_3
/*      */     //   143: iconst_5
/*      */     //   144: isub
/*      */     //   145: aload #4
/*      */     //   147: invokespecial pushBuffers : ([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;
/*      */     //   150: aastore
/*      */     //   151: goto -> 108
/*      */     //   154: aload #5
/*      */     //   156: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #242	-> 0
/*      */     //   #996	-> 12
/*      */     //   #999	-> 13
/*      */     //   #1000	-> 18
/*      */     //   #242	-> 21
/*      */     //   #1000	-> 23
/*      */     //   #1002	-> 26
/*      */     //   #243	-> 27
/*      */     //   #1003	-> 41
/*      */     //   #1006	-> 42
/*      */     //   #1007	-> 47
/*      */     //   #243	-> 50
/*      */     //   #1007	-> 52
/*      */     //   #1009	-> 55
/*      */     //   #245	-> 56
/*      */     //   #246	-> 60
/*      */     //   #249	-> 71
/*      */     //   #250	-> 78
/*      */     //   #253	-> 85
/*      */     //   #254	-> 89
/*      */     //   #256	-> 108
/*      */     //   #258	-> 128
/*      */     //   #259	-> 132
/*      */     //   #261	-> 154
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   21	2	7	$i$a$-requirePrecondition-PersistentVectorBuilder$pushBuffers$1	I
/*      */     //   12	15	6	$i$f$requirePrecondition	I
/*      */     //   9	18	5	value$iv	Z
/*      */     //   50	2	7	$i$a$-requirePrecondition-PersistentVectorBuilder$pushBuffers$2	I
/*      */     //   41	15	6	$i$f$requirePrecondition	I
/*      */     //   38	18	5	value$iv	Z
/*      */     //   78	79	5	mutableRoot	[Ljava/lang/Object;
/*      */     //   85	72	6	index	I
/*      */     //   0	157	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;
/*      */     //   0	157	1	root	[Ljava/lang/Object;
/*      */     //   0	157	2	rootSize	I
/*      */     //   0	157	3	shift	I
/*      */     //   0	157	4	buffersIterator	Ljava/util/Iterator;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void add(int index, Object element) {
/*  265 */     ListImplementation.checkPositionIndex$runtime(index, size());
/*      */     
/*  267 */     if (index == size()) {
/*  268 */       add((E)element);
/*      */       
/*      */       return;
/*      */     } 
/*  272 */     this.modCount++;
/*      */     
/*  274 */     int rootSize = rootSize();
/*  275 */     if (index >= rootSize) {
/*  276 */       insertIntoTail(this.root, index - rootSize, (E)element);
/*      */       
/*      */       return;
/*      */     } 
/*  280 */     ObjectRef elementCarry = new ObjectRef(null);
/*  281 */     Intrinsics.checkNotNull(this.root); Object[] newRest = insertIntoRoot(this.root, this.rootShift, index, element, elementCarry);
/*      */     
/*  283 */     insertIntoTail(newRest, 0, (E)elementCarry.getValue());
/*      */   }
/*      */   
/*      */   private final void insertIntoTail(Object[] root, int index, Object element) {
/*  287 */     int tailSize = tailSize();
/*  288 */     Object[] mutableTail = makeMutable(this.tail);
/*  289 */     if (tailSize < 32) {
/*  290 */       ArraysKt.copyInto(this.tail, mutableTail, index + 1, index, tailSize);
/*  291 */       mutableTail[index] = element;
/*  292 */       this.root = root;
/*  293 */       this.tail = mutableTail;
/*  294 */       this.size = size() + 1;
/*      */     } else {
/*  296 */       Object lastElement = this.tail[31];
/*  297 */       ArraysKt.copyInto(this.tail, mutableTail, index + 1, index, 31);
/*  298 */       mutableTail[index] = element;
/*  299 */       pushFilledTail(root, mutableTail, mutableBufferWith(lastElement));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final Object[] insertIntoRoot(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
/*  311 */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*      */     
/*  313 */     if (shift == 0) {
/*  314 */       elementCarry.setValue(root[31]);
/*  315 */       Object[] arrayOfObject = ArraysKt.copyInto(root, makeMutable(root), bufferIndex + 1, bufferIndex, 31);
/*  316 */       arrayOfObject[bufferIndex] = element;
/*  317 */       return arrayOfObject;
/*      */     } 
/*      */     
/*  320 */     Object[] mutableRoot = makeMutable(root);
/*  321 */     int lowerLevelShift = shift - 5;
/*      */ 
/*      */ 
/*      */     
/*  325 */     Intrinsics.checkNotNull(mutableRoot[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); mutableRoot[bufferIndex] = insertIntoRoot((Object[])mutableRoot[bufferIndex], lowerLevelShift, index, element, elementCarry);
/*      */     
/*  327 */     for (int i = bufferIndex + 1; i < 32 && 
/*  328 */       mutableRoot[i] != null; i++) {
/*      */ 
/*      */       
/*  331 */       Intrinsics.checkNotNull(mutableRoot[i], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"); mutableRoot[i] = insertIntoRoot((Object[])mutableRoot[i], lowerLevelShift, 0, elementCarry.getValue(), elementCarry);
/*      */     } 
/*      */     
/*  334 */     return mutableRoot;
/*      */   }
/*      */   
/*      */   public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
/*  338 */     Intrinsics.checkNotNullParameter(elements, "elements"); ListImplementation.checkPositionIndex$runtime(index, size());
/*      */     
/*  340 */     if (index == size()) {
/*  341 */       return addAll(elements);
/*      */     }
/*  343 */     if (elements.isEmpty()) {
/*  344 */       return false;
/*      */     }
/*      */     
/*  347 */     int i = this.modCount; this.modCount = i + 1;
/*      */     
/*  349 */     int unaffectedElementsCount = index >> 5 << 5;
/*  350 */     int buffersSize = (size() - unaffectedElementsCount + elements.size() - 1) / 32;
/*      */     
/*  352 */     if (buffersSize == 0) {
/*  353 */       CommonFunctionsKt.assert((index >= rootSize()));
/*      */       
/*  355 */       int startIndex = index & 0x1F;
/*  356 */       int endIndex = index + elements.size() - 1 & 0x1F;
/*      */ 
/*      */       
/*  359 */       Object[] arrayOfObject = ArraysKt.copyInto(this.tail, makeMutable(this.tail), endIndex + 1, startIndex, tailSize());
/*      */       
/*  361 */       copyToBuffer(arrayOfObject, startIndex, (Iterator)elements.iterator());
/*      */       
/*  363 */       this.tail = arrayOfObject;
/*  364 */       this.size = size() + elements.size();
/*  365 */       return true;
/*      */     } 
/*      */     
/*  368 */     Object[][] buffers = new Object[buffersSize][];
/*      */     
/*  370 */     int tailSize = tailSize();
/*  371 */     int newTailSize = tailSize(size() + elements.size());
/*      */     
/*  373 */     Object[] newTail = null;
/*      */     
/*  375 */     if (index >= rootSize()) {
/*  376 */       newTail = mutableBuffer();
/*  377 */       splitToBuffers(elements, index, this.tail, tailSize, buffers, buffersSize, newTail);
/*      */     }
/*  379 */     else if (newTailSize > tailSize) {
/*  380 */       int rightShift = newTailSize - tailSize;
/*  381 */       newTail = makeMutableShiftingRight(this.tail, rightShift);
/*      */       
/*  383 */       insertIntoRoot(elements, index, rightShift, buffers, buffersSize, newTail);
/*      */     } else {
/*      */       
/*  386 */       newTail = ArraysKt.copyInto(this.tail, mutableBuffer(), 0, tailSize - newTailSize, tailSize);
/*      */       
/*  388 */       int rightShift = 32 - tailSize - newTailSize;
/*  389 */       Object[] lastBuffer = makeMutableShiftingRight(this.tail, rightShift);
/*      */       
/*  391 */       buffers[buffersSize - 1] = lastBuffer;
/*      */       
/*  393 */       insertIntoRoot(elements, index, rightShift, buffers, buffersSize - 1, lastBuffer);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  398 */     this.root = pushBuffersIncreasingHeightIfNeeded(this.root, unaffectedElementsCount, buffers);
/*  399 */     this.tail = newTail;
/*  400 */     this.size = size() + elements.size();
/*      */     
/*  402 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final void insertIntoRoot(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer)
/*      */   {
/*  419 */     if (this.root == null)
/*      */     
/*      */     { 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1010 */       int $i$a$-checkNotNull-PersistentVectorBuilder$insertIntoRoot$1 = 0; String str = "root is null"; throw new IllegalStateException(str.toString()); }  int startLeafIndex = index >> 5; Object[] startLeaf = shiftLeafBuffers(startLeafIndex, rightShift, buffers, nullBuffers, nextBuffer); int lastLeafIndex = (rootSize() >> 5) - 1; int newNullBuffers = nullBuffers - lastLeafIndex - startLeafIndex; Intrinsics.checkNotNull(buffers[newNullBuffers]); Object[] newNextBuffer = (newNullBuffers < nullBuffers) ? buffers[newNullBuffers] : nextBuffer; splitToBuffers(elements, index, startLeaf, 32, buffers, newNullBuffers, newNextBuffer); } private final Object[] shiftLeafBuffers(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) { if (this.root == null) { int $i$a$-checkNotNull-PersistentVectorBuilder$shiftLeafBuffers$1 = 0; String str = "root is null"; throw new IllegalStateException(str.toString()); }
/*      */      int leafCount = rootSize() >> 5; ListIterator<Object[]> leafBufferIterator = leafBufferIterator(leafCount); int bufferIndex = nullBuffers; Object[] buffer = nextBuffer; while (leafBufferIterator.previousIndex() != startLeafIndex) {
/*      */       Object[] currentBuffer = leafBufferIterator.previous(); ArraysKt.copyInto(currentBuffer, buffer, 0, 32 - rightShift, 32); buffer = makeMutableShiftingRight(currentBuffer, rightShift); buffers[--bufferIndex] = buffer;
/*      */     }  return leafBufferIterator.previous(); } private final void splitToBuffers(Collection elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) { // Byte code:
/*      */     //   0: iload #6
/*      */     //   2: iconst_1
/*      */     //   3: if_icmplt -> 10
/*      */     //   6: iconst_1
/*      */     //   7: goto -> 11
/*      */     //   10: iconst_0
/*      */     //   11: istore #8
/*      */     //   13: iconst_0
/*      */     //   14: istore #9
/*      */     //   16: nop
/*      */     //   17: iload #8
/*      */     //   19: ifne -> 31
/*      */     //   22: iconst_0
/*      */     //   23: istore #10
/*      */     //   25: ldc_w 'requires at least one nullBuffer'
/*      */     //   28: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   31: nop
/*      */     //   32: aload_0
/*      */     //   33: aload_3
/*      */     //   34: invokespecial makeMutable : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*      */     //   37: astore #8
/*      */     //   39: aload #5
/*      */     //   41: iconst_0
/*      */     //   42: aload #8
/*      */     //   44: aastore
/*      */     //   45: aload #7
/*      */     //   47: astore #9
/*      */     //   49: iload #6
/*      */     //   51: istore #10
/*      */     //   53: iload_2
/*      */     //   54: bipush #31
/*      */     //   56: iand
/*      */     //   57: istore #11
/*      */     //   59: iload_2
/*      */     //   60: aload_1
/*      */     //   61: invokeinterface size : ()I
/*      */     //   66: iadd
/*      */     //   67: iconst_1
/*      */     //   68: isub
/*      */     //   69: bipush #31
/*      */     //   71: iand
/*      */     //   72: istore #12
/*      */     //   74: iload #4
/*      */     //   76: iload #11
/*      */     //   78: isub
/*      */     //   79: istore #13
/*      */     //   81: iload #12
/*      */     //   83: iload #13
/*      */     //   85: iadd
/*      */     //   86: bipush #32
/*      */     //   88: if_icmpge -> 110
/*      */     //   91: aload #8
/*      */     //   93: aload #9
/*      */     //   95: iload #12
/*      */     //   97: iconst_1
/*      */     //   98: iadd
/*      */     //   99: iload #11
/*      */     //   101: iload #4
/*      */     //   103: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */     //   106: pop
/*      */     //   107: goto -> 186
/*      */     //   110: iload #12
/*      */     //   112: iload #13
/*      */     //   114: iadd
/*      */     //   115: bipush #32
/*      */     //   117: isub
/*      */     //   118: iconst_1
/*      */     //   119: iadd
/*      */     //   120: istore #14
/*      */     //   122: iload #6
/*      */     //   124: iconst_1
/*      */     //   125: if_icmpne -> 135
/*      */     //   128: aload #8
/*      */     //   130: astore #9
/*      */     //   132: goto -> 151
/*      */     //   135: aload_0
/*      */     //   136: invokespecial mutableBuffer : ()[Ljava/lang/Object;
/*      */     //   139: astore #9
/*      */     //   141: aload #5
/*      */     //   143: iinc #10, -1
/*      */     //   146: iload #10
/*      */     //   148: aload #9
/*      */     //   150: aastore
/*      */     //   151: aload #8
/*      */     //   153: aload #7
/*      */     //   155: iconst_0
/*      */     //   156: iload #4
/*      */     //   158: iload #14
/*      */     //   160: isub
/*      */     //   161: iload #4
/*      */     //   163: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */     //   166: pop
/*      */     //   167: aload #8
/*      */     //   169: aload #9
/*      */     //   171: iload #12
/*      */     //   173: iconst_1
/*      */     //   174: iadd
/*      */     //   175: iload #11
/*      */     //   177: iload #4
/*      */     //   179: iload #14
/*      */     //   181: isub
/*      */     //   182: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */     //   185: pop
/*      */     //   186: aload_1
/*      */     //   187: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   192: astore #14
/*      */     //   194: aload_0
/*      */     //   195: aload #8
/*      */     //   197: iload #11
/*      */     //   199: aload #14
/*      */     //   201: invokespecial copyToBuffer : ([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;
/*      */     //   204: pop
/*      */     //   205: iconst_1
/*      */     //   206: istore #15
/*      */     //   208: iload #10
/*      */     //   210: istore #16
/*      */     //   212: iload #15
/*      */     //   214: iload #16
/*      */     //   216: if_icmpge -> 241
/*      */     //   219: aload #5
/*      */     //   221: iload #15
/*      */     //   223: aload_0
/*      */     //   224: aload_0
/*      */     //   225: invokespecial mutableBuffer : ()[Ljava/lang/Object;
/*      */     //   228: iconst_0
/*      */     //   229: aload #14
/*      */     //   231: invokespecial copyToBuffer : ([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;
/*      */     //   234: aastore
/*      */     //   235: iinc #15, 1
/*      */     //   238: goto -> 212
/*      */     //   241: aload_0
/*      */     //   242: aload #9
/*      */     //   244: iconst_0
/*      */     //   245: aload #14
/*      */     //   247: invokespecial copyToBuffer : ([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;
/*      */     //   250: pop
/*      */     //   251: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #480	-> 0
/*      */     //   #1011	-> 16
/*      */     //   #1014	-> 17
/*      */     //   #1015	-> 22
/*      */     //   #480	-> 25
/*      */     //   #1015	-> 28
/*      */     //   #1017	-> 31
/*      */     //   #482	-> 32
/*      */     //   #483	-> 39
/*      */     //   #485	-> 45
/*      */     //   #486	-> 49
/*      */     //   #488	-> 53
/*      */     //   #489	-> 59
/*      */     //   #491	-> 74
/*      */     //   #493	-> 81
/*      */     //   #494	-> 91
/*      */     //   #496	-> 110
/*      */     //   #497	-> 122
/*      */     //   #498	-> 128
/*      */     //   #500	-> 135
/*      */     //   #501	-> 141
/*      */     //   #503	-> 151
/*      */     //   #504	-> 167
/*      */     //   #507	-> 186
/*      */     //   #509	-> 194
/*      */     //   #510	-> 205
/*      */     //   #511	-> 219
/*      */     //   #510	-> 235
/*      */     //   #513	-> 241
/*      */     //   #514	-> 251
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   25	3	10	$i$a$-requirePrecondition-PersistentVectorBuilder$splitToBuffers$1	I
/*      */     //   16	16	9	$i$f$requirePrecondition	I
/*      */     //   13	19	8	value$iv	Z
/*      */     //   122	64	14	toCopyToLast	I
/*      */     //   208	33	15	i	I
/*      */     //   39	213	8	firstBuffer	[Ljava/lang/Object;
/*      */     //   49	203	9	newNextBuffer	[Ljava/lang/Object;
/*      */     //   53	199	10	newNullBuffers	I
/*      */     //   59	193	11	startBufferStartIndex	I
/*      */     //   74	178	12	endBufferEndIndex	I
/*      */     //   81	171	13	elementsToShift	I
/*      */     //   194	58	14	elementsIterator	Ljava/util/Iterator;
/*      */     //   0	252	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;
/*      */     //   0	252	1	elements	Ljava/util/Collection;
/*      */     //   0	252	2	index	I
/*      */     //   0	252	3	startBuffer	[Ljava/lang/Object;
/*      */     //   0	252	4	startBufferSize	I
/*      */     //   0	252	5	buffers	[[Ljava/lang/Object;
/*      */     //   0	252	6	nullBuffers	I
/*      */     //   0	252	7	nextBuffer	[Ljava/lang/Object; }
/*      */   private final void pullLastBufferFromRoot(Object[] root, int rootSize, int shift) { if (shift == 0) {
/*      */       this.root = null;
/*      */       if (root == null)
/*      */         int $i$f$emptyArray = 0; 
/* 1018 */       ((PersistentVectorBuilder)root).tail = new Object[0];
/*      */       this.size = rootSize;
/*      */       this.rootShift = shift;
/*      */       return;
/*      */     } 
/*      */     ObjectRef tailCarry = new ObjectRef(null);
/*      */     Intrinsics.checkNotNull(root);
/*      */     Intrinsics.checkNotNull(pullLastBuffer(root, shift, rootSize, tailCarry));
/*      */     Object[] newRoot = pullLastBuffer(root, shift, rootSize, tailCarry);
/*      */     Intrinsics.checkNotNull(tailCarry.getValue(), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     this.tail = (Object[])tailCarry.getValue();
/*      */     this.size = rootSize;
/*      */     if (newRoot[1] == null) {
/*      */       this.root = (Object[])newRoot[0];
/*      */       this.rootShift = shift - 5;
/*      */     } else {
/*      */       this.root = newRoot;
/*      */       this.rootShift = shift;
/*      */     }  }
/*      */ 
/*      */   
/*      */   public E get(int index) {
/*      */     ListImplementation.checkElementIndex$runtime(index, size());
/*      */     Object[] buffer = bufferFor(index);
/*      */     return (E)buffer[index & 0x1F];
/*      */   }
/*      */   
/*      */   private final Object[] bufferFor(int index) {
/*      */     if (rootSize() <= index)
/*      */       return this.tail; 
/*      */     Intrinsics.checkNotNull(this.root);
/*      */     Object[] buffer = this.root;
/*      */     int shift = this.rootShift;
/*      */     while (shift > 0) {
/*      */       Intrinsics.checkNotNull(buffer[UtilsKt.indexSegment(index, shift)], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */       buffer = (Object[])buffer[UtilsKt.indexSegment(index, shift)];
/*      */       shift -= 5;
/*      */     } 
/*      */     return buffer;
/*      */   }
/*      */   
/*      */   public E removeAt(int index) {
/*      */     ListImplementation.checkElementIndex$runtime(index, size());
/*      */     this.modCount++;
/*      */     int rootSize = rootSize();
/*      */     if (index >= rootSize)
/*      */       return (E)removeFromTailAt(this.root, rootSize, this.rootShift, index - rootSize); 
/*      */     ObjectRef elementCarry = new ObjectRef(this.tail[0]);
/*      */     Intrinsics.checkNotNull(this.root);
/*      */     Object[] newRoot = removeFromRootAt(this.root, this.rootShift, index, elementCarry);
/*      */     removeFromTailAt(newRoot, rootSize, this.rootShift, 0);
/*      */     return (E)elementCarry.getValue();
/*      */   }
/*      */   
/*      */   private final Object removeFromTailAt(Object[] root, int rootSize, int shift, int index) {
/*      */     int tailSize = size() - rootSize;
/*      */     CommonFunctionsKt.assert((index < tailSize));
/*      */     Object removedElement = null;
/*      */     if (tailSize == 1) {
/*      */       removedElement = this.tail[0];
/*      */       pullLastBufferFromRoot(root, rootSize, shift);
/*      */     } else {
/*      */       removedElement = this.tail[index];
/*      */       Object[] mutableTail = ArraysKt.copyInto(this.tail, makeMutable(this.tail), index, index + 1, tailSize);
/*      */       mutableTail[tailSize - 1] = null;
/*      */       this.root = root;
/*      */       this.tail = mutableTail;
/*      */       this.size = rootSize + tailSize - 1;
/*      */       this.rootShift = shift;
/*      */     } 
/*      */     return removedElement;
/*      */   }
/*      */   
/*      */   private final Object[] removeFromRootAt(Object[] root, int shift, int index, ObjectRef tailCarry) {
/*      */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*      */     if (shift == 0) {
/*      */       Object removedElement = root[bufferIndex];
/*      */       Object[] arrayOfObject = ArraysKt.copyInto(root, makeMutable(root), bufferIndex, bufferIndex + 1, 32);
/*      */       arrayOfObject[31] = tailCarry.getValue();
/*      */       tailCarry.setValue(removedElement);
/*      */       return arrayOfObject;
/*      */     } 
/*      */     int bufferLastIndex = 31;
/*      */     if (root[bufferLastIndex] == null)
/*      */       bufferLastIndex = UtilsKt.indexSegment(rootSize() - 1, shift); 
/*      */     Object[] mutableRoot = makeMutable(root);
/*      */     int lowerLevelShift = shift - 5;
/*      */     int i = bufferLastIndex, j = bufferIndex + 1;
/*      */     if (j <= i)
/*      */       while (true) {
/*      */         Intrinsics.checkNotNull(mutableRoot[i], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */         mutableRoot[i] = removeFromRootAt((Object[])mutableRoot[i], lowerLevelShift, 0, tailCarry);
/*      */         if (i != j) {
/*      */           i--;
/*      */           continue;
/*      */         } 
/*      */         break;
/*      */       }  
/*      */     Intrinsics.checkNotNull(mutableRoot[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     mutableRoot[bufferIndex] = removeFromRootAt((Object[])mutableRoot[bufferIndex], lowerLevelShift, index, tailCarry);
/*      */     return mutableRoot;
/*      */   }
/*      */   
/*      */   private final Object[] pullLastBuffer(Object[] root, int shift, int rootSize, ObjectRef tailCarry) {
/*      */     int bufferIndex = UtilsKt.indexSegment(rootSize - 1, shift);
/*      */     tailCarry.setValue(root[bufferIndex]);
/*      */     Intrinsics.checkNotNull(root[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     Object[] newBufferAtIndex = (shift == 5) ? null : pullLastBuffer((Object[])root[bufferIndex], shift - 5, rootSize, tailCarry);
/*      */     if (newBufferAtIndex == null && bufferIndex == 0)
/*      */       return null; 
/*      */     Object[] mutableRoot = makeMutable(root);
/*      */     mutableRoot[bufferIndex] = newBufferAtIndex;
/*      */     return mutableRoot;
/*      */   }
/*      */   
/*      */   public boolean removeAll(@NotNull Collection<? extends E> elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(elements));
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*      */   static final class PersistentVectorBuilder$removeAll$1 extends Lambda implements Function1<E, Boolean> {
/*      */     PersistentVectorBuilder$removeAll$1(Collection<E> $elements) {
/*      */       super(1);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Boolean invoke(Object it) {
/*      */       return Boolean.valueOf(this.$elements.contains(it));
/*      */     }
/*      */   }
/*      */   
/*      */   public final boolean removeAllWithPredicate(@NotNull Function1<? super E, Boolean> predicate) {
/*      */     Intrinsics.checkNotNullParameter(predicate, "predicate");
/*      */     boolean anyRemoved = removeAll(predicate);
/*      */     if (anyRemoved) {
/*      */       int i = this.modCount;
/*      */       this.modCount = i + 1;
/*      */     } 
/*      */     return anyRemoved;
/*      */   }
/*      */   
/*      */   private final boolean removeAll(Function1<? super E, Boolean> predicate) {
/*      */     int tailSize = tailSize();
/*      */     ObjectRef bufferRef = new ObjectRef(null);
/*      */     if (this.root == null)
/*      */       return (removeAllFromTail(predicate, tailSize, bufferRef) != tailSize); 
/*      */     ListIterator<Object[]> leafIterator = leafBufferIterator(0);
/*      */     int bufferSize = 32;
/*      */     while (bufferSize == 32 && leafIterator.hasNext())
/*      */       bufferSize = removeAll(predicate, leafIterator.next(), 32, bufferRef); 
/*      */     if (bufferSize == 32) {
/*      */       CommonFunctionsKt.assert(!leafIterator.hasNext());
/*      */       int i = removeAllFromTail(predicate, tailSize, bufferRef);
/*      */       if (i == 0)
/*      */         pullLastBufferFromRoot(this.root, size(), this.rootShift); 
/*      */       return (i != tailSize);
/*      */     } 
/*      */     int unaffectedElementsCount = leafIterator.previousIndex() << 5;
/*      */     List<Object[]> buffers = new ArrayList();
/*      */     List<Object[]> recyclableBuffers = new ArrayList();
/*      */     while (leafIterator.hasNext()) {
/*      */       Object[] leaf = leafIterator.next();
/*      */       bufferSize = recyclableRemoveAll(predicate, leaf, 32, bufferSize, bufferRef, recyclableBuffers, buffers);
/*      */     } 
/*      */     int newTailSize = recyclableRemoveAll(predicate, this.tail, tailSize, bufferSize, bufferRef, recyclableBuffers, buffers);
/*      */     Intrinsics.checkNotNull(bufferRef.getValue(), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     Object[] newTail = (Object[])bufferRef.getValue();
/*      */     ArraysKt.fill(newTail, null, newTailSize, 32);
/*      */     Intrinsics.checkNotNull(this.root);
/*      */     Object[] newRoot = buffers.isEmpty() ? this.root : pushBuffers(this.root, unaffectedElementsCount, this.rootShift, buffers.iterator());
/*      */     int newRootSize = unaffectedElementsCount + (buffers.size() << 5);
/*      */     this.root = retainFirst(newRoot, newRootSize);
/*      */     this.tail = newTail;
/*      */     this.size = newRootSize + newTailSize;
/*      */     return true;
/*      */   }
/*      */   
/*      */   private final Object[] retainFirst(Object[] root, int size) {
/*      */     // Byte code:
/*      */     //   0: iload_2
/*      */     //   1: bipush #31
/*      */     //   3: iand
/*      */     //   4: ifne -> 11
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 12
/*      */     //   11: iconst_0
/*      */     //   12: istore_3
/*      */     //   13: iconst_0
/*      */     //   14: istore #4
/*      */     //   16: nop
/*      */     //   17: iload_3
/*      */     //   18: ifne -> 30
/*      */     //   21: iconst_0
/*      */     //   22: istore #5
/*      */     //   24: ldc_w 'invalid size'
/*      */     //   27: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   30: nop
/*      */     //   31: iload_2
/*      */     //   32: ifne -> 42
/*      */     //   35: aload_0
/*      */     //   36: iconst_0
/*      */     //   37: putfield rootShift : I
/*      */     //   40: aconst_null
/*      */     //   41: areturn
/*      */     //   42: iload_2
/*      */     //   43: iconst_1
/*      */     //   44: isub
/*      */     //   45: istore_3
/*      */     //   46: aload_1
/*      */     //   47: astore #4
/*      */     //   49: iload_3
/*      */     //   50: aload_0
/*      */     //   51: getfield rootShift : I
/*      */     //   54: ishr
/*      */     //   55: ifne -> 87
/*      */     //   58: aload_0
/*      */     //   59: aload_0
/*      */     //   60: getfield rootShift : I
/*      */     //   63: iconst_5
/*      */     //   64: isub
/*      */     //   65: putfield rootShift : I
/*      */     //   68: aload #4
/*      */     //   70: iconst_0
/*      */     //   71: aaload
/*      */     //   72: dup
/*      */     //   73: ldc_w 'null cannot be cast to non-null type kotlin.Array<kotlin.Any?>'
/*      */     //   76: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   79: checkcast [Ljava/lang/Object;
/*      */     //   82: astore #4
/*      */     //   84: goto -> 49
/*      */     //   87: aload_0
/*      */     //   88: aload #4
/*      */     //   90: iload_3
/*      */     //   91: aload_0
/*      */     //   92: getfield rootShift : I
/*      */     //   95: invokespecial nullifyAfter : ([Ljava/lang/Object;II)[Ljava/lang/Object;
/*      */     //   98: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #746	-> 0
/*      */     //   #1019	-> 16
/*      */     //   #1022	-> 17
/*      */     //   #1023	-> 21
/*      */     //   #746	-> 24
/*      */     //   #1023	-> 27
/*      */     //   #1025	-> 30
/*      */     //   #748	-> 31
/*      */     //   #749	-> 35
/*      */     //   #750	-> 40
/*      */     //   #753	-> 42
/*      */     //   #754	-> 46
/*      */     //   #755	-> 49
/*      */     //   #756	-> 58
/*      */     //   #758	-> 68
/*      */     //   #760	-> 87
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   24	3	5	$i$a$-requirePrecondition-PersistentVectorBuilder$retainFirst$1	I
/*      */     //   16	15	4	$i$f$requirePrecondition	I
/*      */     //   13	18	3	value$iv	Z
/*      */     //   46	53	3	lastIndex	I
/*      */     //   49	50	4	newRoot	[Ljava/lang/Object;
/*      */     //   0	99	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;
/*      */     //   0	99	1	root	[Ljava/lang/Object;
/*      */     //   0	99	2	size	I
/*      */   }
/*      */   
/*      */   private final Object[] nullifyAfter(Object[] root, int index, int shift) {
/*      */     // Byte code:
/*      */     //   0: iload_3
/*      */     //   1: iflt -> 8
/*      */     //   4: iconst_1
/*      */     //   5: goto -> 9
/*      */     //   8: iconst_0
/*      */     //   9: istore #4
/*      */     //   11: iconst_0
/*      */     //   12: istore #5
/*      */     //   14: nop
/*      */     //   15: iload #4
/*      */     //   17: ifne -> 29
/*      */     //   20: iconst_0
/*      */     //   21: istore #6
/*      */     //   23: ldc_w 'shift should be positive'
/*      */     //   26: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   29: nop
/*      */     //   30: iload_3
/*      */     //   31: ifne -> 36
/*      */     //   34: aload_1
/*      */     //   35: areturn
/*      */     //   36: iload_2
/*      */     //   37: iload_3
/*      */     //   38: invokestatic indexSegment : (II)I
/*      */     //   41: istore #4
/*      */     //   43: aload_0
/*      */     //   44: aload_1
/*      */     //   45: iload #4
/*      */     //   47: aaload
/*      */     //   48: dup
/*      */     //   49: ldc_w 'null cannot be cast to non-null type kotlin.Array<kotlin.Any?>'
/*      */     //   52: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   55: checkcast [Ljava/lang/Object;
/*      */     //   58: iload_2
/*      */     //   59: iload_3
/*      */     //   60: iconst_5
/*      */     //   61: isub
/*      */     //   62: invokespecial nullifyAfter : ([Ljava/lang/Object;II)[Ljava/lang/Object;
/*      */     //   65: astore #5
/*      */     //   67: aload_1
/*      */     //   68: astore #6
/*      */     //   70: iload #4
/*      */     //   72: bipush #31
/*      */     //   74: if_icmpge -> 125
/*      */     //   77: aload #6
/*      */     //   79: iload #4
/*      */     //   81: iconst_1
/*      */     //   82: iadd
/*      */     //   83: aaload
/*      */     //   84: ifnull -> 125
/*      */     //   87: aload_0
/*      */     //   88: aload #6
/*      */     //   90: invokespecial isMutable : ([Ljava/lang/Object;)Z
/*      */     //   93: ifeq -> 108
/*      */     //   96: aload #6
/*      */     //   98: aconst_null
/*      */     //   99: iload #4
/*      */     //   101: iconst_1
/*      */     //   102: iadd
/*      */     //   103: bipush #32
/*      */     //   105: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;II)V
/*      */     //   108: aload #6
/*      */     //   110: aload_0
/*      */     //   111: invokespecial mutableBuffer : ()[Ljava/lang/Object;
/*      */     //   114: iconst_0
/*      */     //   115: iconst_0
/*      */     //   116: iload #4
/*      */     //   118: iconst_1
/*      */     //   119: iadd
/*      */     //   120: invokestatic copyInto : ([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;
/*      */     //   123: astore #6
/*      */     //   125: aload #5
/*      */     //   127: aload #6
/*      */     //   129: iload #4
/*      */     //   131: aaload
/*      */     //   132: if_acmpeq -> 150
/*      */     //   135: aload_0
/*      */     //   136: aload #6
/*      */     //   138: invokespecial makeMutable : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*      */     //   141: astore #6
/*      */     //   143: aload #6
/*      */     //   145: iload #4
/*      */     //   147: aload #5
/*      */     //   149: aastore
/*      */     //   150: aload #6
/*      */     //   152: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #769	-> 0
/*      */     //   #1026	-> 14
/*      */     //   #1029	-> 15
/*      */     //   #1030	-> 20
/*      */     //   #769	-> 23
/*      */     //   #1030	-> 26
/*      */     //   #1032	-> 29
/*      */     //   #771	-> 30
/*      */     //   #774	-> 34
/*      */     //   #777	-> 36
/*      */     //   #779	-> 43
/*      */     //   #781	-> 67
/*      */     //   #782	-> 70
/*      */     //   #783	-> 87
/*      */     //   #784	-> 96
/*      */     //   #786	-> 108
/*      */     //   #788	-> 125
/*      */     //   #789	-> 135
/*      */     //   #790	-> 143
/*      */     //   #793	-> 150
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   23	3	6	$i$a$-requirePrecondition-PersistentVectorBuilder$nullifyAfter$1	I
/*      */     //   14	16	5	$i$f$requirePrecondition	I
/*      */     //   11	19	4	value$iv	Z
/*      */     //   43	110	4	lastIndex	I
/*      */     //   67	86	5	newChild	[Ljava/lang/Object;
/*      */     //   70	83	6	newRoot	[Ljava/lang/Object;
/*      */     //   0	153	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;
/*      */     //   0	153	1	root	[Ljava/lang/Object;
/*      */     //   0	153	2	index	I
/*      */     //   0	153	3	shift	I
/*      */   }
/*      */   
/*      */   private final int removeAllFromTail(Function1<? super E, Boolean> predicate, int tailSize, ObjectRef bufferRef) {
/*      */     int newTailSize = removeAll(predicate, this.tail, tailSize, bufferRef);
/*      */     if (newTailSize == tailSize) {
/*      */       CommonFunctionsKt.assert((bufferRef.getValue() == this.tail));
/*      */       return tailSize;
/*      */     } 
/*      */     Intrinsics.checkNotNull(bufferRef.getValue(), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     Object[] newTail = (Object[])bufferRef.getValue();
/*      */     ArraysKt.fill(newTail, null, newTailSize, tailSize);
/*      */     this.tail = newTail;
/*      */     this.size = size() - tailSize - newTailSize;
/*      */     return newTailSize;
/*      */   }
/*      */   
/*      */   private final int removeAll(Function1 predicate, Object[] buffer, int bufferSize, ObjectRef bufferRef) {
/*      */     Object[] newBuffer = buffer;
/*      */     int newBufferSize = bufferSize;
/*      */     boolean anyRemoved = false;
/*      */     for (int index = 0; index < bufferSize; index++) {
/*      */       Object element = buffer[index];
/*      */       if (((Boolean)predicate.invoke(element)).booleanValue()) {
/*      */         if (!anyRemoved) {
/*      */           newBuffer = makeMutable(buffer);
/*      */           newBufferSize = index;
/*      */           anyRemoved = true;
/*      */         } 
/*      */       } else if (anyRemoved) {
/*      */         newBuffer[newBufferSize++] = element;
/*      */       } 
/*      */     } 
/*      */     bufferRef.setValue(newBuffer);
/*      */     return newBufferSize;
/*      */   }
/*      */   
/*      */   private final int recyclableRemoveAll(Function1 predicate, Object[] buffer, int bufferSize, int toBufferSize, ObjectRef bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
/*      */     if (isMutable(buffer))
/*      */       recyclableBuffers.add(buffer); 
/*      */     Intrinsics.checkNotNull(bufferRef.getValue(), "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     Object[] toBuffer = (Object[])bufferRef.getValue();
/*      */     Object[] newToBuffer = toBuffer;
/*      */     int newToBufferSize = toBufferSize;
/*      */     for (int index = 0; index < bufferSize; index++) {
/*      */       Object element = buffer[index];
/*      */       if (!((Boolean)predicate.invoke(element)).booleanValue()) {
/*      */         if (newToBufferSize == 32) {
/*      */           newToBuffer = (!recyclableBuffers.isEmpty()) ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : mutableBuffer();
/*      */           newToBufferSize = 0;
/*      */         } 
/*      */         newToBuffer[newToBufferSize++] = element;
/*      */       } 
/*      */     } 
/*      */     bufferRef.setValue(newToBuffer);
/*      */     if (toBuffer != bufferRef.getValue())
/*      */       buffers.add(toBuffer); 
/*      */     return newToBufferSize;
/*      */   }
/*      */   
/*      */   public E set(int index, Object element) {
/*      */     ListImplementation.checkElementIndex$runtime(index, size());
/*      */     if (rootSize() <= index) {
/*      */       Object[] mutableTail = makeMutable(this.tail);
/*      */       if (mutableTail != this.tail) {
/*      */         int i = this.modCount;
/*      */         this.modCount = i + 1;
/*      */       } 
/*      */       int tailIndex = index & 0x1F;
/*      */       Object oldElement = mutableTail[tailIndex];
/*      */       mutableTail[tailIndex] = element;
/*      */       this.tail = mutableTail;
/*      */       return (E)oldElement;
/*      */     } 
/*      */     ObjectRef oldElementCarry = new ObjectRef(null);
/*      */     Intrinsics.checkNotNull(this.root);
/*      */     this.root = setInRoot(this.root, this.rootShift, index, (E)element, oldElementCarry);
/*      */     return (E)oldElementCarry.getValue();
/*      */   }
/*      */   
/*      */   private final Object[] setInRoot(Object[] root, int shift, int index, Object e, ObjectRef oldElementCarry) {
/*      */     int bufferIndex = UtilsKt.indexSegment(index, shift);
/*      */     Object[] mutableRoot = makeMutable(root);
/*      */     if (shift == 0) {
/*      */       if (mutableRoot != root) {
/*      */         int i = this.modCount;
/*      */         this.modCount = i + 1;
/*      */       } 
/*      */       oldElementCarry.setValue(mutableRoot[bufferIndex]);
/*      */       mutableRoot[bufferIndex] = e;
/*      */       return mutableRoot;
/*      */     } 
/*      */     Intrinsics.checkNotNull(mutableRoot[bufferIndex], "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
/*      */     mutableRoot[bufferIndex] = setInRoot((Object[])mutableRoot[bufferIndex], shift - 5, index, (E)e, oldElementCarry);
/*      */     return mutableRoot;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public Iterator<E> iterator() {
/*      */     return listIterator();
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public ListIterator<E> listIterator() {
/*      */     return listIterator(0);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public ListIterator<E> listIterator(int index) {
/*      */     ListImplementation.checkPositionIndex$runtime(index, size());
/*      */     return new PersistentVectorMutableIterator<>(this, index);
/*      */   }
/*      */   
/*      */   private final ListIterator<Object[]> leafBufferIterator(int index) {
/*      */     Object[] root;
/*      */     if (this.root == null) {
/*      */       int $i$a$-checkNotNull-PersistentVectorBuilder$leafBufferIterator$root$1 = 0;
/*      */       String str = "Invalid root";
/*      */       throw new IllegalStateException(str.toString());
/*      */     } 
/*      */     int leafCount = rootSize() >> 5;
/*      */     ListImplementation.checkPositionIndex$runtime(index, leafCount);
/*      */     if (this.rootShift == 0)
/*      */       return new SingleElementListIterator(root, index); 
/*      */     int trieHeight = this.rootShift / 5;
/*      */     return new TrieIterator(root, index, leafCount, trieHeight);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\PersistentVectorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */