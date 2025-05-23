/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000R\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\r\n\002\b\002\n\002\020\013\n\002\020 \n\002\b\003\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\006\n\002\020$\n\002\b\f\n\002\020\016\n\002\b\004\n\002\020\"\n\000\0329\020\000\032\0020\001\"\004\b\000\020\002*\0060\003j\002`\0042\006\020\005\032\002H\0022\024\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007H\002¢\006\002\020\t\032;\020\n\032\0020\013\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032;\020\016\032\0020\013\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\r\032\016\022\004\022\002H\002\022\004\022\0020\0130\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032V\020\017\032\b\022\004\022\002H\0020\f\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2'\020\r\032#\022\023\022\0210\021¢\006\f\b\022\022\b\b\023\022\004\b\b(\024\022\004\022\002H\002\022\004\022\0020\0130\020H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032;\020\025\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\022\020\026\032\016\022\004\022\002H\002\022\004\022\0020\0010\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032A\020\027\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\030\020\026\032\024\022\004\022\0020\021\022\004\022\002H\002\022\004\022\0020\0010\020H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032S\020\030\032\024\022\004\022\002H\032\022\n\022\b\022\004\022\002H\0020\f0\031\"\004\b\000\020\002\"\004\b\001\020\032*\b\022\004\022\002H\0020\f2\022\020\033\032\016\022\004\022\002H\002\022\004\022\002H\0320\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032}\020\034\032\002H\035\"\004\b\000\020\002\"\f\b\001\020\035*\0060\003j\002`\004*\b\022\004\022\002H\0020\f2\006\020\036\032\002H\0352\b\b\002\020\037\032\0020\b2\b\b\002\020 \032\0020\b2\b\b\002\020!\032\0020\b2\b\b\002\020\"\032\0020\0212\b\b\002\020#\032\0020\b2\026\b\002\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007H\002¢\006\002\020$\032b\020%\032\0020&\"\004\b\000\020\002*\b\022\004\022\002H\0020\f2\b\b\002\020\037\032\0020\b2\b\b\002\020 \032\0020\b2\b\b\002\020!\032\0020\b2\b\b\002\020\"\032\0020\0212\b\b\002\020#\032\0020\b2\026\b\002\020\006\032\020\022\004\022\002H\002\022\004\022\0020\b\030\0010\007H\000\032G\020'\032\b\022\004\022\002H(0\f\"\004\b\000\020\002\"\004\b\001\020(*\b\022\004\022\002H\0020\f2\022\020\006\032\016\022\004\022\002H\002\022\004\022\002H(0\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032I\020)\032\b\022\004\022\002H(0\f\"\004\b\000\020\002\"\004\b\001\020(*\b\022\004\022\002H\0020\f2\024\020\006\032\020\022\004\022\002H\002\022\006\022\004\030\001H(0\007H\bø\001\000\002\b\n\006\b\001\022\002\020\001\032\036\020*\032\b\022\004\022\002H\0020+\"\004\b\000\020\002*\b\022\004\022\002H\0020\fH\000\002\007\n\005\b20\001¨\006,"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastFilterIndexed", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "fastForEach", "action", "fastForEachIndexed", "fastGroupBy", "", "K", "keySelector", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMap", "R", "fastMapNotNull", "fastToSet", "", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n372#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
/*     */ public final class ListUtilsKt
/*     */ {
/*     */   public static final <T> void fastForEach(@NotNull List $this$fastForEach, @NotNull Function1 action) {
/*  33 */     Intrinsics.checkNotNullParameter($this$fastForEach, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$fastForEach = 0;
/*  34 */     for (int index = 0, i = $this$fastForEach.size(); index < i; index++) {
/*  35 */       Object item = $this$fastForEach.get(index);
/*  36 */       action.invoke(item);
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
/*     */   @NotNull
/*     */   public static final <T> Set<T> fastToSet(@NotNull List $this$fastToSet) {
/*  49 */     Intrinsics.checkNotNullParameter($this$fastToSet, "<this>"); HashSet<Object> hashSet1 = new HashSet($this$fastToSet.size()), set = hashSet1; int $i$a$-also-ListUtilsKt$fastToSet$1 = 0;
/*  50 */     List $this$fastForEach$iv = $this$fastToSet; int $i$f$fastForEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 241 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 242 */       Object item = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastToSet$1$1 = 0; set.add(item);
/*     */     }  return hashSet1;
/*     */   } public static final <T> void fastForEachIndexed(@NotNull List $this$fastForEachIndexed, @NotNull Function2 action) { Intrinsics.checkNotNullParameter($this$fastForEachIndexed, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$fastForEachIndexed = 0; for (int index = 0, i = $this$fastForEachIndexed.size(); index < i; index++) {
/*     */       Object item = $this$fastForEachIndexed.get(index); action.invoke(Integer.valueOf(index), item);
/* 246 */     }  } @NotNull public static final <T, R> List<R> fastMap(@NotNull List $this$fastMap, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastMap, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMap = 0; ArrayList<Object> target = new ArrayList($this$fastMap.size()); List $this$fastForEach$iv = $this$fastMap; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 247 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 248 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2 = 0; target.add(transform.invoke(it));
/*     */     }  return target; } public static final <T> boolean fastAny(@NotNull List $this$fastAny, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastAny, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastAny = 0;
/*     */     List $this$fastForEach$iv = $this$fastAny;
/*     */     int $i$f$fastForEach = 0;
/* 252 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 253 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 254 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastAny$2 = 0; if (((Boolean)predicate.invoke(it)).booleanValue())
/*     */         return true; 
/*     */     }  return false; } public static final <T> boolean fastAll(@NotNull List $this$fastAll, @NotNull Function1 predicate) { Intrinsics.checkNotNullParameter($this$fastAll, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastAll = 0; List $this$fastForEach$iv = $this$fastAll;
/*     */     int $i$f$fastForEach = 0;
/* 258 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 259 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 260 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastAll$2 = 0; if (!((Boolean)predicate.invoke(it)).booleanValue()) return false;  }  return true; }
/*     */   @NotNull public static final <T> String fastJoinToString(@NotNull List<?> $this$fastJoinToString, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<?, ? extends CharSequence> transform) { Intrinsics.checkNotNullParameter($this$fastJoinToString, "<this>"); Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(truncated, "truncated"); Intrinsics.checkNotNullExpressionValue(((StringBuilder)fastJoinTo($this$fastJoinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString(), "toString(...)"); return ((StringBuilder)fastJoinTo($this$fastJoinToString, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform)).toString(); }
/*     */   private static final <T, A extends Appendable> A fastJoinTo(List $this$fastJoinTo, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Object, ? extends CharSequence> transform) { buffer.append(prefix); int count = 0; for (int index = 0, i = $this$fastJoinTo.size(); index < i; ) { Object element = $this$fastJoinTo.get(index); if (++count > 1)
/*     */         buffer.append(separator);  if (limit < 0 || count <= limit) { appendElement(buffer, element, transform); index++; }  }  if (limit >= 0 && count > limit)
/* 264 */       buffer.append(truncated);  buffer.append(postfix); return (A)buffer; } @NotNull public static final <T, K> Map<K, List<T>> fastGroupBy(@NotNull List $this$fastGroupBy, @NotNull Function1 keySelector) { Intrinsics.checkNotNullParameter($this$fastGroupBy, "<this>"); Intrinsics.checkNotNullParameter(keySelector, "keySelector"); int $i$f$fastGroupBy = 0; HashMap<Object, Object> destination = new HashMap<>($this$fastGroupBy.size()); List $this$fastForEach$iv = $this$fastGroupBy; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 265 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 266 */       Object it = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastGroupBy$2 = 0; Object key = keySelector.invoke(it); Map<Object, Object> $this$getOrPut$iv = destination; int $i$f$getOrPut = 0;
/* 267 */       Object value$iv = $this$getOrPut$iv.get(key);
/*     */     }  return (Map)destination; }
/*     */   private static final <T> void appendElement(Appendable $this$appendElement, Object element, Function1 transform) { if (transform != null) { $this$appendElement.append((CharSequence)transform.invoke(element)); }
/*     */     else if ((element == null) ? true : (element instanceof CharSequence))
/*     */     { $this$appendElement.append((CharSequence)element); }
/*     */     else if (element instanceof Character)
/*     */     { $this$appendElement.append(((Character)element).charValue()); }
/*     */     else
/*     */     { $this$appendElement.append(String.valueOf(element)); }
/* 276 */      } @NotNull public static final <T, R> List<R> fastMapNotNull(@NotNull List $this$fastMapNotNull, @NotNull Function1 transform) { Intrinsics.checkNotNullParameter($this$fastMapNotNull, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$fastMapNotNull = 0; ArrayList<Object> target = new ArrayList($this$fastMapNotNull.size()); List $this$fastForEach$iv = $this$fastMapNotNull; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 277 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 278 */       Object e = item$iv; int $i$a$-fastForEach-ListUtilsKt$fastMapNotNull$2 = 0; Object it = transform.invoke(e);
/* 279 */       int $i$a$-let-ListUtilsKt$fastMapNotNull$2$1 = 0; target.add(it); transform.invoke(e);
/*     */     }  return target; } @NotNull public static final <T> List<T> fastFilterIndexed(@NotNull List $this$fastFilterIndexed, @NotNull Function2 predicate) { Intrinsics.checkNotNullParameter($this$fastFilterIndexed, "<this>"); Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$fastFilterIndexed = 0; ArrayList<Object> target = new ArrayList($this$fastFilterIndexed.size()); List $this$fastForEachIndexed$iv = $this$fastFilterIndexed;
/*     */     int $i$f$fastForEachIndexed = 0;
/* 282 */     int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i) {
/* 283 */       Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 284 */       Object object1 = item$iv; int index = index$iv, $i$a$-fastForEachIndexed-ListUtilsKt$fastFilterIndexed$2 = 0;
/*     */       if (((Boolean)predicate.invoke(Integer.valueOf(index), object1)).booleanValue())
/*     */         target.add(object1); 
/*     */     } 
/*     */     return target; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\ListUtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */