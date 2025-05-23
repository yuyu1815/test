/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*     */ 
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\032\n\002\020\013\n\002\b\037\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\030\b\000\030\000 _*\004\b\000\020\0012\0020\002:\001_B\037\b\026\022\006\020\003\032\0020\004\022\016\020\005\032\n\022\006\022\004\030\0010\0020\006¢\006\002\020\007B'\022\006\020\003\032\0020\004\022\016\020\005\032\n\022\006\022\004\030\0010\0020\006\022\b\020\b\032\004\030\0010\t¢\006\002\020\nJ)\020\030\032\b\022\004\022\0028\0000\0002\006\020\031\032\0020\0042\006\020\032\032\0028\0002\006\020\033\032\0020\004¢\006\002\020\034J#\020\035\032\b\022\004\022\0028\0000\0002\006\020\036\032\0020\0042\006\020\032\032\0028\000H\002¢\006\002\020\037J\b\020 \032\0020\004H\002J\033\020!\032\b\022\004\022\0028\0000\0002\006\020\032\032\0028\000H\002¢\006\002\020\"J\025\020#\032\0020$2\006\020\032\032\0028\000H\002¢\006\002\020%J\033\020&\032\b\022\004\022\0028\0000\0002\006\020\032\032\0028\000H\002¢\006\002\020\"J\026\020'\032\b\022\004\022\0028\0000\0002\006\020(\032\0020\004H\002J#\020)\032\0020$2\006\020\031\032\0020\0042\006\020\032\032\0028\0002\006\020\033\032\0020\004¢\006\002\020*J\034\020+\032\0020$2\f\020,\032\b\022\004\022\0028\0000\0002\006\020\033\032\0020\004J\025\020-\032\0028\0002\006\020.\032\0020\004H\002¢\006\002\020/J\026\0200\032\0020$2\f\020,\032\b\022\004\022\0028\0000\000H\002J\020\0201\032\0020$2\006\020\036\032\0020\004H\002J\025\0202\032\0020\0042\006\020\036\032\0020\004H\000¢\006\002\b3JE\0204\032\b\022\004\022\0028\0000\0002\006\0205\032\0020\0042\006\0206\032\0028\0002\006\0207\032\0020\0042\006\0208\032\0028\0002\006\020\033\032\0020\0042\b\0209\032\004\030\0010\tH\002¢\006\002\020:J=\020;\032\b\022\004\022\0028\0000\0002\006\020<\032\0020\0042\006\020=\032\0020\0042\006\020>\032\0028\0002\006\020\033\032\0020\0042\b\0209\032\004\030\0010\tH\002¢\006\002\020?J3\020@\032\b\022\004\022\0028\0000\0002\006\020<\032\0020\0042\006\020=\032\0020\0042\006\020>\032\0028\0002\006\020\033\032\0020\004H\002¢\006\002\020AJ5\020B\032\b\022\004\022\0028\0000\0002\006\020\031\032\0020\0042\006\020\032\032\0028\0002\006\020\033\032\0020\0042\n\020C\032\006\022\002\b\0030D¢\006\002\020EJ6\020F\032\b\022\004\022\0028\0000\0002\f\020,\032\b\022\004\022\0028\0000\0002\006\020\033\032\0020\0042\006\020G\032\0020H2\n\020C\032\006\022\002\b\0030DJ+\020I\032\b\022\004\022\0028\0000\0002\006\020\036\032\0020\0042\006\020\032\032\0028\0002\006\0209\032\0020\tH\002¢\006\002\020JJ'\020K\032\b\022\004\022\0028\0000\0002\006\020\032\032\0028\0002\n\020C\032\006\022\002\b\0030DH\002¢\006\002\020LJ,\020M\032\b\022\004\022\0028\0000\0002\f\020,\032\b\022\004\022\0028\0000\0002\006\020G\032\0020H2\006\0209\032\0020\tH\002J'\020N\032\b\022\004\022\0028\0000\0002\006\020\032\032\0028\0002\n\020C\032\006\022\002\b\0030DH\002¢\006\002\020LJ(\020O\032\004\030\0010\0022\f\020,\032\b\022\004\022\0028\0000\0002\006\020G\032\0020H2\006\0209\032\0020\tH\002J\036\020P\032\b\022\004\022\0028\0000\0002\006\020(\032\0020\0042\006\0209\032\0020\tH\002J(\020Q\032\004\030\0010\0022\f\020,\032\b\022\004\022\0028\0000\0002\006\020G\032\0020H2\006\0209\032\0020\tH\002J;\020R\032\b\022\004\022\0028\0000\0002\006\020<\032\0020\0042\006\020=\032\0020\0042\006\020>\032\0028\0002\006\020\033\032\0020\0042\006\0209\032\0020\tH\002¢\006\002\020?J5\020S\032\b\022\004\022\0028\0000\0002\006\020\031\032\0020\0042\006\020\032\032\0028\0002\006\020\033\032\0020\0042\n\020C\032\006\022\002\b\0030D¢\006\002\020EJ2\020T\032\004\030\0010\0022\f\020,\032\b\022\004\022\0028\0000\0002\006\020\033\032\0020\0042\006\020G\032\0020H2\n\020C\032\006\022\002\b\0030DJ&\020U\032\b\022\004\022\0028\0000\0002\006\020V\032\0020\0042\006\020\036\032\0020\0042\006\0209\032\0020\tH\002J2\020W\032\004\030\0010\0022\f\020,\032\b\022\004\022\0028\0000\0002\006\020\033\032\0020\0042\006\020G\032\0020H2\n\020C\032\006\022\002\b\0030DJ,\020X\032\b\022\004\022\0028\0000\0002\006\020Y\032\0020\0042\f\020Z\032\b\022\004\022\0028\0000\0002\006\0209\032\0020\tH\002J\026\020[\032\b\022\004\022\0028\0000\0002\006\020.\032\0020\004H\002J)\020\\\032\b\022\004\022\0028\0000\0002\006\020\031\032\0020\0042\006\020\032\032\0028\0002\006\020\033\032\0020\004¢\006\002\020\034J\036\020]\032\b\022\004\022\0028\0000\0002\006\020V\032\0020\0042\006\020\036\032\0020\004H\002J$\020^\032\b\022\004\022\0028\0000\0002\006\020Y\032\0020\0042\f\020Z\032\b\022\004\022\0028\0000\000H\002R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R$\020\005\032\n\022\006\022\004\030\0010\0020\006X\016¢\006\020\n\002\020\023\032\004\b\017\020\020\"\004\b\021\020\022R\034\020\b\032\004\030\0010\tX\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027¨\006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", "index", "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12271#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/*     */ public final class TrieNode<E>
/*     */ {
/*     */   public final int getBitmap() {
/*     */     return this.bitmap;
/*     */   }
/*     */   
/*     */   public final void setBitmap(int <set-?>) {
/*     */     this.bitmap = <set-?>;
/*     */   }
/*     */   
/*     */   public TrieNode(int bitmap, @NotNull Object[] buffer, @Nullable MutabilityOwnership ownedBy) {
/*  70 */     this.bitmap = bitmap;
/*  71 */     this.buffer = buffer;
/*  72 */     this.ownedBy = ownedBy; } @NotNull public final Object[] getBuffer() { return this.buffer; } public final void setBuffer(@NotNull Object[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.buffer = <set-?>; } @Nullable public final MutabilityOwnership getOwnedBy() { return this.ownedBy; } public final void setOwnedBy(@Nullable MutabilityOwnership <set-?>) { this.ownedBy = <set-?>; }
/*     */   
/*     */   public TrieNode(int bitmap, @NotNull Object[] buffer) {
/*  75 */     this(bitmap, buffer, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean hasNoCellAt(int positionMask) {
/*  81 */     return ((this.bitmap & positionMask) == 0);
/*     */   }
/*     */   
/*     */   public final int indexOfCellAt$runtime(int positionMask) {
/*  85 */     return Integer.bitCount(this.bitmap & positionMask - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   private final E elementAtIndex(int index) {
/*  90 */     return (E)this.buffer[index];
/*     */   }
/*     */ 
/*     */   
/*     */   private final TrieNode<E> nodeAtIndex(int index) {
/*  95 */     Intrinsics.checkNotNull(this.buffer[index], "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>"); return (TrieNode<E>)this.buffer[index];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> addElementAt(int positionMask, Object element) {
/* 101 */     int index = indexOfCellAt$runtime(positionMask);
/* 102 */     Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, index, element);
/* 103 */     return new TrieNode(this.bitmap | positionMask, newBuffer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> mutableAddElementAt(int positionMask, Object element, MutabilityOwnership owner) {
/* 109 */     int index = indexOfCellAt$runtime(positionMask);
/* 110 */     if (this.ownedBy == owner) {
/* 111 */       this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, index, element);
/* 112 */       this.bitmap |= positionMask;
/* 113 */       return this;
/*     */     } 
/* 115 */     Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, index, element);
/* 116 */     return new TrieNode(this.bitmap | positionMask, newBuffer, owner);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> updateNodeAtIndex(int nodeIndex, TrieNode<E> newNode) {
/* 122 */     Object<E> cell = null;
/*     */     
/* 124 */     Object[] newNodeBuffer = newNode.buffer;
/* 125 */     if (newNodeBuffer.length == 1 && !(newNodeBuffer[0] instanceof TrieNode)) {
/* 126 */       if (this.buffer.length == 1) {
/* 127 */         newNode.bitmap = this.bitmap;
/* 128 */         return newNode;
/*     */       } 
/* 130 */       cell = (Object<E>)newNodeBuffer[0];
/*     */     } else {
/* 132 */       cell = (Object<E>)newNode;
/*     */     } 
/*     */     
/* 135 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
/* 136 */     newBuffer[nodeIndex] = cell;
/* 137 */     return new TrieNode(this.bitmap, newBuffer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<E> newNode, MutabilityOwnership owner) {
/* 144 */     Object<E> cell = null;
/*     */     
/* 146 */     Object[] newNodeBuffer = newNode.buffer;
/* 147 */     if (newNodeBuffer.length == 1 && !(newNodeBuffer[0] instanceof TrieNode)) {
/* 148 */       if (this.buffer.length == 1) {
/* 149 */         newNode.bitmap = this.bitmap;
/* 150 */         return newNode;
/*     */       } 
/* 152 */       cell = (Object<E>)newNodeBuffer[0];
/*     */     } else {
/* 154 */       cell = (Object<E>)newNode;
/*     */     } 
/*     */     
/* 157 */     if (this.ownedBy == owner) {
/* 158 */       this.buffer[nodeIndex] = cell;
/* 159 */       return this;
/*     */     } 
/* 161 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
/* 162 */     newBuffer[nodeIndex] = cell;
/* 163 */     return new TrieNode(this.bitmap, newBuffer, owner);
/*     */   }
/*     */ 
/*     */   
/*     */   private final TrieNode<E> makeNodeAtIndex(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
/* 168 */     Object storedElement = elementAtIndex(elementIndex);
/* 169 */     return makeNode((storedElement != null) ? storedElement.hashCode() : 0, (E)storedElement, 
/* 170 */         newElementHash, (E)newElement, shift + 5, owner);
/*     */   }
/*     */ 
/*     */   
/*     */   private final TrieNode<E> moveElementToNode(int elementIndex, int newElementHash, Object newElement, int shift) {
/* 175 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
/* 176 */     newBuffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, (E)newElement, shift, null);
/* 177 */     return new TrieNode(this.bitmap, newBuffer);
/*     */   }
/*     */ 
/*     */   
/*     */   private final TrieNode<E> mutableMoveElementToNode(int elementIndex, int newElementHash, Object newElement, int shift, MutabilityOwnership owner) {
/* 182 */     if (this.ownedBy == owner) {
/* 183 */       this.buffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, (E)newElement, shift, owner);
/* 184 */       return this;
/*     */     } 
/* 186 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
/* 187 */     newBuffer[elementIndex] = makeNodeAtIndex(elementIndex, newElementHash, (E)newElement, shift, owner);
/* 188 */     return new TrieNode(this.bitmap, newBuffer, owner);
/*     */   }
/*     */ 
/*     */   
/*     */   private final TrieNode<E> makeNode(int elementHash1, Object element1, int elementHash2, Object element2, int shift, MutabilityOwnership owner) {
/* 193 */     if (shift > 30) {
/*     */ 
/*     */       
/* 196 */       Object[] arrayOfObject1 = new Object[2]; arrayOfObject1[0] = element1; arrayOfObject1[1] = element2; return new TrieNode(0, arrayOfObject1, owner);
/*     */     } 
/*     */     
/* 199 */     int setBit1 = TrieNodeKt.indexSegment(elementHash1, shift);
/* 200 */     int setBit2 = TrieNodeKt.indexSegment(elementHash2, shift);
/*     */     
/* 202 */     if (setBit1 != setBit2) {
/*     */       
/* 204 */       Object[] arrayOfObject1 = new Object[2]; arrayOfObject1[0] = element1; arrayOfObject1[1] = element2;
/*     */       
/* 206 */       arrayOfObject1 = new Object[2]; arrayOfObject1[0] = element2; arrayOfObject1[1] = element1; Object[] nodeBuffer = (setBit1 < setBit2) ? arrayOfObject1 : arrayOfObject1;
/*     */       
/* 208 */       return new TrieNode(1 << setBit1 | 1 << setBit2, nodeBuffer, owner);
/*     */     } 
/*     */     
/* 211 */     TrieNode<E> node = makeNode(elementHash1, (E)element1, elementHash2, (E)element2, shift + 5, owner);
/* 212 */     Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = node; return new TrieNode(1 << setBit1, arrayOfObject, owner);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> removeCellAtIndex(int cellIndex, int positionMask) {
/* 220 */     Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, cellIndex);
/* 221 */     return new TrieNode(this.bitmap ^ positionMask, newBuffer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final TrieNode<E> mutableRemoveCellAtIndex(int cellIndex, int positionMask, MutabilityOwnership owner) {
/* 228 */     if (this.ownedBy == owner) {
/* 229 */       this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, cellIndex);
/* 230 */       this.bitmap ^= positionMask;
/* 231 */       return this;
/*     */     } 
/* 233 */     Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, cellIndex);
/* 234 */     return new TrieNode(this.bitmap ^ positionMask, newBuffer, owner);
/*     */   }
/*     */   
/*     */   private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
/* 238 */     Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
/* 239 */     return new TrieNode(0, newBuffer);
/*     */   }
/*     */   
/*     */   private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership owner) {
/* 243 */     if (this.ownedBy == owner) {
/* 244 */       this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
/* 245 */       return this;
/*     */     } 
/* 247 */     Object[] newBuffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
/* 248 */     return new TrieNode(0, newBuffer, owner);
/*     */   }
/*     */   
/*     */   private final boolean collisionContainsElement(Object element) {
/* 252 */     return ArraysKt.contains(this.buffer, element);
/*     */   }
/*     */   
/*     */   private final TrieNode<E> collisionAdd(Object element) {
/* 256 */     if (collisionContainsElement((E)element)) return this; 
/* 257 */     Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, element);
/* 258 */     return new TrieNode(0, newBuffer);
/*     */   }
/*     */   
/*     */   private final TrieNode<E> mutableCollisionAdd(Object element, PersistentHashSetBuilder mutator) {
/* 262 */     if (collisionContainsElement((E)element)) return this; 
/* 263 */     int i = mutator.size(); mutator.setSize(i + 1);
/* 264 */     if (this.ownedBy == mutator.getOwnership$runtime()) {
/* 265 */       this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, element);
/* 266 */       return this;
/*     */     } 
/* 268 */     Object[] newBuffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, element);
/* 269 */     return new TrieNode(0, newBuffer, mutator.getOwnership$runtime());
/*     */   }
/*     */   
/*     */   private final TrieNode<E> collisionRemove(Object element) {
/* 273 */     int index = ArraysKt.indexOf(this.buffer, element);
/* 274 */     if (index != -1) {
/* 275 */       return collisionRemoveElementAtIndex(index);
/*     */     }
/* 277 */     return this;
/*     */   }
/*     */   
/*     */   private final TrieNode<E> mutableCollisionRemove(Object element, PersistentHashSetBuilder mutator) {
/* 281 */     int index = ArraysKt.indexOf(this.buffer, element);
/* 282 */     if (index != -1) {
/* 283 */       int i = mutator.size(); mutator.setSize(i + -1);
/* 284 */       return mutableCollisionRemoveElementAtIndex(index, mutator.getOwnership$runtime());
/*     */     } 
/* 286 */     return this;
/*     */   } private final TrieNode<E> mutableCollisionAddAll(TrieNode otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: if_acmpne -> 16
/*     */     //   5: aload_2
/*     */     //   6: aload_0
/*     */     //   7: getfield buffer : [Ljava/lang/Object;
/*     */     //   10: arraylength
/*     */     //   11: invokevirtual plusAssign : (I)V
/*     */     //   14: aload_0
/*     */     //   15: areturn
/*     */     //   16: aload_0
/*     */     //   17: getfield buffer : [Ljava/lang/Object;
/*     */     //   20: aload_0
/*     */     //   21: getfield buffer : [Ljava/lang/Object;
/*     */     //   24: arraylength
/*     */     //   25: aload_1
/*     */     //   26: getfield buffer : [Ljava/lang/Object;
/*     */     //   29: arraylength
/*     */     //   30: iadd
/*     */     //   31: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   34: dup
/*     */     //   35: ldc 'copyOf(...)'
/*     */     //   37: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   40: astore #4
/*     */     //   42: aload_1
/*     */     //   43: getfield buffer : [Ljava/lang/Object;
/*     */     //   46: astore #6
/*     */     //   48: aload_0
/*     */     //   49: getfield buffer : [Ljava/lang/Object;
/*     */     //   52: arraylength
/*     */     //   53: istore #7
/*     */     //   55: iconst_0
/*     */     //   56: istore #8
/*     */     //   58: iconst_0
/*     */     //   59: istore #9
/*     */     //   61: iconst_0
/*     */     //   62: istore #10
/*     */     //   64: iload #9
/*     */     //   66: aload #6
/*     */     //   68: arraylength
/*     */     //   69: if_icmpge -> 161
/*     */     //   72: iload #10
/*     */     //   74: iload #9
/*     */     //   76: if_icmpgt -> 83
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_0
/*     */     //   84: invokestatic assert : (Z)V
/*     */     //   87: aload #6
/*     */     //   89: iload #9
/*     */     //   91: aaload
/*     */     //   92: astore #11
/*     */     //   94: aload #11
/*     */     //   96: astore #12
/*     */     //   98: iconst_0
/*     */     //   99: istore #13
/*     */     //   101: aload_0
/*     */     //   102: aload #12
/*     */     //   104: invokespecial collisionContainsElement : (Ljava/lang/Object;)Z
/*     */     //   107: ifne -> 114
/*     */     //   110: iconst_1
/*     */     //   111: goto -> 115
/*     */     //   114: iconst_0
/*     */     //   115: ifeq -> 154
/*     */     //   118: aload #4
/*     */     //   120: iload #7
/*     */     //   122: iload #10
/*     */     //   124: iadd
/*     */     //   125: aload #6
/*     */     //   127: iload #9
/*     */     //   129: aaload
/*     */     //   130: aastore
/*     */     //   131: iinc #10, 1
/*     */     //   134: nop
/*     */     //   135: iload #7
/*     */     //   137: iload #10
/*     */     //   139: iadd
/*     */     //   140: aload #4
/*     */     //   142: arraylength
/*     */     //   143: if_icmpgt -> 150
/*     */     //   146: iconst_1
/*     */     //   147: goto -> 151
/*     */     //   150: iconst_0
/*     */     //   151: invokestatic assert : (Z)V
/*     */     //   154: iinc #9, 1
/*     */     //   157: nop
/*     */     //   158: goto -> 64
/*     */     //   161: iload #10
/*     */     //   163: istore #5
/*     */     //   165: iload #5
/*     */     //   167: aload_0
/*     */     //   168: getfield buffer : [Ljava/lang/Object;
/*     */     //   171: arraylength
/*     */     //   172: iadd
/*     */     //   173: istore #6
/*     */     //   175: aload_2
/*     */     //   176: aload #4
/*     */     //   178: arraylength
/*     */     //   179: iload #6
/*     */     //   181: isub
/*     */     //   182: invokevirtual plusAssign : (I)V
/*     */     //   185: iload #6
/*     */     //   187: aload_0
/*     */     //   188: getfield buffer : [Ljava/lang/Object;
/*     */     //   191: arraylength
/*     */     //   192: if_icmpne -> 197
/*     */     //   195: aload_0
/*     */     //   196: areturn
/*     */     //   197: iload #6
/*     */     //   199: aload_1
/*     */     //   200: getfield buffer : [Ljava/lang/Object;
/*     */     //   203: arraylength
/*     */     //   204: if_icmpne -> 209
/*     */     //   207: aload_1
/*     */     //   208: areturn
/*     */     //   209: iload #6
/*     */     //   211: aload #4
/*     */     //   213: arraylength
/*     */     //   214: if_icmpne -> 222
/*     */     //   217: aload #4
/*     */     //   219: goto -> 235
/*     */     //   222: aload #4
/*     */     //   224: iload #6
/*     */     //   226: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   229: dup
/*     */     //   230: ldc 'copyOf(...)'
/*     */     //   232: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   235: astore #7
/*     */     //   237: aload_0
/*     */     //   238: getfield ownedBy : Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;
/*     */     //   241: aload_3
/*     */     //   242: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   245: ifeq -> 258
/*     */     //   248: aload_0
/*     */     //   249: aload #7
/*     */     //   251: putfield buffer : [Ljava/lang/Object;
/*     */     //   254: aload_0
/*     */     //   255: goto -> 269
/*     */     //   258: new androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   261: dup
/*     */     //   262: iconst_0
/*     */     //   263: aload #7
/*     */     //   265: aload_3
/*     */     //   266: invokespecial <init> : (I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V
/*     */     //   269: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #292	-> 0
/*     */     //   #293	-> 5
/*     */     //   #294	-> 14
/*     */     //   #296	-> 16
/*     */     //   #296	-> 40
/*     */     //   #297	-> 42
/*     */     //   #852	-> 58
/*     */     //   #853	-> 61
/*     */     //   #854	-> 64
/*     */     //   #855	-> 72
/*     */     //   #856	-> 87
/*     */     //   #857	-> 94
/*     */     //   #299	-> 101
/*     */     //   #857	-> 115
/*     */     //   #858	-> 118
/*     */     //   #859	-> 134
/*     */     //   #860	-> 135
/*     */     //   #862	-> 157
/*     */     //   #864	-> 161
/*     */     //   #297	-> 163
/*     */     //   #301	-> 165
/*     */     //   #302	-> 175
/*     */     //   #303	-> 185
/*     */     //   #304	-> 197
/*     */     //   #306	-> 209
/*     */     //   #306	-> 235
/*     */     //   #307	-> 237
/*     */     //   #308	-> 248
/*     */     //   #309	-> 254
/*     */     //   #311	-> 258
/*     */     //   #307	-> 269
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	14	13	$i$a$-filterTo-TrieNode$mutableCollisionAddAll$totalWritten$1	I
/*     */     //   98	17	12	it	Ljava/lang/Object;
/*     */     //   94	64	11	e$iv	Ljava/lang/Object;
/*     */     //   58	105	8	$i$f$filterTo	I
/*     */     //   61	102	9	i$iv	I
/*     */     //   64	99	10	j$iv	I
/*     */     //   55	108	6	$this$filterTo$iv	[Ljava/lang/Object;
/*     */     //   55	108	7	newArrayOffset$iv	I
/*     */     //   42	228	4	tempBuffer	[Ljava/lang/Object;
/*     */     //   165	105	5	totalWritten	I
/*     */     //   175	95	6	totalSize	I
/*     */     //   237	33	7	newBuffer	[Ljava/lang/Object;
/*     */     //   0	270	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	270	1	otherNode	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	270	2	intersectionSizeRef	Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;
/*     */     //   0	270	3	owner	Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;
/*     */   } private final Object mutableCollisionRemoveAll(TrieNode<Object> otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: if_acmpne -> 18
/*     */     //   5: aload_2
/*     */     //   6: aload_0
/*     */     //   7: getfield buffer : [Ljava/lang/Object;
/*     */     //   10: arraylength
/*     */     //   11: invokevirtual plusAssign : (I)V
/*     */     //   14: getstatic androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode.EMPTY : Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   17: areturn
/*     */     //   18: aload_3
/*     */     //   19: aload_0
/*     */     //   20: getfield ownedBy : Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;
/*     */     //   23: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 36
/*     */     //   29: aload_0
/*     */     //   30: getfield buffer : [Ljava/lang/Object;
/*     */     //   33: goto -> 44
/*     */     //   36: aload_0
/*     */     //   37: getfield buffer : [Ljava/lang/Object;
/*     */     //   40: arraylength
/*     */     //   41: anewarray java/lang/Object
/*     */     //   44: astore #4
/*     */     //   46: aload_0
/*     */     //   47: getfield buffer : [Ljava/lang/Object;
/*     */     //   50: astore #6
/*     */     //   52: iconst_0
/*     */     //   53: istore #7
/*     */     //   55: iconst_0
/*     */     //   56: istore #8
/*     */     //   58: iconst_0
/*     */     //   59: istore #9
/*     */     //   61: iconst_0
/*     */     //   62: istore #10
/*     */     //   64: iload #9
/*     */     //   66: aload #6
/*     */     //   68: arraylength
/*     */     //   69: if_icmpge -> 161
/*     */     //   72: iload #10
/*     */     //   74: iload #9
/*     */     //   76: if_icmpgt -> 83
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_0
/*     */     //   84: invokestatic assert : (Z)V
/*     */     //   87: aload #6
/*     */     //   89: iload #9
/*     */     //   91: aaload
/*     */     //   92: astore #11
/*     */     //   94: aload #11
/*     */     //   96: astore #12
/*     */     //   98: iconst_0
/*     */     //   99: istore #13
/*     */     //   101: aload_1
/*     */     //   102: aload #12
/*     */     //   104: invokespecial collisionContainsElement : (Ljava/lang/Object;)Z
/*     */     //   107: ifne -> 114
/*     */     //   110: iconst_1
/*     */     //   111: goto -> 115
/*     */     //   114: iconst_0
/*     */     //   115: ifeq -> 154
/*     */     //   118: aload #4
/*     */     //   120: iload #7
/*     */     //   122: iload #10
/*     */     //   124: iadd
/*     */     //   125: aload #6
/*     */     //   127: iload #9
/*     */     //   129: aaload
/*     */     //   130: aastore
/*     */     //   131: iinc #10, 1
/*     */     //   134: nop
/*     */     //   135: iload #7
/*     */     //   137: iload #10
/*     */     //   139: iadd
/*     */     //   140: aload #4
/*     */     //   142: arraylength
/*     */     //   143: if_icmpgt -> 150
/*     */     //   146: iconst_1
/*     */     //   147: goto -> 151
/*     */     //   150: iconst_0
/*     */     //   151: invokestatic assert : (Z)V
/*     */     //   154: iinc #9, 1
/*     */     //   157: nop
/*     */     //   158: goto -> 64
/*     */     //   161: iload #10
/*     */     //   163: istore #5
/*     */     //   165: aload_2
/*     */     //   166: aload_0
/*     */     //   167: getfield buffer : [Ljava/lang/Object;
/*     */     //   170: arraylength
/*     */     //   171: iload #5
/*     */     //   173: isub
/*     */     //   174: invokevirtual plusAssign : (I)V
/*     */     //   177: iload #5
/*     */     //   179: istore #6
/*     */     //   181: iload #6
/*     */     //   183: ifne -> 192
/*     */     //   186: getstatic androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode.EMPTY : Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   189: goto -> 263
/*     */     //   192: iload #6
/*     */     //   194: iconst_1
/*     */     //   195: if_icmpne -> 205
/*     */     //   198: aload #4
/*     */     //   200: iconst_0
/*     */     //   201: aaload
/*     */     //   202: goto -> 263
/*     */     //   205: iload #6
/*     */     //   207: aload_0
/*     */     //   208: getfield buffer : [Ljava/lang/Object;
/*     */     //   211: arraylength
/*     */     //   212: if_icmpne -> 219
/*     */     //   215: aload_0
/*     */     //   216: goto -> 263
/*     */     //   219: iload #6
/*     */     //   221: aload #4
/*     */     //   223: arraylength
/*     */     //   224: if_icmpne -> 241
/*     */     //   227: new androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   230: dup
/*     */     //   231: iconst_0
/*     */     //   232: aload #4
/*     */     //   234: aload_3
/*     */     //   235: invokespecial <init> : (I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V
/*     */     //   238: goto -> 263
/*     */     //   241: new androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   244: dup
/*     */     //   245: iconst_0
/*     */     //   246: aload #4
/*     */     //   248: iload #5
/*     */     //   250: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   253: dup
/*     */     //   254: ldc 'copyOf(...)'
/*     */     //   256: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   259: aload_3
/*     */     //   260: invokespecial <init> : (I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V
/*     */     //   263: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #342	-> 0
/*     */     //   #343	-> 5
/*     */     //   #344	-> 14
/*     */     //   #346	-> 18
/*     */     //   #347	-> 46
/*     */     //   #882	-> 52
/*     */     //   #884	-> 52
/*     */     //   #882	-> 55
/*     */     //   #882	-> 55
/*     */     //   #886	-> 58
/*     */     //   #887	-> 61
/*     */     //   #888	-> 64
/*     */     //   #889	-> 72
/*     */     //   #890	-> 87
/*     */     //   #891	-> 94
/*     */     //   #349	-> 101
/*     */     //   #891	-> 115
/*     */     //   #892	-> 118
/*     */     //   #893	-> 134
/*     */     //   #894	-> 135
/*     */     //   #896	-> 157
/*     */     //   #898	-> 161
/*     */     //   #347	-> 163
/*     */     //   #351	-> 165
/*     */     //   #352	-> 177
/*     */     //   #353	-> 181
/*     */     //   #354	-> 192
/*     */     //   #355	-> 205
/*     */     //   #356	-> 219
/*     */     //   #357	-> 241
/*     */     //   #357	-> 259
/*     */     //   #352	-> 263
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	14	13	$i$a$-filterTo$default-TrieNode$mutableCollisionRemoveAll$totalWritten$1	I
/*     */     //   98	17	12	it	Ljava/lang/Object;
/*     */     //   94	64	11	e$iv	Ljava/lang/Object;
/*     */     //   58	105	8	$i$f$filterTo	I
/*     */     //   61	102	9	i$iv	I
/*     */     //   64	99	10	j$iv	I
/*     */     //   52	111	6	$this$filterTo_u24default$iv	[Ljava/lang/Object;
/*     */     //   55	108	7	newArrayOffset$iv	I
/*     */     //   46	218	4	tempBuffer	[Ljava/lang/Object;
/*     */     //   165	99	5	totalWritten	I
/*     */     //   0	264	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	264	1	otherNode	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	264	2	intersectionSizeRef	Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;
/*     */     //   0	264	3	owner	Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;
/*     */   }
/*     */   private final int calculateSize() {
/*     */     if (this.bitmap == 0)
/*     */       return this.buffer.length; 
/*     */     int result = 0;
/*     */     Object[] arrayOfObject;
/*     */     byte b;
/*     */     int i;
/*     */     for (arrayOfObject = this.buffer, b = 0, i = arrayOfObject.length; b < i; ) {
/*     */       Object e = arrayOfObject[b];
/*     */       result += (e instanceof TrieNode) ? ((TrieNode)e).calculateSize() : 1;
/*     */       b++;
/*     */     } 
/*     */     return result;
/*     */   }
/*     */   private final boolean elementsIdentityEquals(TrieNode otherNode) {
/*     */     if (this == otherNode)
/*     */       return true; 
/*     */     if (this.bitmap != otherNode.bitmap)
/*     */       return false; 
/*     */     for (int i = 0, j = this.buffer.length; i < j; i++) {
/*     */       if (this.buffer[i] != otherNode.buffer[i])
/*     */         return false; 
/*     */     } 
/*     */     return true;
/*     */   }
/* 317 */   private final Object mutableCollisionRetainAll(TrieNode<Object> otherNode, DeltaCounter intersectionSizeRef, MutabilityOwnership owner) { if (this == otherNode) {
/* 318 */       intersectionSizeRef.plusAssign(this.buffer.length);
/* 319 */       return this;
/*     */     } 
/* 321 */     Object[] tempBuffer = 
/* 322 */       Intrinsics.areEqual(owner, this.ownedBy) ? this.buffer : 
/* 323 */       new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
/* 324 */     Object[] $this$filterTo_u24default$iv = this.buffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 867 */     int newArrayOffset$iv = 0;
/*     */     int $i$f$filterTo = 0;
/* 869 */     int i$iv = 0;
/* 870 */     int j$iv = 0;
/* 871 */     if (i$iv < $this$filterTo_u24default$iv.length) {
/* 872 */       CommonFunctionsKt.assert((j$iv <= i$iv));
/* 873 */       Object e$iv = $this$filterTo_u24default$iv[i$iv];
/* 874 */       Object it = e$iv; int $i$a$-filterTo$default-TrieNode$mutableCollisionRetainAll$totalWritten$1 = 0; if (otherNode.collisionContainsElement(it)) {
/* 875 */         tempBuffer[newArrayOffset$iv + j$iv] = $this$filterTo_u24default$iv[i$iv]; j$iv++;
/*     */         
/* 877 */         CommonFunctionsKt.assert((newArrayOffset$iv + j$iv <= tempBuffer.length));
/*     */       } 
/*     */     } 
/*     */     
/* 881 */     int totalWritten = j$iv; intersectionSizeRef.plusAssign(totalWritten); int i = totalWritten; Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(tempBuffer, totalWritten), "copyOf(...)"); return (i == 0) ? EMPTY : ((i == 1) ? tempBuffer[0] : ((i == this.buffer.length) ? this : ((i == otherNode.buffer.length) ? otherNode : ((i == tempBuffer.length) ? new TrieNode(0, tempBuffer, owner) : new TrieNode(0, Arrays.copyOf(tempBuffer, totalWritten), owner))))); } public final boolean contains(int elementHash, Object element, int shift) { int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift); if (hasNoCellAt(cellPositionMask))
/*     */       return false;  int cellIndex = indexOfCellAt$runtime(cellPositionMask); if (this.buffer[cellIndex] instanceof TrieNode) {
/*     */       TrieNode<E> targetNode = nodeAtIndex(cellIndex); if (shift == 30)
/*     */         return targetNode.collisionContainsElement((E)element);  return targetNode.contains(elementHash, (E)element, shift + 5);
/*     */     } 
/*     */     return Intrinsics.areEqual(element, this.buffer[cellIndex]); }
/*     */   @NotNull public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder mutator) { Intrinsics.checkNotNullParameter(otherNode, "otherNode");
/*     */     Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
/*     */     Intrinsics.checkNotNullParameter(mutator, "mutator");
/*     */     if (this == otherNode) {
/*     */       intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
/*     */       return this;
/*     */     } 
/*     */     if (shift > 30)
/*     */       return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime()); 
/*     */     int newBitMap = this.bitmap | otherNode.bitmap;
/*     */     TrieNode<E> mutableNode = (newBitMap == this.bitmap && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime())) ? this : new TrieNode(newBitMap, new Object[Integer.bitCount(newBitMap)], mutator.getOwnership$runtime());
/*     */     int $this$forEachOneBit$iv = newBitMap, $i$f$forEachOneBit = 0;
/* 899 */     int mask$iv = $this$forEachOneBit$iv;
/* 900 */     int index$iv = 0;
/* 901 */     for (; mask$iv != 0; thisIndex = indexOfCellAt$runtime(positionMask), otherNodeIndex = otherNode.indexOfCellAt$runtime(positionMask)) {
/* 902 */       int thisIndex, otherNodeIndex, bit$iv = Integer.lowestOneBit(mask$iv);
/* 903 */       int i = index$iv, positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutableAddAll$1 = 0;
/*     */     }  return elementsIdentityEquals(mutableNode) ? this : (otherNode.elementsIdentityEquals(mutableNode) ? otherNode : mutableNode); } @Nullable public final Object mutableRetainAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder mutator) { Intrinsics.checkNotNullParameter(otherNode, "otherNode"); Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef"); Intrinsics.checkNotNullParameter(mutator, "mutator"); if (this == otherNode) {
/*     */       intersectionSizeRef.plusAssign(calculateSize()); return this;
/*     */     }  if (shift > 30)
/*     */       return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime());  int newBitMap = this.bitmap & otherNode.bitmap; if (newBitMap == 0)
/*     */       return EMPTY;  TrieNode<E> mutableNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime()) && newBitMap == this.bitmap) ? this : new TrieNode(newBitMap, new Object[Integer.bitCount(newBitMap)], mutator.getOwnership$runtime()); int realBitMap = 0; int $this$forEachOneBit$iv = newBitMap, $i$f$forEachOneBit = 0;
/* 909 */     int mask$iv = $this$forEachOneBit$iv;
/* 910 */     int index$iv = 0;
/* 911 */     for (; mask$iv != 0; thisIndex = indexOfCellAt$runtime(positionMask), otherNodeIndex = otherNode.indexOfCellAt$runtime(positionMask), $this$mutableRetainAll_u24lambda_u249_u24lambda_u248 = this, $i$a$-run-TrieNode$mutableRetainAll$1$newValue$1 = 0, thisCell = $this$mutableRetainAll_u24lambda_u249_u24lambda_u248.buffer[thisIndex], otherNodeCell = otherNode.buffer[otherNodeIndex], thisIsNode = thisCell instanceof TrieNode, otherIsNode = otherNodeCell instanceof TrieNode) {
/* 912 */       int thisIndex, otherNodeIndex; TrieNode $this$mutableRetainAll_u24lambda_u249_u24lambda_u248; int $i$a$-run-TrieNode$mutableRetainAll$1$newValue$1; Object thisCell, otherNodeCell; boolean thisIsNode, otherIsNode; int bit$iv = Integer.lowestOneBit(mask$iv);
/* 913 */       int i = index$iv, positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutableRetainAll$1 = 0;
/*     */     }  int realSize = Integer.bitCount(realBitMap); if (realSize == 1 && shift != 0) {
/*     */       Object single = mutableNode.buffer[mutableNode.indexOfCellAt$runtime(realBitMap)]; Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = single;
/*     */     } else {
/*     */       Object[] realBuffer = new Object[realSize];
/*     */       Object[] $this$filterTo_u24default$iv = mutableNode.buffer;
/* 920 */       int newArrayOffset$iv = 0;
/*     */       int $i$f$filterTo = 0;
/* 922 */       int i$iv = 0;
/* 923 */       int j$iv = 0;
/* 924 */       if (i$iv < $this$filterTo_u24default$iv.length)
/* 925 */       { CommonFunctionsKt.assert((j$iv <= i$iv));
/* 926 */         Object e$iv = $this$filterTo_u24default$iv[i$iv];
/* 927 */         Object object1 = e$iv; int $i$a$-filterTo-TrieNodeKt$filterTo$1 = 0; Object it = object1;
/* 928 */         if ((it != Companion.getEMPTY$runtime()))
/* 929 */         { realBuffer[newArrayOffset$iv + j$iv] = $this$filterTo_u24default$iv[i$iv]; j$iv++;
/*     */           
/* 931 */           CommonFunctionsKt.assert((newArrayOffset$iv + j$iv <= realBuffer.length)); }  i$iv++; } else {  }
/*     */     
/*     */     }  return (realBitMap == 0) ? EMPTY : ((realBitMap == newBitMap) ? (mutableNode.elementsIdentityEquals(this) ? this : (mutableNode.elementsIdentityEquals(otherNode) ? otherNode : mutableNode)) : new TrieNode(realBitMap, realBuffer, mutator.getOwnership$runtime())); } @Nullable public final Object mutableRemoveAll(@NotNull TrieNode<E> otherNode, int shift, @NotNull DeltaCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder mutator) { Intrinsics.checkNotNullParameter(otherNode, "otherNode"); Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef"); Intrinsics.checkNotNullParameter(mutator, "mutator"); if (this == otherNode) { intersectionSizeRef.plusAssign(calculateSize()); return EMPTY; }
/*     */      if (shift > 30)
/*     */       return mutableCollisionRemoveAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime());  int removalBitmap = this.bitmap & otherNode.bitmap; if (removalBitmap == 0)
/* 936 */       return this;  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); TrieNode mutableNode = Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime()) ? this : new TrieNode(this.bitmap, Arrays.copyOf(this.buffer, this.buffer.length), mutator.getOwnership$runtime()); int realBitMap = 0; realBitMap = this.bitmap; int $this$forEachOneBit$iv = removalBitmap, $i$f$forEachOneBit = 0; int mask$iv = $this$forEachOneBit$iv;
/* 937 */     int index$iv = 0;
/* 938 */     for (; mask$iv != 0; thisIndex = indexOfCellAt$runtime(positionMask), otherNodeIndex = otherNode.indexOfCellAt$runtime(positionMask), $this$mutableRemoveAll_u24lambda_u2411_u24lambda_u2410 = this, $i$a$-run-TrieNode$mutableRemoveAll$1$newValue$1 = 0, thisCell = $this$mutableRemoveAll_u24lambda_u2411_u24lambda_u2410.buffer[thisIndex], otherNodeCell = otherNode.buffer[otherNodeIndex], thisIsNode = thisCell instanceof TrieNode, otherIsNode = otherNodeCell instanceof TrieNode) {
/* 939 */       int thisIndex, otherNodeIndex; TrieNode $this$mutableRemoveAll_u24lambda_u2411_u24lambda_u2410; int $i$a$-run-TrieNode$mutableRemoveAll$1$newValue$1; Object thisCell, otherNodeCell; boolean thisIsNode, otherIsNode; int bit$iv = Integer.lowestOneBit(mask$iv);
/* 940 */       int positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutableRemoveAll$1 = 0;
/*     */     }  int realSize = Integer.bitCount(realBitMap); if (realSize == 1 && shift != 0) {
/*     */       Object single = mutableNode.buffer[mutableNode.indexOfCellAt$runtime(realBitMap)]; Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = single;
/*     */     } else {
/*     */       Object[] realBuffer = new Object[realSize];
/*     */       Object[] $this$filterTo_u24default$iv = mutableNode.buffer;
/* 947 */       int newArrayOffset$iv = 0;
/*     */       int $i$f$filterTo = 0;
/* 949 */       int i$iv = 0;
/* 950 */       int j$iv = 0;
/* 951 */       if (i$iv < $this$filterTo_u24default$iv.length) {
/* 952 */         CommonFunctionsKt.assert((j$iv <= i$iv));
/* 953 */         Object e$iv = $this$filterTo_u24default$iv[i$iv];
/* 954 */         Object object1 = e$iv; int $i$a$-filterTo-TrieNodeKt$filterTo$1 = 0; Object it = object1;
/* 955 */         if ((it != Companion.getEMPTY$runtime()))
/* 956 */         { realBuffer[newArrayOffset$iv + j$iv] = $this$filterTo_u24default$iv[i$iv]; j$iv++;
/*     */           
/* 958 */           CommonFunctionsKt.assert((newArrayOffset$iv + j$iv <= realBuffer.length)); }  i$iv++;
/*     */       } else {
/*     */       
/*     */       } 
/*     */     }  return (realBitMap == 0) ? EMPTY : ((realBitMap == this.bitmap) ? (mutableNode.elementsIdentityEquals(this) ? this : mutableNode) : new TrieNode(realBitMap, realBuffer, mutator.getOwnership$runtime())); } public final boolean containsAll(@NotNull TrieNode otherNode, int shift) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'otherNode'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: if_acmpne -> 14
/*     */     //   12: iconst_1
/*     */     //   13: ireturn
/*     */     //   14: iload_2
/*     */     //   15: bipush #30
/*     */     //   17: if_icmple -> 79
/*     */     //   20: aload_1
/*     */     //   21: getfield buffer : [Ljava/lang/Object;
/*     */     //   24: astore_3
/*     */     //   25: iconst_0
/*     */     //   26: istore #4
/*     */     //   28: iconst_0
/*     */     //   29: istore #5
/*     */     //   31: aload_3
/*     */     //   32: arraylength
/*     */     //   33: istore #6
/*     */     //   35: iload #5
/*     */     //   37: iload #6
/*     */     //   39: if_icmpge -> 77
/*     */     //   42: aload_3
/*     */     //   43: iload #5
/*     */     //   45: aaload
/*     */     //   46: astore #7
/*     */     //   48: aload #7
/*     */     //   50: astore #8
/*     */     //   52: iconst_0
/*     */     //   53: istore #9
/*     */     //   55: aload_0
/*     */     //   56: getfield buffer : [Ljava/lang/Object;
/*     */     //   59: aload #8
/*     */     //   61: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   64: ifne -> 71
/*     */     //   67: iconst_0
/*     */     //   68: goto -> 78
/*     */     //   71: iinc #5, 1
/*     */     //   74: goto -> 35
/*     */     //   77: iconst_1
/*     */     //   78: ireturn
/*     */     //   79: aload_0
/*     */     //   80: getfield bitmap : I
/*     */     //   83: aload_1
/*     */     //   84: getfield bitmap : I
/*     */     //   87: iand
/*     */     //   88: istore_3
/*     */     //   89: iload_3
/*     */     //   90: aload_1
/*     */     //   91: getfield bitmap : I
/*     */     //   94: if_icmpeq -> 99
/*     */     //   97: iconst_0
/*     */     //   98: ireturn
/*     */     //   99: iload_3
/*     */     //   100: istore #4
/*     */     //   102: iconst_0
/*     */     //   103: istore #5
/*     */     //   105: iload #4
/*     */     //   107: istore #6
/*     */     //   109: iconst_0
/*     */     //   110: istore #7
/*     */     //   112: iload #6
/*     */     //   114: ifeq -> 325
/*     */     //   117: iload #6
/*     */     //   119: invokestatic lowestOneBit : (I)I
/*     */     //   122: istore #8
/*     */     //   124: iload #8
/*     */     //   126: istore #10
/*     */     //   128: iconst_0
/*     */     //   129: istore #11
/*     */     //   131: aload_0
/*     */     //   132: iload #10
/*     */     //   134: invokevirtual indexOfCellAt$runtime : (I)I
/*     */     //   137: istore #12
/*     */     //   139: aload_1
/*     */     //   140: iload #10
/*     */     //   142: invokevirtual indexOfCellAt$runtime : (I)I
/*     */     //   145: istore #13
/*     */     //   147: aload_0
/*     */     //   148: getfield buffer : [Ljava/lang/Object;
/*     */     //   151: iload #12
/*     */     //   153: aaload
/*     */     //   154: astore #14
/*     */     //   156: aload_1
/*     */     //   157: getfield buffer : [Ljava/lang/Object;
/*     */     //   160: iload #13
/*     */     //   162: aaload
/*     */     //   163: astore #15
/*     */     //   165: aload #14
/*     */     //   167: instanceof androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   170: istore #16
/*     */     //   172: aload #15
/*     */     //   174: instanceof androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   177: istore #17
/*     */     //   179: nop
/*     */     //   180: iload #16
/*     */     //   182: ifeq -> 239
/*     */     //   185: iload #17
/*     */     //   187: ifeq -> 239
/*     */     //   190: aload #14
/*     */     //   192: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>'
/*     */     //   195: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   198: aload #14
/*     */     //   200: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   203: pop
/*     */     //   204: aload #15
/*     */     //   206: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>'
/*     */     //   209: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   212: aload #15
/*     */     //   214: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   217: pop
/*     */     //   218: aload #14
/*     */     //   220: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   223: aload #15
/*     */     //   225: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   228: iload_2
/*     */     //   229: iconst_5
/*     */     //   230: iadd
/*     */     //   231: invokevirtual containsAll : (Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z
/*     */     //   234: ifne -> 310
/*     */     //   237: iconst_0
/*     */     //   238: ireturn
/*     */     //   239: iload #16
/*     */     //   241: ifeq -> 291
/*     */     //   244: aload #14
/*     */     //   246: ldc_w 'null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>'
/*     */     //   249: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   252: aload #14
/*     */     //   254: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   257: pop
/*     */     //   258: nop
/*     */     //   259: aload #14
/*     */     //   261: checkcast androidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode
/*     */     //   264: aload #15
/*     */     //   266: dup
/*     */     //   267: ifnull -> 276
/*     */     //   270: invokevirtual hashCode : ()I
/*     */     //   273: goto -> 278
/*     */     //   276: pop
/*     */     //   277: iconst_0
/*     */     //   278: aload #15
/*     */     //   280: iload_2
/*     */     //   281: iconst_5
/*     */     //   282: iadd
/*     */     //   283: invokevirtual contains : (ILjava/lang/Object;I)Z
/*     */     //   286: ifne -> 310
/*     */     //   289: iconst_0
/*     */     //   290: ireturn
/*     */     //   291: iload #17
/*     */     //   293: ifeq -> 298
/*     */     //   296: iconst_0
/*     */     //   297: ireturn
/*     */     //   298: aload #14
/*     */     //   300: aload #15
/*     */     //   302: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   305: ifne -> 310
/*     */     //   308: iconst_0
/*     */     //   309: ireturn
/*     */     //   310: nop
/*     */     //   311: nop
/*     */     //   312: iinc #7, 1
/*     */     //   315: iload #6
/*     */     //   317: iload #8
/*     */     //   319: ixor
/*     */     //   320: istore #6
/*     */     //   322: goto -> 112
/*     */     //   325: nop
/*     */     //   326: iconst_1
/*     */     //   327: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #708	-> 7
/*     */     //   #710	-> 14
/*     */     //   #963	-> 28
/*     */     //   #710	-> 55
/*     */     //   #963	-> 64
/*     */     //   #964	-> 77
/*     */     //   #710	-> 78
/*     */     //   #713	-> 79
/*     */     //   #715	-> 89
/*     */     //   #717	-> 99
/*     */     //   #965	-> 105
/*     */     //   #966	-> 109
/*     */     //   #967	-> 112
/*     */     //   #968	-> 117
/*     */     //   #968	-> 122
/*     */     //   #969	-> 124
/*     */     //   #718	-> 131
/*     */     //   #719	-> 139
/*     */     //   #720	-> 147
/*     */     //   #721	-> 156
/*     */     //   #722	-> 165
/*     */     //   #723	-> 172
/*     */     //   #724	-> 179
/*     */     //   #726	-> 180
/*     */     //   #727	-> 190
/*     */     //   #728	-> 204
/*     */     //   #729	-> 218
/*     */     //   #732	-> 239
/*     */     //   #733	-> 244
/*     */     //   #734	-> 258
/*     */     //   #735	-> 259
/*     */     //   #735	-> 278
/*     */     //   #738	-> 291
/*     */     //   #740	-> 298
/*     */     //   #742	-> 310
/*     */     //   #969	-> 311
/*     */     //   #970	-> 312
/*     */     //   #971	-> 315
/*     */     //   #973	-> 325
/*     */     //   #743	-> 326
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	9	9	$i$a$-all-TrieNode$containsAll$1	I
/*     */     //   52	12	8	it	Ljava/lang/Object;
/*     */     //   48	23	7	element$iv	Ljava/lang/Object;
/*     */     //   28	50	4	$i$f$all	I
/*     */     //   25	53	3	$this$all$iv	[Ljava/lang/Object;
/*     */     //   131	180	11	$i$a$-forEachOneBit-TrieNode$containsAll$2	I
/*     */     //   139	172	12	thisIndex	I
/*     */     //   147	164	13	otherNodeIndex	I
/*     */     //   156	155	14	thisCell	Ljava/lang/Object;
/*     */     //   165	146	15	otherNodeCell	Ljava/lang/Object;
/*     */     //   172	139	16	thisIsNode	Z
/*     */     //   179	132	17	otherIsNode	Z
/*     */     //   128	183	10	positionMask	I
/*     */     //   124	198	8	bit$iv	I
/*     */     //   105	221	5	$i$f$forEachOneBit	I
/*     */     //   109	217	6	mask$iv	I
/*     */     //   112	214	7	index$iv	I
/*     */     //   102	224	4	$this$forEachOneBit$iv	I
/*     */     //   89	239	3	potentialBitMap	I
/*     */     //   0	328	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	328	1	otherNode	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;
/*     */     //   0	328	2	shift	I }
/*     */   @NotNull public final TrieNode<E> add(int elementHash, Object element, int shift) { int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift); if (hasNoCellAt(cellPositionMask))
/*     */       return addElementAt(cellPositionMask, (E)element);  int cellIndex = indexOfCellAt$runtime(cellPositionMask); if (this.buffer[cellIndex] instanceof TrieNode) {
/*     */       TrieNode<E> targetNode = nodeAtIndex(cellIndex);
/*     */       TrieNode<E> newNode = (shift == 30) ? targetNode.collisionAdd((E)element) : targetNode.add(elementHash, (E)element, shift + 5);
/*     */       if (targetNode == newNode)
/*     */         return this; 
/*     */       return updateNodeAtIndex(cellIndex, newNode);
/*     */     } 
/*     */     if (Intrinsics.areEqual(element, this.buffer[cellIndex]))
/*     */       return this; 
/*     */     return moveElementToNode(cellIndex, elementHash, (E)element, shift); }
/* 974 */   @NotNull private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
/*     */   
/*     */   @NotNull
/*     */   public final TrieNode<E> mutableAdd(int elementHash, Object element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
/*     */     Intrinsics.checkNotNullParameter(mutator, "mutator");
/*     */     int cellPosition = 1 << TrieNodeKt.indexSegment(elementHash, shift);
/*     */     if (hasNoCellAt(cellPosition)) {
/*     */       int j = mutator.size();
/*     */       mutator.setSize(j + 1);
/*     */       return mutableAddElementAt(cellPosition, (E)element, mutator.getOwnership$runtime());
/*     */     } 
/*     */     int cellIndex = indexOfCellAt$runtime(cellPosition);
/*     */     if (this.buffer[cellIndex] instanceof TrieNode) {
/*     */       TrieNode<E> targetNode = nodeAtIndex(cellIndex);
/*     */       TrieNode<E> newNode = (shift == 30) ? targetNode.mutableCollisionAdd((E)element, mutator) : targetNode.mutableAdd(elementHash, (E)element, shift + 5, mutator);
/*     */       if (targetNode == newNode)
/*     */         return this; 
/*     */       return mutableUpdateNodeAtIndex(cellIndex, newNode, mutator.getOwnership$runtime());
/*     */     } 
/*     */     if (Intrinsics.areEqual(element, this.buffer[cellIndex]))
/*     */       return this; 
/*     */     int i = mutator.size();
/*     */     mutator.setSize(i + 1);
/*     */     return mutableMoveElementToNode(cellIndex, elementHash, (E)element, shift, mutator.getOwnership$runtime());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TrieNode<E> remove(int elementHash, Object element, int shift) {
/*     */     int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
/*     */     if (hasNoCellAt(cellPositionMask))
/*     */       return this; 
/*     */     int cellIndex = indexOfCellAt$runtime(cellPositionMask);
/*     */     if (this.buffer[cellIndex] instanceof TrieNode) {
/*     */       TrieNode<E> targetNode = nodeAtIndex(cellIndex);
/*     */       TrieNode<E> newNode = (shift == 30) ? targetNode.collisionRemove((E)element) : targetNode.remove(elementHash, (E)element, shift + 5);
/*     */       if (targetNode == newNode)
/*     */         return this; 
/*     */       return updateNodeAtIndex(cellIndex, newNode);
/*     */     } 
/*     */     if (Intrinsics.areEqual(element, this.buffer[cellIndex]))
/*     */       return removeCellAtIndex(cellIndex, cellPositionMask); 
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TrieNode<E> mutableRemove(int elementHash, Object element, int shift, @NotNull PersistentHashSetBuilder<?> mutator) {
/*     */     Intrinsics.checkNotNullParameter(mutator, "mutator");
/*     */     int cellPositionMask = 1 << TrieNodeKt.indexSegment(elementHash, shift);
/*     */     if (hasNoCellAt(cellPositionMask))
/*     */       return this; 
/*     */     int cellIndex = indexOfCellAt$runtime(cellPositionMask);
/*     */     if (this.buffer[cellIndex] instanceof TrieNode) {
/*     */       TrieNode<E> targetNode = nodeAtIndex(cellIndex);
/*     */       TrieNode<E> newNode = (shift == 30) ? targetNode.mutableCollisionRemove((E)element, mutator) : targetNode.mutableRemove(elementHash, (E)element, shift + 5, mutator);
/*     */       if (this.ownedBy == mutator.getOwnership$runtime() || targetNode != newNode)
/*     */         return mutableUpdateNodeAtIndex(cellIndex, newNode, mutator.getOwnership$runtime()); 
/*     */       return this;
/*     */     } 
/*     */     if (Intrinsics.areEqual(element, this.buffer[cellIndex])) {
/*     */       int i = mutator.size();
/*     */       mutator.setSize(i + -1);
/*     */       return mutableRemoveCellAtIndex(cellIndex, cellPositionMask, mutator.getOwnership$runtime());
/*     */     } 
/*     */     return this;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final TrieNode getEMPTY$runtime() {
/*     */       return TrieNode.EMPTY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private int bitmap;
/*     */   @NotNull
/*     */   private Object[] buffer;
/*     */   @Nullable
/*     */   private MutabilityOwnership ownedBy;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   static {
/*     */     int $i$f$emptyArray = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\TrieNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */