/*    */ package ai.grazie.model.cloud.annotations;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020#\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020 \n\002\b\003\030\000 \0242\0020\001:\001\024B\005¢\006\002\020\002J\026\020\r\032\0020\0162\006\020\017\032\0020\0052\006\020\020\032\0020\013J\034\020\021\032\0020\0162\006\020\017\032\0020\0052\f\020\b\032\b\022\004\022\0020\0130\022J\026\020\023\032\n\022\004\022\0020\013\030\0010\0042\006\020\017\032\0020\005R\027\020\003\032\b\022\004\022\0020\0050\0048F¢\006\006\032\004\b\006\020\007R6\020\b\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0130\n0\tj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0130\n`\fX\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/model/cloud/annotations/AnnotationInfoCollection;", "", "()V", "keys", "", "", "getKeys", "()Ljava/util/Set;", "values", "Ljava/util/HashMap;", "", "Lai/grazie/model/cloud/annotations/AnnotationInfo;", "Lkotlin/collections/HashMap;", "add", "", "key", "value", "addAll", "", "get", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nAnnotationInfoCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationInfoCollection.kt\nai/grazie/model/cloud/annotations/AnnotationInfoCollection\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,28:1\n381#2,7:29\n381#2,7:36\n*S KotlinDebug\n*F\n+ 1 AnnotationInfoCollection.kt\nai/grazie/model/cloud/annotations/AnnotationInfoCollection\n*L\n17#1:29,7\n21#1:36,7\n*E\n"})
/*    */ public final class AnnotationInfoCollection { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/model/cloud/annotations/AnnotationInfoCollection$Companion;", "", "()V", "empty", "Lai/grazie/model/cloud/annotations/AnnotationInfoCollection;", "model-cloud"})
/*    */   public static final class Companion { @NotNull
/*    */     public final AnnotationInfoCollection empty() {
/*  8 */       return new AnnotationInfoCollection();
/*    */     } private Companion() {} }
/*    */   @NotNull
/* 11 */   private final HashMap<String, Set<AnnotationInfo>> values = new HashMap<>();
/*    */   @NotNull
/*    */   public final Set<String> getKeys() {
/* 14 */     Intrinsics.checkNotNullExpressionValue(this.values.keySet(), "this.values.keys"); return this.values.keySet();
/*    */   }
/*    */   
/* 17 */   public final void add(@NotNull String key, @NotNull AnnotationInfo value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); HashMap<String, Set<AnnotationInfo>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
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
/* 29 */     Object<AnnotationInfo> value$iv = (Object<AnnotationInfo>)hashMap.get(str);
/* 30 */     if (value$iv == null) {
/* 31 */       int $i$a$-getOrPut-AnnotationInfoCollection$add$1 = 0; Object answer$iv = new LinkedHashSet();
/* 32 */       hashMap.put(str, answer$iv);
/*    */     } 
/*    */     
/* 35 */     ((Set<AnnotationInfo>)value$iv).add(value); } public final void addAll(@NotNull String key, @NotNull List values) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(values, "values"); HashMap<String, Set<AnnotationInfo>> hashMap = this.values; Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = key.toLowerCase(Locale.ROOT); int $i$f$getOrPut = 0;
/* 36 */     Object<AnnotationInfo> value$iv = (Object<AnnotationInfo>)hashMap.get(str);
/* 37 */     if (value$iv == null) {
/* 38 */       int $i$a$-getOrPut-AnnotationInfoCollection$addAll$1 = 0; Object answer$iv = new LinkedHashSet();
/* 39 */       hashMap.put(str, answer$iv);
/*    */     } 
/*    */     
/* 42 */     ((Set)value$iv).addAll(values); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Set<AnnotationInfo> get(@NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullExpressionValue(key.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     return this.values.get(key.toLowerCase(Locale.ROOT));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\annotations\AnnotationInfoCollection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */