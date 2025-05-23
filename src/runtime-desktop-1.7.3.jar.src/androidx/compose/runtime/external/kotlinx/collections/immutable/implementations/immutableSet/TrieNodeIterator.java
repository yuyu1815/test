/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*     */ 
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\004\b\000\030\000*\006\b\000\020\001 \0012\0020\002B\005¢\006\002\020\003J\013\020\t\032\0028\000¢\006\002\020\nJ\016\020\013\032\n\022\006\b\001\022\0028\0000\fJ\006\020\r\032\0020\016J\006\020\017\032\0020\016J\006\020\020\032\0020\016J\006\020\021\032\0020\022J\013\020\023\032\0028\000¢\006\002\020\nJ%\020\024\032\0020\0222\016\020\004\032\n\022\006\022\004\030\0010\0020\0052\b\b\002\020\007\032\0020\b¢\006\002\020\025R\030\020\004\032\n\022\006\022\004\030\0010\0020\005X\016¢\006\004\n\002\020\006R\016\020\007\032\0020\bX\016¢\006\002\n\000¨\006\026"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "()V", "buffer", "", "[Ljava/lang/Object;", "index", "", "currentElement", "()Ljava/lang/Object;", "currentNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "hasNextCell", "", "hasNextElement", "hasNextNode", "moveToNextCell", "", "nextElement", "reset", "([Ljava/lang/Object;I)V", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class TrieNodeIterator<E>
/*     */ {
/*     */   @NotNull
/*  82 */   private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer();
/*     */   private int index;
/*     */   
/*     */   public final void reset(@NotNull Object[] buffer, int index) {
/*  86 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); this.buffer = buffer;
/*  87 */     this.index = index;
/*     */   }
/*     */   public static final int $stable = 8;
/*     */   public final boolean hasNextCell() {
/*  91 */     return (this.index < this.buffer.length);
/*     */   }
/*     */   
/*     */   public final void moveToNextCell() {
/*  95 */     CommonFunctionsKt.assert(hasNextCell());
/*  96 */     int i = this.index; this.index = i + 1;
/*     */   }
/*     */   
/*     */   public final boolean hasNextElement() {
/* 100 */     return (hasNextCell() && !(this.buffer[this.index] instanceof TrieNode));
/*     */   }
/*     */   
/*     */   public final E currentElement() {
/* 104 */     CommonFunctionsKt.assert(hasNextElement());
/*     */     
/* 106 */     return (E)this.buffer[this.index];
/*     */   }
/*     */   
/*     */   public final E nextElement() {
/* 110 */     CommonFunctionsKt.assert(hasNextElement());
/*     */     
/* 112 */     int i = this.index; this.index = i + 1; return (E)this.buffer[i];
/*     */   }
/*     */   
/*     */   public final boolean hasNextNode() {
/* 116 */     return (hasNextCell() && this.buffer[this.index] instanceof TrieNode);
/*     */   }
/*     */   @NotNull
/*     */   public final TrieNode<? extends E> currentNode() {
/* 120 */     CommonFunctionsKt.assert(hasNextNode());
/*     */     
/* 122 */     Intrinsics.checkNotNull(this.buffer[this.index], "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>"); return (TrieNode<? extends E>)this.buffer[this.index];
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\TrieNodeIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */