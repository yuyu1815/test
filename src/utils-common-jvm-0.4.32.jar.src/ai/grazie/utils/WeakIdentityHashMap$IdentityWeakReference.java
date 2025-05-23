/*     */ package ai.grazie.utils;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\002\b\004\030\0002\b\022\004\022\0028\0000\001B\r\022\006\020\002\032\0028\000¢\006\002\020\003J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\005H\026R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\017"}, d2 = {"Lai/grazie/utils/WeakIdentityHashMap$IdentityWeakReference;", "Ljava/lang/ref/WeakReference;", "obj", "(Lai/grazie/utils/WeakIdentityHashMap;Ljava/lang/Object;)V", "hash", "", "getHash", "()I", "setHash", "(I)V", "equals", "", "other", "", "hashCode", "utils-common"})
/*     */ public final class IdentityWeakReference
/*     */   extends WeakReference<K>
/*     */ {
/*     */   private int hash;
/*     */   
/*     */   public IdentityWeakReference(Object obj) {
/* 144 */     super((K)obj, WeakIdentityHashMap.access$getQueue$p(WeakIdentityHashMap.this));
/*     */ 
/*     */ 
/*     */     
/* 148 */     this.hash = System.identityHashCode(obj);
/*     */   } public final int getHash() {
/*     */     return this.hash;
/*     */   } public int hashCode() {
/* 152 */     return this.hash;
/*     */   } public final void setHash(int <set-?>) {
/*     */     this.hash = <set-?>;
/*     */   } public boolean equals(@Nullable Object other) {
/* 156 */     if (this == other) {
/* 157 */       return true;
/*     */     }
/* 159 */     if (!(other instanceof IdentityWeakReference)) {
/* 160 */       return false;
/*     */     }
/* 162 */     return (get() == ((IdentityWeakReference)other).get());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\WeakIdentityHashMap$IdentityWeakReference.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */