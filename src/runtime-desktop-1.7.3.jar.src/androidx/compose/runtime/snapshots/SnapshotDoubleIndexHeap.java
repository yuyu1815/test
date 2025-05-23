/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
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
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\020\025\n\002\b\n\n\002\020\002\n\002\b\016\b\000\030\0002\0020\001B\005¢\006\002\020\002J\016\020\r\032\0020\0042\006\020\016\032\0020\004J\b\020\017\032\0020\004H\002J\020\020\020\032\0020\0212\006\020\022\032\0020\004H\002J\020\020\023\032\0020\0212\006\020\024\032\0020\004H\002J\020\020\025\032\0020\0042\b\b\002\020\026\032\0020\004J\016\020\027\032\0020\0212\006\020\024\032\0020\004J\020\020\030\032\0020\0212\006\020\007\032\0020\004H\002J\020\020\031\032\0020\0212\006\020\007\032\0020\004H\002J\030\020\032\032\0020\0212\006\020\033\032\0020\0042\006\020\034\032\0020\004H\002J\b\020\035\032\0020\021H\007J\030\020\036\032\0020\0212\006\020\024\032\0020\0042\006\020\016\032\0020\004H\007R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\006X\016¢\006\002\n\000R\016\020\007\032\0020\006X\016¢\006\002\n\000R\036\020\t\032\0020\0042\006\020\b\032\0020\004@BX\016¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\006X\016¢\006\002\n\000¨\006\037"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "add", "value", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class SnapshotDoubleIndexHeap
/*     */ {
/*     */   private int size;
/*     */   
/*     */   public final int getSize() {
/*  38 */     return this.size;
/*     */   }
/*     */   @NotNull
/*  41 */   private int[] values = new int[16];
/*     */   
/*     */   @NotNull
/*  44 */   private int[] index = new int[16]; @NotNull
/*     */   private int[] handles;
/*     */   
/*     */   public SnapshotDoubleIndexHeap() {
/*     */     int[] arrayOfInt;
/*     */     SnapshotDoubleIndexHeap snapshotDoubleIndexHeap;
/*  50 */     for (byte b = 0; b < 16; ) { byte b1 = b; arrayOfInt[b1] = b1 + 1; b++; }  snapshotDoubleIndexHeap.handles = arrayOfInt;
/*     */   }
/*     */   private int firstFreeHandle; public static final int $stable = 8;
/*     */   
/*     */   public final int lowestOrDefault(int default) {
/*  55 */     return (this.size > 0) ? this.values[0] : default;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int add(int value) {
/*  62 */     ensure(this.size + 1);
/*  63 */     int j = this.size; this.size = j + 1; int i = j;
/*  64 */     int handle = allocateHandle();
/*  65 */     this.values[i] = value;
/*  66 */     this.index[i] = handle;
/*  67 */     this.handles[handle] = i;
/*  68 */     shiftUp(i);
/*  69 */     return handle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void remove(int handle) {
/*  78 */     int i = this.handles[handle];
/*  79 */     swap(i, this.size - 1);
/*  80 */     int j = this.size; this.size = j + -1;
/*  81 */     shiftUp(i);
/*  82 */     shiftDown(i);
/*  83 */     freeHandle(handle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @TestOnly
/*     */   public final void validate() {
/*  91 */     for (int index = 1, i = this.size; index < i; index++) {
/*  92 */       int parent = (index + 1 >> 1) - 1;
/*  93 */       if (this.values[parent] > this.values[index]) throw new IllegalStateException(("Index " + index + " is out of place").toString());
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @TestOnly
/*     */   public final void validateHandle(int handle, int value) {
/* 102 */     int i = this.handles[handle];
/* 103 */     if (this.index[i] != handle) throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString()); 
/* 104 */     if (this.values[i] != value) throw new IllegalStateException((
/* 105 */           "Value for handle " + handle + " was " + this.values[i] + " but was supposed to be " + value).toString());
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void shiftUp(int index) {
/* 112 */     int[] values = this.values;
/* 113 */     int value = values[index];
/* 114 */     int current = index;
/* 115 */     while (current > 0) {
/* 116 */       int parent = (current + 1 >> 1) - 1;
/* 117 */       if (values[parent] > value) {
/* 118 */         swap(parent, current);
/* 119 */         current = parent;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void shiftDown(int index) {
/* 131 */     int[] values = this.values;
/* 132 */     int half = this.size >> 1;
/* 133 */     int current = index;
/* 134 */     while (current < half) {
/* 135 */       int right = current + 1 << 1;
/* 136 */       int left = right - 1;
/* 137 */       if (right < this.size && values[right] < values[left]) {
/* 138 */         if (values[right] < values[current]) {
/* 139 */           swap(right, current);
/* 140 */           current = right; continue;
/*     */         }  return;
/*     */       } 
/* 143 */       if (values[left] < values[current]) {
/* 144 */         swap(left, current);
/* 145 */         current = left;
/*     */         continue;
/*     */       } 
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void swap(int a, int b) {
/* 157 */     int[] values = this.values;
/* 158 */     int[] index = this.index;
/* 159 */     int[] handles = this.handles;
/* 160 */     int t = values[a];
/* 161 */     values[a] = values[b];
/* 162 */     values[b] = t;
/* 163 */     t = index[a];
/* 164 */     index[a] = index[b];
/* 165 */     index[b] = t;
/* 166 */     handles[index[a]] = a;
/* 167 */     handles[index[b]] = b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void ensure(int atLeast) {
/* 174 */     int capacity = this.values.length;
/* 175 */     if (atLeast <= capacity)
/* 176 */       return;  int newCapacity = capacity * 2;
/* 177 */     int[] newValues = new int[newCapacity];
/* 178 */     int[] newIndex = new int[newCapacity];
/* 179 */     ArraysKt.copyInto$default(this.values, newValues, 0, 0, 0, 14, null);
/* 180 */     ArraysKt.copyInto$default(this.index, newIndex, 0, 0, 0, 14, null);
/* 181 */     this.values = newValues;
/* 182 */     this.index = newIndex;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final int allocateHandle() {
/* 189 */     int capacity = this.handles.length;
/* 190 */     if (this.firstFreeHandle >= capacity) {
/* 191 */       byte b; int i, arrayOfInt1[]; for (b = 0, i = capacity * 2, arrayOfInt1 = new int[i]; b < i; ) { byte b1 = b; arrayOfInt1[b1] = b1 + 1; b++; }  int[] newHandles = arrayOfInt1;
/* 192 */       ArraysKt.copyInto$default(this.handles, newHandles, 0, 0, 0, 14, null);
/* 193 */       this.handles = newHandles;
/*     */     } 
/* 195 */     int handle = this.firstFreeHandle;
/* 196 */     this.firstFreeHandle = this.handles[this.firstFreeHandle];
/* 197 */     return handle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void freeHandle(int handle) {
/* 205 */     this.handles[handle] = this.firstFreeHandle;
/* 206 */     this.firstFreeHandle = handle;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotDoubleIndexHeap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */