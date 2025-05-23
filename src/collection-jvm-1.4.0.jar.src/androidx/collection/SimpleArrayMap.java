/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Arrays;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.JvmOverloads;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\021\n\002\b\002\n\002\020\025\n\002\b\002\n\002\020\002\n\000\n\002\020\013\n\002\b)\n\002\020\016\n\002\b\002\b\026\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B!\b\026\022\030\020\004\032\024\022\006\b\001\022\0028\000\022\006\b\001\022\0028\001\030\0010\000¢\006\002\020\005B\021\b\007\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\b\020\017\032\0020\020H\026J\025\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\024J\025\020\025\032\0020\0222\006\020\026\032\0028\001H\026¢\006\002\020\024J\020\020\027\032\0020\0202\006\020\030\032\0020\007H\026J\023\020\031\032\0020\0222\b\020\032\032\004\030\0010\003H\002J\030\020\033\032\004\030\0018\0012\006\020\023\032\0028\000H\002¢\006\002\020\034J\037\020\035\032\0028\0012\b\020\023\032\004\030\0010\0032\006\020\036\032\0028\001H\026¢\006\002\020\037J,\020 \032\002H!\"\n\b\002\020!*\004\030\0018\0012\b\020\023\032\004\030\0010\0032\006\020\036\032\002H!H\b¢\006\002\020\037J\b\020\"\032\0020\007H\026J\035\020#\032\0020\0072\006\020\023\032\0028\0002\006\020$\032\0020\007H\002¢\006\002\020%J\025\020&\032\0020\0072\006\020\023\032\0028\000H\026¢\006\002\020'J\b\020(\032\0020\007H\002J\027\020)\032\0020\0072\006\020\026\032\0028\001H\001¢\006\004\b*\020'J\b\020+\032\0020\022H\026J\025\020,\032\0028\0002\006\020-\032\0020\007H\026¢\006\002\020.J\037\020/\032\004\030\0018\0012\006\020\023\032\0028\0002\006\020\026\032\0028\001H\026¢\006\002\020\037J \0200\032\0020\0202\026\020\004\032\022\022\006\b\001\022\0028\000\022\006\b\001\022\0028\0010\000H\026J\037\0201\032\004\030\0018\0012\006\020\023\032\0028\0002\006\020\026\032\0028\001H\026¢\006\002\020\037J\027\0202\032\004\030\0018\0012\006\020\023\032\0028\000H\026¢\006\002\020\034J\035\0202\032\0020\0222\006\020\023\032\0028\0002\006\020\026\032\0028\001H\026¢\006\002\0203J\025\0204\032\0028\0012\006\020-\032\0020\007H\026¢\006\002\020.J\037\0205\032\004\030\0018\0012\006\020\023\032\0028\0002\006\020\026\032\0028\001H\026¢\006\002\020\037J%\0205\032\0020\0222\006\020\023\032\0028\0002\006\0206\032\0028\0012\006\0207\032\0028\001H\026¢\006\002\0208J\035\0209\032\0028\0012\006\020-\032\0020\0072\006\020\026\032\0028\001H\026¢\006\002\020:J\b\020\016\032\0020\007H\026J\b\020;\032\0020<H\026J\025\020=\032\0028\0012\006\020-\032\0020\007H\026¢\006\002\020.R\030\020\t\032\n\022\006\022\004\030\0010\0030\nX\016¢\006\004\n\002\020\013R\016\020\f\032\0020\rX\016¢\006\002\n\000R\016\020\016\032\0020\007X\016¢\006\002\n\000¨\006>"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "map", "(Landroidx/collection/SimpleArrayMap;)V", "capacity", "", "(I)V", "array", "", "[Ljava/lang/Object;", "hashes", "", "size", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefaultInternal", "T", "hashCode", "indexOf", "hash", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "indexOfNull", "indexOfValue", "__restricted$indexOfValue", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
/*     */ public class SimpleArrayMap<K, V>
/*     */ {
/*     */   @NotNull
/*     */   private int[] hashes;
/*     */   @NotNull
/*     */   private Object[] array;
/*     */   private int size;
/*     */   
/*     */   @JvmOverloads
/*     */   public SimpleArrayMap(int capacity) {
/*  64 */     this.hashes = 
/*  65 */       (capacity == 0) ? ContainerHelpersKt.EMPTY_INTS : 
/*  66 */       new int[capacity];
/*     */ 
/*     */     
/*  69 */     this.array = 
/*  70 */       (capacity == 0) ? ContainerHelpersKt.EMPTY_OBJECTS : 
/*  71 */       new Object[capacity << 1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SimpleArrayMap(@Nullable SimpleArrayMap<? extends K, ? extends V> map) {
/*  79 */     this(0, 1, null);
/*  80 */     if (map != null) {
/*  81 */       putAll(map);
/*     */     }
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
/*     */   private final int indexOf(Object key, int hash) {
/*  94 */     int n = this.size;
/*     */ 
/*     */     
/*  97 */     if (n == 0) {
/*  98 */       return -1;
/*     */     }
/* 100 */     int index = ContainerHelpersKt.binarySearch(this.hashes, n, hash);
/*     */ 
/*     */     
/* 103 */     if (index < 0) {
/* 104 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 108 */     if (Intrinsics.areEqual(key, this.array[index << 1])) {
/* 109 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 113 */     int end = index + 1;
/* 114 */     while (end < n && this.hashes[end] == hash) {
/* 115 */       if (Intrinsics.areEqual(key, this.array[end << 1])) return end; 
/* 116 */       end++;
/*     */     } 
/*     */ 
/*     */     
/* 120 */     int i = index - 1;
/* 121 */     while (i >= 0 && this.hashes[i] == hash) {
/* 122 */       if (Intrinsics.areEqual(key, this.array[i << 1])) {
/* 123 */         return i;
/*     */       }
/* 125 */       i--;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     return end ^ 0xFFFFFFFF;
/*     */   }
/*     */   
/*     */   private final int indexOfNull() {
/* 136 */     int n = this.size;
/*     */ 
/*     */     
/* 139 */     if (n == 0) {
/* 140 */       return -1;
/*     */     }
/* 142 */     int index = ContainerHelpersKt.binarySearch(this.hashes, n, 0);
/*     */ 
/*     */     
/* 145 */     if (index < 0) {
/* 146 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 150 */     if (this.array[index << 1] == null) {
/* 151 */       return index;
/*     */     }
/*     */ 
/*     */     
/* 155 */     int end = index + 1;
/* 156 */     while (end < n && this.hashes[end] == 0) {
/* 157 */       if (this.array[end << 1] == null) return end; 
/* 158 */       end++;
/*     */     } 
/*     */ 
/*     */     
/* 162 */     int i = index - 1;
/* 163 */     while (i >= 0 && this.hashes[i] == 0) {
/* 164 */       if (this.array[i << 1] == null) return i; 
/* 165 */       i--;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     return end ^ 0xFFFFFFFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 182 */     if (this.size > 0) {
/* 183 */       this.hashes = ContainerHelpersKt.EMPTY_INTS;
/* 184 */       this.array = ContainerHelpersKt.EMPTY_OBJECTS;
/* 185 */       this.size = 0;
/*     */     } 
/*     */     
/* 188 */     if (this.size > 0) {
/* 189 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void ensureCapacity(int minimumCapacity) {
/* 200 */     int osize = this.size;
/* 201 */     if (this.hashes.length < minimumCapacity) {
/* 202 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.hashes, minimumCapacity), "copyOf(this, newSize)"); this.hashes = Arrays.copyOf(this.hashes, minimumCapacity);
/* 203 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.array, minimumCapacity * 2), "copyOf(this, newSize)"); this.array = Arrays.copyOf(this.array, minimumCapacity * 2);
/*     */     } 
/* 205 */     if (this.size != osize) {
/* 206 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsKey(Object key) {
/* 217 */     return (indexOfKey((K)key) >= 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int indexOfKey(Object key) {
/* 226 */     return 
/* 227 */       (key == null) ? indexOfNull() : 
/* 228 */       indexOf((K)key, key.hashCode());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmName(name = "__restricted$indexOfValue")
/*     */   public final int __restricted$indexOfValue(Object value) {
/* 236 */     int n = this.size * 2;
/* 237 */     Object[] array = this.array;
/* 238 */     if (value == null) {
/* 239 */       int i = 1;
/* 240 */       while (i < n) {
/* 241 */         if (array[i] == null)
/* 242 */           return i >> 1;  i += 2;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 247 */       int i = 1;
/* 248 */       while (i < n) {
/* 249 */         if (Intrinsics.areEqual(value, array[i]))
/* 250 */           return i >> 1;  i += 2;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 255 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsValue(Object value) {
/* 266 */     return (__restricted$indexOfValue((V)value) >= 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public V get(Object key)
/*     */   {
/* 276 */     SimpleArrayMap simpleArrayMap = this; Object defaultValue$iv = null; int $i$f$getOrDefaultInternal = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 770 */     int index$iv = simpleArrayMap.indexOfKey(key);
/*     */ 
/*     */     
/* 773 */     return (index$iv >= 0) ? (V)simpleArrayMap.array[(index$iv << 1) + 1] : 
/* 774 */       (V)defaultValue$iv; } public V getOrDefault(@Nullable Object key, Object defaultValue) { SimpleArrayMap this_$iv = this; int $i$f$getOrDefaultInternal = 0;
/* 775 */     int index$iv = this_$iv.indexOfKey(key);
/*     */ 
/*     */     
/* 778 */     return (index$iv >= 0) ? (V)this_$iv.array[(index$iv << 1) + 1] : 
/* 779 */       (V)defaultValue; } @Nullable public V put(Object key, Object value) { int osize = this.size; int hash = (key != null) ? key.hashCode() : 0; Object it = key;
/* 780 */     int $i$a$-let-SimpleArrayMap$put$index$1 = 0;
/*     */     int index = (key != null) ? indexOf((K)it, hash) : indexOfNull();
/*     */     if (index >= 0) {
/*     */       index = (index << 1) + 1;
/*     */       Object old = this.array[index];
/*     */       this.array[index] = value;
/*     */       return (V)old;
/*     */     } 
/*     */     index ^= 0xFFFFFFFF;
/*     */     if (osize >= this.hashes.length) {
/*     */       int n = (osize >= 8) ? (osize + (osize >> 1)) : ((osize >= 4) ? 8 : 4);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.hashes, n), "copyOf(this, newSize)");
/*     */       this.hashes = Arrays.copyOf(this.hashes, n);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.array, n << 1), "copyOf(this, newSize)");
/*     */       this.array = Arrays.copyOf(this.array, n << 1);
/*     */       if (osize != this.size)
/*     */         throw new ConcurrentModificationException(); 
/*     */     } 
/*     */     if (index < osize) {
/*     */       ArraysKt.copyInto(this.hashes, this.hashes, index + 1, index, osize);
/*     */       ArraysKt.copyInto(this.array, this.array, index + 1 << 1, index << 1, this.size << 1);
/*     */     } 
/*     */     if (osize != this.size || index >= this.hashes.length)
/*     */       throw new ConcurrentModificationException(); 
/*     */     this.hashes[index] = hash;
/*     */     this.array[index << 1] = key;
/*     */     this.array[(index << 1) + 1] = value;
/*     */     int i = this.size;
/*     */     this.size = i + 1;
/*     */     return null; }
/*     */ 
/*     */   
/*     */   private final <T extends V> T getOrDefaultInternal(Object key, Object defaultValue) {
/*     */     int $i$f$getOrDefaultInternal = 0, index = indexOfKey((K)key);
/*     */     return (index >= 0) ? (T)this.array[(index << 1) + 1] : (T)defaultValue;
/*     */   }
/*     */   
/*     */   public K keyAt(int index) {
/*     */     if (!((0 <= index) ? ((index < this.size) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-SimpleArrayMap$keyAt$1 = 0;
/*     */       String str = "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return (K)this.array[index << 1];
/*     */   }
/*     */   
/*     */   public V valueAt(int index) {
/*     */     if (!((0 <= index) ? ((index < this.size) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-SimpleArrayMap$valueAt$1 = 0;
/*     */       String str = "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return (V)this.array[(index << 1) + 1];
/*     */   }
/*     */   
/*     */   public V setValueAt(int index, Object value) {
/*     */     if (!((0 <= index) ? ((index < this.size) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-SimpleArrayMap$setValueAt$1 = 0;
/*     */       String str = "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     int indexInArray = (index << 1) + 1;
/*     */     Object old = this.array[indexInArray];
/*     */     this.array[indexInArray] = value;
/*     */     return (V)old;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return (this.size <= 0);
/*     */   }
/*     */   
/*     */   public void putAll(@NotNull SimpleArrayMap map) {
/*     */     Intrinsics.checkNotNullParameter(map, "map");
/*     */     int n = map.size;
/*     */     ensureCapacity(this.size + n);
/*     */     if (this.size == 0) {
/*     */       if (n > 0) {
/*     */         ArraysKt.copyInto(map.hashes, this.hashes, 0, 0, n);
/*     */         ArraysKt.copyInto(map.array, this.array, 0, 0, n << 1);
/*     */         this.size = n;
/*     */       } 
/*     */     } else {
/*     */       for (int i = 0; i < n; i++)
/*     */         put((K)map.keyAt(i), (V)map.valueAt(i)); 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V putIfAbsent(Object key, Object value) {
/*     */     Object mapValue = get((K)key);
/*     */     if (mapValue == null)
/*     */       mapValue = put((K)key, (V)value); 
/*     */     return (V)mapValue;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V remove(Object key) {
/*     */     int index = indexOfKey((K)key);
/*     */     return (index >= 0) ? removeAt(index) : null;
/*     */   }
/*     */   
/*     */   public boolean remove(Object key, Object value) {
/*     */     int index = indexOfKey((K)key);
/*     */     if (index >= 0) {
/*     */       Object mapValue = valueAt(index);
/*     */       if (Intrinsics.areEqual(value, mapValue)) {
/*     */         removeAt(index);
/*     */         return true;
/*     */       } 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public V removeAt(int index) {
/*     */     if (!((0 <= index) ? ((index < this.size) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-SimpleArrayMap$removeAt$1 = 0;
/*     */       String str = "Expected index to be within 0..size()-1, but was " + index;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     Object old = this.array[(index << 1) + 1];
/*     */     int osize = this.size;
/*     */     if (osize <= 1) {
/*     */       clear();
/*     */     } else {
/*     */       int nsize = osize - 1;
/*     */       if (this.hashes.length > 8 && osize < this.hashes.length / 3) {
/*     */         int n = (osize > 8) ? (osize + (osize >> 1)) : 8;
/*     */         int[] ohashes = this.hashes;
/*     */         Object[] oarray = this.array;
/*     */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.hashes, n), "copyOf(this, newSize)");
/*     */         this.hashes = Arrays.copyOf(this.hashes, n);
/*     */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.array, n << 1), "copyOf(this, newSize)");
/*     */         this.array = Arrays.copyOf(this.array, n << 1);
/*     */         if (osize != this.size)
/*     */           throw new ConcurrentModificationException(); 
/*     */         if (index > 0) {
/*     */           ArraysKt.copyInto(ohashes, this.hashes, 0, 0, index);
/*     */           ArraysKt.copyInto(oarray, this.array, 0, 0, index << 1);
/*     */         } 
/*     */         if (index < nsize) {
/*     */           ArraysKt.copyInto(ohashes, this.hashes, index, index + 1, nsize + 1);
/*     */           ArraysKt.copyInto(oarray, this.array, index << 1, index + 1 << 1, nsize + 1 << 1);
/*     */         } 
/*     */       } else {
/*     */         if (index < nsize) {
/*     */           ArraysKt.copyInto(this.hashes, this.hashes, index, index + 1, nsize + 1);
/*     */           ArraysKt.copyInto(this.array, this.array, index << 1, index + 1 << 1, nsize + 1 << 1);
/*     */         } 
/*     */         this.array[nsize << 1] = null;
/*     */         this.array[(nsize << 1) + 1] = null;
/*     */       } 
/*     */       if (osize != this.size)
/*     */         throw new ConcurrentModificationException(); 
/*     */       this.size = nsize;
/*     */     } 
/*     */     return (V)old;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public V replace(Object key, Object value) {
/*     */     int index = indexOfKey((K)key);
/*     */     return (index >= 0) ? setValueAt(index, (V)value) : null;
/*     */   }
/*     */   
/*     */   public boolean replace(Object key, Object oldValue, Object newValue) {
/*     */     int index = indexOfKey((K)key);
/*     */     if (index >= 0) {
/*     */       Object mapValue = valueAt(index);
/*     */       if (Intrinsics.areEqual(oldValue, mapValue)) {
/*     */         setValueAt(index, (V)newValue);
/*     */         return true;
/*     */       } 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public int size() {
/*     */     return this.size;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     try {
/*     */       if (other instanceof SimpleArrayMap) {
/*     */         if (size() != ((SimpleArrayMap)other).size())
/*     */           return false; 
/*     */         SimpleArrayMap otherSimpleArrayMap = (SimpleArrayMap)other;
/*     */         for (int i = 0, j = this.size; i < j; i++) {
/*     */           Object key = keyAt(i);
/*     */           Object mine = valueAt(i);
/*     */           Object theirs = otherSimpleArrayMap.get(key);
/*     */           if (mine == null) {
/*     */             if (theirs != null || !otherSimpleArrayMap.containsKey(key))
/*     */               return false; 
/*     */           } else if (!Intrinsics.areEqual(mine, theirs)) {
/*     */             return false;
/*     */           } 
/*     */         } 
/*     */         return true;
/*     */       } 
/*     */       if (other instanceof Map) {
/*     */         if (size() != ((Map)other).size())
/*     */           return false; 
/*     */         for (int i = 0, j = this.size; i < j; i++) {
/*     */           Object key = keyAt(i);
/*     */           Object mine = valueAt(i);
/*     */           Object theirs = ((Map)other).get(key);
/*     */           if (mine == null) {
/*     */             if (theirs != null || !((Map)other).containsKey(key))
/*     */               return false; 
/*     */           } else if (!Intrinsics.areEqual(mine, theirs)) {
/*     */             return false;
/*     */           } 
/*     */         } 
/*     */         return true;
/*     */       } 
/*     */     } catch (NullPointerException nullPointerException) {
/*     */     
/*     */     } catch (ClassCastException classCastException) {}
/*     */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield hashes : [I
/*     */     //   4: astore_1
/*     */     //   5: aload_0
/*     */     //   6: getfield array : [Ljava/lang/Object;
/*     */     //   9: astore_2
/*     */     //   10: iconst_0
/*     */     //   11: istore_3
/*     */     //   12: iconst_0
/*     */     //   13: istore #4
/*     */     //   15: iconst_1
/*     */     //   16: istore #5
/*     */     //   18: aload_0
/*     */     //   19: getfield size : I
/*     */     //   22: istore #6
/*     */     //   24: iload #4
/*     */     //   26: iload #6
/*     */     //   28: if_icmpge -> 69
/*     */     //   31: aload_2
/*     */     //   32: iload #5
/*     */     //   34: aaload
/*     */     //   35: astore #7
/*     */     //   37: iload_3
/*     */     //   38: aload_1
/*     */     //   39: iload #4
/*     */     //   41: iaload
/*     */     //   42: aload #7
/*     */     //   44: dup
/*     */     //   45: ifnull -> 54
/*     */     //   48: invokevirtual hashCode : ()I
/*     */     //   51: goto -> 56
/*     */     //   54: pop
/*     */     //   55: iconst_0
/*     */     //   56: ixor
/*     */     //   57: iadd
/*     */     //   58: istore_3
/*     */     //   59: iinc #4, 1
/*     */     //   62: iinc #5, 2
/*     */     //   65: nop
/*     */     //   66: goto -> 24
/*     */     //   69: iload_3
/*     */     //   70: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #718	-> 0
/*     */     //   #719	-> 5
/*     */     //   #720	-> 10
/*     */     //   #721	-> 12
/*     */     //   #722	-> 15
/*     */     //   #723	-> 18
/*     */     //   #724	-> 24
/*     */     //   #725	-> 31
/*     */     //   #726	-> 37
/*     */     //   #727	-> 59
/*     */     //   #728	-> 65
/*     */     //   #730	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   37	29	7	value	Ljava/lang/Object;
/*     */     //   5	66	1	hashes	[I
/*     */     //   10	61	2	array	[Ljava/lang/Object;
/*     */     //   12	59	3	result	I
/*     */     //   15	56	4	i	I
/*     */     //   18	53	5	v	I
/*     */     //   24	47	6	s	I
/*     */     //   0	71	0	this	Landroidx/collection/SimpleArrayMap;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     if (isEmpty())
/*     */       return "{}"; 
/*     */     int j = this.size * 28;
/*     */     StringBuilder stringBuilder1 = new StringBuilder(j), $this$toString_u24lambda_u245 = stringBuilder1;
/*     */     int $i$a$-buildString-SimpleArrayMap$toString$1 = 0;
/*     */     $this$toString_u24lambda_u245.append('{');
/*     */     for (int i = 0, k = this.size; i < k; i++) {
/*     */       if (i > 0)
/*     */         $this$toString_u24lambda_u245.append(", "); 
/*     */       Object key = keyAt(i);
/*     */       if (key != $this$toString_u24lambda_u245) {
/*     */         $this$toString_u24lambda_u245.append(key);
/*     */       } else {
/*     */         $this$toString_u24lambda_u245.append("(this Map)");
/*     */       } 
/*     */       $this$toString_u24lambda_u245.append('=');
/*     */       Object value = valueAt(i);
/*     */       if (value != $this$toString_u24lambda_u245) {
/*     */         $this$toString_u24lambda_u245.append(value);
/*     */       } else {
/*     */         $this$toString_u24lambda_u245.append("(this Map)");
/*     */       } 
/*     */     } 
/*     */     $this$toString_u24lambda_u245.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public SimpleArrayMap() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\SimpleArrayMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */