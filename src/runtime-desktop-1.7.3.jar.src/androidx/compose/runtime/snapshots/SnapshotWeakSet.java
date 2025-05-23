/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import androidx.compose.runtime.ActualJvm_jvmKt;
/*     */ import androidx.compose.runtime.WeakReference;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.TestOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\025\n\002\b\005\n\002\020\b\n\002\b\005\n\002\020\021\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\f\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\000*\b\b\000\020\001*\0020\0022\0020\002B\005¢\006\002\020\003J\023\020\030\032\0020\0312\006\020\032\032\0028\000¢\006\002\020\033J\035\020\034\032\0020\0132\006\020\032\032\0028\0002\006\020\035\032\0020\013H\002¢\006\002\020\036J%\020\037\032\0020\0132\006\020 \032\0020\0132\006\020\032\032\0028\0002\006\020!\032\0020\013H\002¢\006\002\020\"J\r\020#\032\0020\031H\001¢\006\002\b$J \020%\032\0020&2\022\020'\032\016\022\004\022\0028\000\022\004\022\0020\0310(H\bø\001\000R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R*\020\020\032\020\022\f\022\n\022\004\022\0028\000\030\0010\0220\021X\016¢\006\020\n\002\020\027\032\004\b\023\020\024\"\004\b\025\020\026\002\007\n\005\b20\001¨\006)"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "T", "", "()V", "hashes", "", "getHashes$runtime", "()[I", "setHashes$runtime", "([I)V", "size", "", "getSize$runtime", "()I", "setSize$runtime", "(I)V", "values", "", "Landroidx/compose/runtime/WeakReference;", "getValues$runtime", "()[Landroidx/compose/runtime/WeakReference;", "setValues$runtime", "([Landroidx/compose/runtime/WeakReference;)V", "[Landroidx/compose/runtime/WeakReference;", "add", "", "value", "(Ljava/lang/Object;)Z", "find", "hash", "(Ljava/lang/Object;I)I", "findExactIndex", "midIndex", "valueHash", "(ILjava/lang/Object;I)I", "isValid", "isValid$runtime", "removeIf", "", "block", "Lkotlin/Function1;", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class SnapshotWeakSet<T>
/*     */ {
/*     */   private int size;
/*     */   
/*     */   public final int getSize$runtime() {
/*  41 */     return this.size; } public final void setSize$runtime(int <set-?>) { this.size = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  48 */   private int[] hashes = new int[16]; @NotNull public final int[] getHashes$runtime() { return this.hashes; } public final void setHashes$runtime(@NotNull int[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.hashes = <set-?>; } public static final int $stable = 8; @NotNull
/*  49 */   private WeakReference<T>[] values = (WeakReference<T>[])new WeakReference[16]; @NotNull public final WeakReference<T>[] getValues$runtime() { return this.values; } public final void setValues$runtime(@NotNull WeakReference[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.values = (WeakReference<T>[])<set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean add(@NotNull Object value) {
/*  56 */     Intrinsics.checkNotNullParameter(value, "value"); int index = 0;
/*  57 */     int size = this.size;
/*  58 */     int hash = ActualJvm_jvmKt.identityHashCode(value);
/*  59 */     if (size > 0) {
/*  60 */       index = find((T)value, hash);
/*     */       
/*  62 */       if (index >= 0) {
/*  63 */         return false;
/*     */       }
/*     */     } else {
/*  66 */       index = -1;
/*     */     } 
/*     */     
/*  69 */     int insertIndex = -(index + 1);
/*  70 */     int capacity = this.values.length;
/*  71 */     if (size == capacity) {
/*  72 */       int newCapacity = capacity * 2;
/*  73 */       WeakReference[] newValues = new WeakReference[newCapacity];
/*  74 */       int[] newHashes = new int[newCapacity];
/*  75 */       ArraysKt.copyInto((Object[])this.values, 
/*  76 */           (Object[])newValues, 
/*  77 */           insertIndex + 1, 
/*  78 */           insertIndex, 
/*  79 */           size);
/*     */       
/*  81 */       ArraysKt.copyInto$default((Object[])this.values, 
/*  82 */           (Object[])newValues, 0, 0, 
/*  83 */           insertIndex, 6, null);
/*     */       
/*  85 */       ArraysKt.copyInto(this.hashes, 
/*  86 */           newHashes, 
/*  87 */           insertIndex + 1, 
/*  88 */           insertIndex, 
/*  89 */           size);
/*     */       
/*  91 */       ArraysKt.copyInto$default(this.hashes, 
/*  92 */           newHashes, 0, 0, 
/*  93 */           insertIndex, 6, null);
/*     */       
/*  95 */       this.values = (WeakReference<T>[])newValues;
/*  96 */       this.hashes = newHashes;
/*     */     } else {
/*  98 */       ArraysKt.copyInto((Object[])this.values, 
/*  99 */           (Object[])this.values, 
/* 100 */           insertIndex + 1, 
/* 101 */           insertIndex, 
/* 102 */           size);
/*     */       
/* 104 */       ArraysKt.copyInto(this.hashes, 
/* 105 */           this.hashes, 
/* 106 */           insertIndex + 1, 
/* 107 */           insertIndex, 
/* 108 */           size);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 113 */     this.values[insertIndex] = new WeakReference(value);
/* 114 */     this.hashes[insertIndex] = hash;
/* 115 */     int i = this.size; this.size = i + 1;
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void removeIf(@NotNull Function1 block) {
/* 127 */     Intrinsics.checkNotNullParameter(block, "block"); int $i$f$removeIf = 0, size = getSize$runtime();
/* 128 */     int currentUsed = 0;
/*     */     
/*     */     int i;
/* 131 */     for (i = 0; i < size; i++) {
/* 132 */       WeakReference<T> entry = getValues$runtime()[i];
/* 133 */       Object value = (entry != null) ? entry.get() : null;
/* 134 */       if (value != null && !((Boolean)block.invoke(value)).booleanValue()) {
/*     */         
/* 136 */         if (currentUsed != i) {
/* 137 */           getValues$runtime()[currentUsed] = entry;
/* 138 */           getHashes$runtime()[currentUsed] = getHashes$runtime()[i];
/*     */         } 
/* 140 */         currentUsed++;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 145 */     for (i = currentUsed; i < size; i++) {
/* 146 */       getValues$runtime()[i] = null;
/* 147 */       getHashes$runtime()[i] = 0;
/*     */     } 
/*     */ 
/*     */     
/* 151 */     if (currentUsed != size) {
/* 152 */       setSize$runtime(currentUsed);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int find(Object value, int hash) {
/* 161 */     int low = 0;
/* 162 */     int high = this.size - 1;
/*     */     
/* 164 */     while (low <= high) {
/* 165 */       int mid = low + high >>> 1;
/* 166 */       int midHash = this.hashes[mid];
/*     */       
/* 168 */       if (midHash < hash) { low = mid + 1; continue; }
/* 169 */        if (midHash > hash) { high = mid - 1; continue; }
/*     */       
/* 171 */       this.values[mid]; Object midVal = (this.values[mid] != null) ? this.values[mid].get() : null;
/* 172 */       if (value == midVal) return mid; 
/* 173 */       return findExactIndex(mid, (T)value, hash);
/*     */     } 
/*     */ 
/*     */     
/* 177 */     return -(low + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int findExactIndex(int midIndex, Object value, int valueHash) {
/*     */     int i;
/* 189 */     for (i = midIndex - 1; -1 < i && 
/* 190 */       this.hashes[i] == valueHash; i--) {
/*     */ 
/*     */       
/* 193 */       this.values[i]; Object v = (this.values[i] != null) ? this.values[i].get() : null;
/* 194 */       if (v == value) {
/* 195 */         return i;
/*     */       }
/*     */     } 
/*     */     int j;
/* 199 */     for (i = midIndex + 1, j = this.size; i < j; i++) {
/* 200 */       if (this.hashes[i] != valueHash)
/*     */       {
/* 202 */         return -(i + 1);
/*     */       }
/* 204 */       this.values[i]; Object v = (this.values[i] != null) ? this.values[i].get() : null;
/* 205 */       if (v == value) {
/* 206 */         return i;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 211 */     return -(this.size + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   @TestOnly
/*     */   public final boolean isValid$runtime() {
/* 217 */     int size = this.size;
/* 218 */     WeakReference<T>[] arrayOfWeakReference = this.values;
/* 219 */     int[] hashes = this.hashes;
/* 220 */     int capacity = arrayOfWeakReference.length;
/*     */ 
/*     */     
/* 223 */     if (size > capacity) return false;
/*     */ 
/*     */ 
/*     */     
/* 227 */     int previous = Integer.MIN_VALUE; int i;
/* 228 */     for (i = 0; i < size; i++) {
/* 229 */       WeakReference<T> entry; int hash = hashes[i];
/* 230 */       if (hash < previous) return false; 
/* 231 */       if (arrayOfWeakReference[i] == null) { arrayOfWeakReference[i]; return false; }
/* 232 */        Object value = entry.get();
/* 233 */       if (value != null && hash != ActualJvm_jvmKt.identityHashCode(value)) return false; 
/* 234 */       previous = hash;
/*     */     } 
/*     */ 
/*     */     
/* 238 */     for (i = size; i < capacity; i++) {
/* 239 */       if (hashes[i] != 0) return false; 
/* 240 */       if (arrayOfWeakReference[i] != null) return false;
/*     */     
/*     */     } 
/* 243 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotWeakSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */