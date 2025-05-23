/*    */ package ai.grazie.gec.model;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\004J!\020\b\032\b\022\004\022\0020\0050\t2\f\020\006\032\b\022\004\022\0020\0070\tH\007¢\006\002\020\nJ\017\020\013\032\b\022\004\022\0020\0050\fHÆ\001¨\006\r"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections$Companion;", "", "()V", "allEmpty", "", "Lai/grazie/gec/model/SentenceWithCorrections;", "texts", "", "empty", "", "([Ljava/lang/String;)[Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithCorrections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n11158#2:83\n11493#2,3:84\n37#3:87\n36#3,3:88\n1557#4:91\n1628#4,3:92\n*S KotlinDebug\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n*L\n14#1:83\n14#1:84,3\n14#1:87\n14#1:88,3\n18#1:91\n18#1:92,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 11 */   public final KSerializer<SentenceWithCorrections> serializer() { return (KSerializer<SentenceWithCorrections>)SentenceWithCorrections.$serializer.INSTANCE; } private Companion() {} @Deprecated(message = "Use allEmpty", replaceWith = @ReplaceWith(expression = "allEmpty", imports = {}))
/*    */   @NotNull
/*    */   public final SentenceWithCorrections[] empty(@NotNull String[] texts) {
/* 14 */     Intrinsics.checkNotNullParameter(texts, "texts"); String[] arrayOfString1 = texts; int $i$f$map = 0;
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
/* 83 */     String[] arrayOfString2 = arrayOfString1; Collection<SentenceWithCorrections> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 84 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object item$iv$iv = arrayOfString2[b];
/* 85 */       Object object1 = item$iv$iv; Collection<SentenceWithCorrections> collection = destination$iv$iv; int $i$a$-map-SentenceWithCorrections$Companion$empty$1 = 0; collection.add(new SentenceWithCorrections((String)object1, new SentenceWithCorrections.Correction[0])); }
/* 86 */      List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 88 */     Collection thisCollection$iv = list;
/*    */     
/* 90 */     return (SentenceWithCorrections[])thisCollection$iv.toArray((Object[])new SentenceWithCorrections[0]); } @NotNull public final List<SentenceWithCorrections> allEmpty(@NotNull List texts) { Intrinsics.checkNotNullParameter(texts, "texts"); Iterable $this$map$iv = texts; int $i$f$map = 0;
/* 91 */     Iterable iterable1 = $this$map$iv; Collection<SentenceWithCorrections> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 92 */     for (Object item$iv$iv : iterable1) {
/* 93 */       String str = (String)item$iv$iv; Collection<SentenceWithCorrections> collection = destination$iv$iv; int $i$a$-map-SentenceWithCorrections$Companion$allEmpty$1 = 0; collection.add(new SentenceWithCorrections(str, new SentenceWithCorrections.Correction[0]));
/* 94 */     }  return (List<SentenceWithCorrections>)destination$iv$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\SentenceWithCorrections$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */