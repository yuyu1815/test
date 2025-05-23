/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Deprecated(message = "Moved to another package", replaceWith = @ReplaceWith(expression = "HeaderCollection", imports = {"ai.grazie.model.cloud.HeaderCollection"}))
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\n\n\002\030\002\n\002\b\002\b\007\030\000 \0312\0020\001:\001\031B\005¢\006\002\020\002J\026\020\f\032\0020\r2\006\020\016\032\0020\0052\006\020\017\032\0020\005J\016\020\020\032\0020\r2\006\020\021\032\0020\000J\033\020\022\032\n\022\004\022\0020\005\030\0010\0042\006\020\016\032\0020\005¢\006\002\020\023J\016\020\024\032\0020\r2\006\020\016\032\0020\005J!\020\025\032\0020\r2\006\020\016\032\0020\0052\f\020\b\032\b\022\004\022\0020\0050\004¢\006\002\020\026J\006\020\027\032\0020\030R\027\020\003\032\b\022\004\022\0020\0050\0048F¢\006\006\032\004\b\006\020\007R6\020\b\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n0\tj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n`\013X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/client/common/model/HeaderCollection;", "", "()V", "keys", "", "", "getKeys", "()[Ljava/lang/String;", "values", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "add", "", "key", "value", "addAll", "headers", "get", "(Ljava/lang/String;)[Ljava/lang/String;", "remove", "set", "(Ljava/lang/String;[Ljava/lang/String;)V", "toHeaderCollection", "Lai/grazie/model/cloud/HeaderCollection;", "Companion", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nHeaderCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderCollection.kt\nai/grazie/client/common/model/HeaderCollection\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,73:1\n381#2,7:74\n381#2,7:82\n216#3:81\n217#3:89\n37#4:90\n36#4,3:91\n37#4:94\n36#4,3:95\n*S KotlinDebug\n*F\n+ 1 HeaderCollection.kt\nai/grazie/client/common/model/HeaderCollection\n*L\n29#1:74,7\n37#1:82,7\n36#1:81\n36#1:89\n46#1:90\n46#1:91,3\n52#1:94\n52#1:95,3\n*E\n"})
/*    */ public final class HeaderCollection {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/client/common/model/HeaderCollection$Companion;", "", "()V", "empty", "Lai/grazie/client/common/model/HeaderCollection;", "client-common"})
/*    */   public static final class Companion { @NotNull
/*    */     public final HeaderCollection empty() {
/* 19 */       return new HeaderCollection();
/*    */     } private Companion() {} }
/*    */   @NotNull
/* 22 */   private final HashMap<String, List<String>> values = new HashMap<>();
/*    */   
/*    */   public final void set(@NotNull String key, @NotNull String[] values) {
/* 25 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); this.values.put(key.toLowerCase(Locale.ROOT), ArraysKt.toMutableList((Object[])values));
/*    */   }
/*    */   
/*    */   public final void add(@NotNull String key, @NotNull String value) {
/* 29 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); HashMap<String, List<String>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 74 */     Object<String> value$iv = (Object<String>)hashMap.get(str);
/* 75 */     if (value$iv == null) {
/* 76 */       int $i$a$-getOrPut-HeaderCollection$add$1 = 0; Object answer$iv = new ArrayList();
/* 77 */       hashMap.put(str, answer$iv);
/*    */     } 
/*    */     
/* 80 */     ((List<String>)value$iv).add(value); } public final void addAll(@NotNull HeaderCollection headers) { Intrinsics.checkNotNullParameter(headers, "headers"); Map<String, List<String>> $this$forEach$iv = headers.values; int $i$f$forEach = 0;
/* 81 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-HeaderCollection$addAll$1 = 0; String key = (String)entry1.getKey(); List values = (List)entry1.getValue(); HashMap<String, List<String>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str1 = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
/* 82 */       Object<String> value$iv = (Object<String>)hashMap.get(str1); }
/*    */      } public final void remove(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     this.values.remove(key.toLowerCase(Locale.ROOT)); }
/*    */   @Nullable
/*    */   public final String[] get(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     Collection $this$toTypedArray$iv = this.values.get(key.toLowerCase(Locale.ROOT));
/*    */     int $i$f$toTypedArray = 0;
/* 91 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */     (List)this.values.get(key.toLowerCase(Locale.ROOT));
/* 93 */     return ((List)this.values.get(key.toLowerCase(Locale.ROOT)) != null) ? (String[])thisCollection$iv.toArray((Object[])new String[0]) : null; } @NotNull public final ai.grazie.model.cloud.HeaderCollection toHeaderCollection() { return HeaderCollectionKt.of(ai.grazie.model.cloud.HeaderCollection.Companion, this.values); }
/*    */   @NotNull public final String[] getKeys() { Intrinsics.checkNotNullExpressionValue(this.values.keySet(), "this.values.keys"); Collection<String> $this$toTypedArray$iv = this.values.keySet(); int $i$f$toTypedArray = 0;
/* 95 */     Collection<String> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 97 */     return thisCollection$iv.<String>toArray(new String[0]); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\HeaderCollection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */