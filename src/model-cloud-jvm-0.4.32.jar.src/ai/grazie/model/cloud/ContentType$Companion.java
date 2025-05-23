/*     */ package ai.grazie.model.cloud;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/cloud/ContentType$Companion;", "", "()V", "parse", "Lai/grazie/model/cloud/ContentType;", "text", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-cloud"})
/*     */ @SourceDebugExtension({"SMAP\nContentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentType.kt\nai/grazie/model/cloud/ContentType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1557#2:135\n1628#2,3:136\n*S KotlinDebug\n*F\n+ 1 ContentType.kt\nai/grazie/model/cloud/ContentType$Companion\n*L\n12#1:135\n12#1:136,3\n*E\n"})
/*     */ public final class Companion {
/*     */   @NotNull
/*  10 */   public final KSerializer<ContentType> serializer() { return (KSerializer<ContentType>)ContentType.Serializer.INSTANCE; } private Companion() {} @NotNull
/*     */   public final ContentType parse(@NotNull String text) {
/*  12 */     Intrinsics.checkNotNullParameter(text, "text"); String[] arrayOfString = new String[1]; arrayOfString[0] = "/"; Iterable $this$map$iv = StringsKt.split$default(text, arrayOfString, false, 0, 6, null); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 136 */     for (Object item$iv$iv : iterable1) {
/* 137 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-ContentType$Companion$parse$1 = 0; collection.add(StringsKt.trim(str).toString());
/* 138 */     }  List<String> list = (List)destination$iv$iv;
/*     */     String type = list.get(0), subtype = list.get(1);
/*     */     return new ContentType(type, subtype);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\ContentType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */