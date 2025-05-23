/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/utils/Color$Companion;", "", "()V", "ofHex", "Lai/grazie/utils/Color;", "hex", "", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nai/grazie/utils/Color$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1#2:26\n1557#3:27\n1628#3,3:28\n*S KotlinDebug\n*F\n+ 1 Color.kt\nai/grazie/utils/Color$Companion\n*L\n18#1:27\n18#1:28,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 14 */   public final KSerializer<Color> serializer() { return (KSerializer<Color>)Color.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final Color ofHex(@NotNull String hex) {
/* 16 */     Intrinsics.checkNotNullParameter(hex, "hex"); String trimmed = TextKt.dropPrefix(hex, "#");
/* 17 */     if (!((trimmed.length() == 6) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       int $i$a$-require-Color$Companion$ofHex$1 = 0; String str = "HEX color string should have 6, not " + trimmed.length() + " symbols"; throw new IllegalArgumentException(str.toString());
/* 27 */     }  Iterable $this$map$iv = StringsKt.chunked(trimmed, 2); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Integer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 28 */     for (Object item$iv$iv : iterable1) {
/* 29 */       String str = (String)item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-Color$Companion$ofHex$2 = 0; collection.add(Integer.valueOf(Integer.parseInt(str, CharsKt.checkRadix(16))));
/* 30 */     }  List<Number> list = (List)destination$iv$iv;
/*    */     int r = ((Number)list.get(0)).intValue(), g = ((Number)list.get(1)).intValue(), b = ((Number)list.get(2)).intValue();
/*    */     return new Color(r, g, b, 255);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\Color$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */