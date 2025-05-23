/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\013\b\007\030\000 \0272\0020\001:\001\027B\005¢\006\002\020\002J\026\020\f\032\0020\r2\006\020\016\032\0020\0052\006\020\017\032\0020\005J\016\020\020\032\0020\r2\006\020\021\032\0020\000J\033\020\022\032\n\022\004\022\0020\005\030\0010\0042\006\020\016\032\0020\005¢\006\002\020\023J\016\020\024\032\0020\r2\006\020\016\032\0020\005J!\020\025\032\0020\r2\006\020\016\032\0020\0052\f\020\b\032\b\022\004\022\0020\0050\004¢\006\002\020\026R\027\020\003\032\b\022\004\022\0020\0050\0048F¢\006\006\032\004\b\006\020\007R6\020\b\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n0\tj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n`\013X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lai/grazie/model/cloud/HeaderCollection;", "", "()V", "keys", "", "", "getKeys", "()[Ljava/lang/String;", "values", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "add", "", "key", "value", "addAll", "headers", "get", "(Ljava/lang/String;)[Ljava/lang/String;", "remove", "set", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nHeaderCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderCollection.kt\nai/grazie/model/cloud/HeaderCollection\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,67:1\n381#2,7:68\n381#2,7:76\n216#3:75\n217#3:83\n37#4:84\n36#4,3:85\n37#4:88\n36#4,3:89\n*S KotlinDebug\n*F\n+ 1 HeaderCollection.kt\nai/grazie/model/cloud/HeaderCollection\n*L\n25#1:68,7\n33#1:76,7\n32#1:75\n32#1:83\n42#1:84\n42#1:85,3\n46#1:88\n46#1:89,3\n*E\n"})
/*    */ public final class HeaderCollection {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/model/cloud/HeaderCollection$Companion;", "", "()V", "empty", "Lai/grazie/model/cloud/HeaderCollection;", "model-cloud"})
/*    */   public static final class Companion { @NotNull
/*    */     public final HeaderCollection empty() {
/* 15 */       return new HeaderCollection();
/*    */     } private Companion() {} }
/*    */   @NotNull
/* 18 */   private final HashMap<String, List<String>> values = new HashMap<>();
/*    */   
/*    */   public final void set(@NotNull String key, @NotNull String[] values) {
/* 21 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); this.values.put(key.toLowerCase(Locale.ROOT), ArraysKt.toMutableList((Object[])values));
/*    */   }
/*    */   
/*    */   public final void add(@NotNull String key, @NotNull String value) {
/* 25 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); HashMap<String, List<String>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
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
/* 68 */     Object<String> value$iv = (Object<String>)hashMap.get(str);
/* 69 */     if (value$iv == null) {
/* 70 */       int $i$a$-getOrPut-HeaderCollection$add$1 = 0; Object answer$iv = new ArrayList();
/* 71 */       hashMap.put(str, answer$iv);
/*    */     } 
/*    */     
/* 74 */     ((List<String>)value$iv).add(value); } public final void addAll(@NotNull HeaderCollection headers) { Intrinsics.checkNotNullParameter(headers, "headers"); Map<String, List<String>> $this$forEach$iv = headers.values; int $i$f$forEach = 0;
/* 75 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-HeaderCollection$addAll$1 = 0; String key = (String)entry1.getKey(); List values = (List)entry1.getValue(); HashMap<String, List<String>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str1 = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
/* 76 */       Object<String> value$iv = (Object<String>)hashMap.get(str1); }
/*    */      } public final void remove(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     this.values.remove(key.toLowerCase(Locale.ROOT)); }
/*    */   @Nullable
/*    */   public final String[] get(@NotNull String key) { Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     Collection $this$toTypedArray$iv = this.values.get(key.toLowerCase(Locale.ROOT));
/*    */     int $i$f$toTypedArray = 0;
/* 85 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */     (List)this.values.get(key.toLowerCase(Locale.ROOT));
/* 87 */     return ((List)this.values.get(key.toLowerCase(Locale.ROOT)) != null) ? (String[])thisCollection$iv.toArray((Object[])new String[0]) : null; } @NotNull public final String[] getKeys() { Intrinsics.checkNotNullExpressionValue(this.values.keySet(), "this.values.keys"); Collection<String> $this$toTypedArray$iv = this.values.keySet();
/*    */     int $i$f$toTypedArray = 0;
/* 89 */     Collection<String> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 91 */     return thisCollection$iv.<String>toArray(new String[0]); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\HeaderCollection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */