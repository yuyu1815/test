/*     */ package androidx.compose.runtime.collection;
/*     */ 
/*     */ import androidx.collection.MutableScatterMap;
/*     */ import androidx.collection.MutableScatterSet;
/*     */ import androidx.collection.ScatterMap;
/*     */ import androidx.collection.ScatterMapKt;
/*     */ import androidx.collection.ScatterSet;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020$\n\002\020\"\n\002\b\017\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002B\005¢\006\002\020\004J\033\020\r\032\0020\0162\006\020\017\032\0028\0002\006\020\020\032\0028\001¢\006\002\020\021J<\020\022\032\0020\0232\006\020\017\032\0028\0002!\020\024\032\035\022\023\022\0218\001¢\006\f\b\026\022\b\b\027\022\004\b\b(\020\022\004\022\0020\0230\025H\bø\001\000¢\006\002\020\030J\030\020\031\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0330\032J\006\020\034\032\0020\016J\026\020\035\032\0020\0232\006\020\036\032\0028\000H\002¢\006\002\020\037J<\020 \032\0020\0162\006\020\017\032\0028\0002!\020\024\032\035\022\023\022\0218\001¢\006\f\b\026\022\b\b\027\022\004\b\b(\020\022\004\022\0020\0160\025H\bø\001\000¢\006\002\020!J\033\020\"\032\0020\0232\006\020\017\032\0028\0002\006\020\020\032\0028\001¢\006\002\020#J\023\020$\032\0020\0162\006\020\020\032\0028\001¢\006\002\020%J1\020&\032\0020\0162#\b\004\020'\032\035\022\023\022\0218\001¢\006\f\b\026\022\b\b\027\022\004\b\b(\020\022\004\022\0020\0230\025H\bø\001\000J\033\020(\032\0020\0162\006\020\017\032\0028\0002\006\020)\032\0028\001¢\006\002\020\021R\035\020\005\032\016\022\004\022\0020\002\022\004\022\0020\0020\006¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\f\002\007\n\005\b20\001¨\006*"}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "Key", "", "Scope", "()V", "map", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "size", "", "getSize", "()I", "add", "", "key", "scope", "(Ljava/lang/Object;Ljava/lang/Object;)V", "anyScopeOf", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "asMap", "", "", "clear", "contains", "element", "(Ljava/lang/Object;)Z", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeScope", "(Ljava/lang/Object;)V", "removeScopeIf", "predicate", "set", "value", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,194:1\n77#1,5:240\n85#1,4:272\n874#2,18:195\n1047#2:276\n1049#2:290\n1050#2,3:318\n1053#2:327\n1047#2:328\n1049#2,4:342\n1053#2:352\n267#3,4:213\n237#3,7:217\n248#3,3:225\n251#3,2:229\n272#3,2:231\n254#3,6:233\n274#3:239\n267#3,4:245\n237#3,7:249\n248#3,3:257\n251#3,2:261\n272#3,2:263\n254#3,6:265\n274#3:271\n237#3,7:293\n248#3,3:301\n251#3,2:305\n254#3,6:311\n1810#4:224\n1672#4:228\n1810#4:256\n1672#4:260\n1810#4:283\n1672#4:287\n1810#4:300\n1672#4:304\n1810#4:335\n1672#4:339\n1810#4:363\n1672#4:367\n363#5,6:277\n373#5,3:284\n376#5,2:288\n379#5,6:321\n363#5,6:329\n373#5,3:336\n376#5,2:340\n379#5,6:346\n391#5,4:353\n363#5,6:357\n373#5,3:364\n376#5,2:368\n396#5,2:370\n379#5,6:372\n398#5:378\n842#6,2:291\n845#6,4:307\n849#6:317\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n91#1:240,5\n91#1:272,4\n37#1:195,18\n138#1:276\n138#1:290\n138#1:318,3\n138#1:327\n159#1:328\n159#1:342,4\n159#1:352\n81#1:213,4\n81#1:217,7\n81#1:225,3\n81#1:229,2\n81#1:231,2\n81#1:233,6\n81#1:239\n91#1:245,4\n91#1:249,7\n91#1:257,3\n91#1:261,2\n91#1:263,2\n91#1:265,6\n91#1:271\n143#1:293,7\n143#1:301,3\n143#1:305,2\n143#1:311,6\n81#1:224\n81#1:228\n91#1:256\n91#1:260\n138#1:283\n138#1:287\n143#1:300\n143#1:304\n159#1:335\n159#1:339\n180#1:363\n180#1:367\n138#1:277,6\n138#1:284,3\n138#1:288,2\n138#1:321,6\n159#1:329,6\n159#1:336,3\n159#1:340,2\n159#1:346,6\n180#1:353,4\n180#1:357,6\n180#1:364,3\n180#1:368,2\n180#1:370,2\n180#1:372,6\n180#1:378\n143#1:291,2\n143#1:307,4\n143#1:317\n*E\n"})
/*     */ public final class ScopeMap<Key, Scope>
/*     */ {
/*     */   @NotNull
/*  26 */   private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf(); public static final int $stable = 8; @NotNull public final MutableScatterMap<Object, Object> getMap() { return this.map; }
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getSize() {
/*  31 */     return this.map.getSize();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void add(@NotNull Object key, @NotNull Object scope) {
/*  37 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(scope, "scope"); MutableScatterMap<Object, Object> this_$iv = this.map; int $i$f$compute = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     int index$iv = this_$iv.findInsertIndex(key);
/* 196 */     boolean inserting$iv = (index$iv < 0);
/*     */ 
/*     */     
/* 199 */     Object value = 
/*     */       
/* 201 */       inserting$iv ? null : this_$iv.values[index$iv]; int $i$a$-compute-ScopeMap$add$1 = 0; Object object1 = value; Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>"); ((MutableScatterSet)value).add(scope); MutableScatterSet set = new MutableScatterSet(0, 1, null); Intrinsics.checkNotNull(value, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
/*     */     set.add(value);
/*     */     set.add(scope);
/*     */     Object computedValue$iv = (object1 == null) ? scope : ((object1 instanceof MutableScatterSet) ? value : ((value != scope) ? set : value));
/* 205 */     if (inserting$iv) {
/* 206 */       int insertionIndex$iv = index$iv ^ 0xFFFFFFFF;
/* 207 */       this_$iv.keys[insertionIndex$iv] = key;
/* 208 */       this_$iv.values[insertionIndex$iv] = computedValue$iv;
/*     */     } else {
/* 210 */       this_$iv.values[index$iv] = computedValue$iv;
/*     */     } 
/*     */   } public final void set(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); this.map.set(key, value); } public final boolean contains(@NotNull Object element) { Intrinsics.checkNotNullParameter(element, "element"); return this.map.containsKey(element); }
/*     */   public final void forEachScopeOf(@NotNull Object key, @NotNull Function1 block) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachScopeOf = 0; Object value = getMap().get(key); if (value != null) {
/* 214 */       ScatterSet this_$iv = (ScatterSet)value; int $i$f$forEach = 0; Object[] k$iv = this_$iv.elements;
/*     */       
/* 216 */       ScatterSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*     */       
/* 218 */       long[] m$iv$iv = this_$iv$iv.metadata;
/* 219 */       int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */       
/* 221 */       int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 222 */           long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 223 */           long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 224 */           if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 225 */           { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 226 */             for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
/* 227 */               long value$iv$iv$iv = slot$iv$iv & 0xFFL; int $i$f$isFull = 0;
/* 228 */               if ((value$iv$iv$iv < 128L)) {
/* 229 */                 int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
/* 230 */                 int index$iv = index$iv$iv, $i$a$-forEachIndex-ScatterSet$forEach$2$iv = 0;
/* 231 */                 block.invoke(k$iv[index$iv]);
/*     */               } 
/* 233 */               slot$iv$iv >>= 8L;
/*     */             } 
/* 235 */             if (bitCount$iv$iv == 8)
/*     */               continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 243
/*     */         }  }
/*     */       else {  }
/*     */        block.invoke(value);
/* 240 */     }  } public final boolean anyScopeOf(@NotNull Object key, @NotNull Function1 block) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$anyScopeOf = 0; ScopeMap this_$iv = this; int $i$f$forEachScopeOf = 0; Object value$iv = this_$iv.getMap().get(key);
/* 241 */     if (value$iv != null)
/* 242 */       if (value$iv instanceof MutableScatterSet)
/*     */       
/* 244 */       { ScatterSet this_$iv$iv = (ScatterSet)value$iv; int $i$f$forEach = 0;
/*     */         
/* 246 */         Object[] k$iv$iv = this_$iv$iv.elements;
/*     */         
/* 248 */         ScatterSet this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndex = 0;
/*     */         
/* 250 */         long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
/* 251 */         int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
/*     */         
/* 253 */         int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) {
/* 254 */             long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
/* 255 */             long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 256 */             if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 257 */             { int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 258 */               for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 267 */               if (bitCount$iv$iv$iv == 8)
/*     */                 continue;  break; }  continue; if (i$iv$iv$iv != lastIndex$iv$iv$iv) { i$iv$iv$iv++; continue; }  // Byte code: goto -> 269
/*     */           }  }
/*     */         else {  }
/*     */          }
/* 272 */       else { Object it = value$iv; int $i$a$-forEachScopeOf-ScopeMap$anyScopeOf$1 = 0; if (((Boolean)block.invoke(it)).booleanValue())
/*     */           return true;  }
/*     */         return false; }
/*     */   public final void clear() { this.map.clear(); } public final void removeScopeIf(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeScopeIf = 0; MutableScatterMap<Object, Object> this_$iv = getMap(); int $i$f$removeIf = 0;
/* 276 */     ScatterMap this_$iv$iv = (ScatterMap)this_$iv; int $i$f$forEachIndexed = 0;
/* 277 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 278 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */     
/* 280 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true)
/* 281 */       { long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 282 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 283 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 284 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 285 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 323 */           if (bitCount$iv$iv == 8)
/*     */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }  // Byte code: goto -> 491 }  } else {  }  }
/*     */   public final boolean remove(@NotNull Object key, @NotNull Object scope) { Object value; Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(scope, "scope"); if (this.map.get(key) == null) { this.map.get(key); return false; }
/*     */      Object object1 = value; if (object1 instanceof MutableScatterSet) { MutableScatterSet set = (MutableScatterSet)value; boolean removed = set.remove(scope); if (removed && set.isEmpty())
/*     */         this.map.remove(key);  return removed; }
/* 328 */      this.map.remove(key); return Intrinsics.areEqual(object1, scope); } public final void removeScope(@NotNull Object scope) { Intrinsics.checkNotNullParameter(scope, "scope"); MutableScatterMap<Object, Object> this_$iv = this.map; int $i$f$removeIf = 0; ScatterMap this_$iv$iv = (ScatterMap)this_$iv; int $i$f$forEachIndexed = 0;
/* 329 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 330 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */     
/* 332 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 333 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 334 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 335 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/* 336 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 337 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 348 */           if (bitCount$iv$iv == 8)
/*     */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*     */          // Byte code: goto -> 266
/*     */       }  }
/*     */     else {  }
/* 353 */      } @NotNull public final Map<Key, Set<Scope>> asMap() { HashMap<Object, Object> result = new HashMap<>(); ScatterMap this_$iv = (ScatterMap)this.map; int $i$f$forEach = 0; Object[] k$iv = this_$iv.keys;
/* 354 */     Object[] v$iv = this_$iv.values;
/*     */     
/* 356 */     ScatterMap this_$iv$iv = this_$iv; int $i$f$forEachIndexed = 0;
/* 357 */     long[] m$iv$iv = this_$iv$iv.metadata;
/* 358 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*     */     
/* 360 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/* 361 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/* 362 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/* 363 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 364 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 365 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 374 */           if (bitCount$iv$iv == 8)
/*     */             continue; 
/*     */           break;
/*     */         } 
/*     */         continue;
/*     */         if (i$iv$iv != lastIndex$iv$iv) {
/*     */           i$iv$iv++;
/*     */           continue;
/*     */         } 
/*     */         // Byte code: goto -> 305
/*     */       }  }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return (Map)result; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\ScopeMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */