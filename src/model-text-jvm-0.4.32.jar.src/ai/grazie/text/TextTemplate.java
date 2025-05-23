/*    */ package ai.grazie.text;
/*    */ import ai.grazie.utils.TextKt;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ import kotlin.text.MatchResult;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020$\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\007J\024\020\t\032\b\022\004\022\0020\0130\n2\006\020\b\032\0020\007J?\020\f\032\0020\0072\006\020\b\032\0020\0072*\020\r\032\026\022\022\b\001\022\016\022\004\022\0020\007\022\004\022\0020\0070\0170\016\"\016\022\004\022\0020\007\022\004\022\0020\0070\017¢\006\002\020\020J\"\020\f\032\0020\0072\006\020\b\032\0020\0072\022\020\r\032\016\022\004\022\0020\007\022\004\022\0020\0070\021J\020\020\022\032\0020\0072\006\020\023\032\0020\007H\002J\016\020\023\032\0020\0072\006\020\024\032\0020\007R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/text/TextTemplate;", "", "()V", "VARIABLE", "Lkotlin/text/Regex;", "findVariables", "", "", "template", "findVariablesRangesAt", "", "Lai/grazie/text/TextRange;", "render", "vars", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "", "unwrap", "variable", "name", "model-text"})
/*    */ @SourceDebugExtension({"SMAP\nTextTemplate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextTemplate.kt\nai/grazie/text/TextTemplate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1557#2:56\n1628#2,3:57\n1062#2:60\n*S KotlinDebug\n*F\n+ 1 TextTemplate.kt\nai/grazie/text/TextTemplate\n*L\n39#1:56\n39#1:57,3\n45#1:60\n*E\n"})
/*    */ public final class TextTemplate {
/*    */   @NotNull
/* 19 */   public static final TextTemplate INSTANCE = new TextTemplate(); @NotNull private static final Regex VARIABLE = new Regex("☣\\$\\{\\w+\\}☣");
/*    */   private final String unwrap(String variable) {
/* 21 */     return TextKt.dropPostfix(TextKt.dropPrefix(variable, "☣${"), "}☣");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String variable(@NotNull String name) {
/* 26 */     Intrinsics.checkNotNullParameter(name, "name"); return "☣${" + name + "}☣";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<TextRange> findVariablesRangesAt(@NotNull String template)
/*    */   {
/* 32 */     Intrinsics.checkNotNullParameter(template, "template"); return SequencesKt.toList(SequencesKt.map(Regex.findAll$default(VARIABLE, template, 0, 2, null), TextTemplate$findVariablesRangesAt$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/text/TextRange;", "it", "Lkotlin/text/MatchResult;", "invoke"}) static final class TextTemplate$findVariablesRangesAt$1 extends Lambda implements Function1<MatchResult, TextRange> { public static final TextTemplate$findVariablesRangesAt$1 INSTANCE = new TextTemplate$findVariablesRangesAt$1(); public final TextRange invoke(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return TextRange.Companion.invoke(it.getRange()); }
/*    */     
/*    */     TextTemplate$findVariablesRangesAt$1() {
/*    */       super(1);
/*    */     } }
/*    */   @NotNull
/*    */   public final Set<String> findVariables(@NotNull String template) {
/* 39 */     Intrinsics.checkNotNullParameter(template, "template"); Iterable<TextRange> $this$map$iv = findVariablesRangesAt(template); int $i$f$map = 0;
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
/* 56 */     Iterable<TextRange> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 57 */     for (TextRange item$iv$iv : iterable1) {
/* 58 */       TextRange textRange1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-TextTemplate$findVariables$1 = 0; collection.add(INSTANCE.unwrap(textRange1.substring(template)));
/* 59 */     }  return CollectionsKt.toSet(destination$iv$iv); } @NotNull public final String render(@NotNull String template, @NotNull Map vars) { Intrinsics.checkNotNullParameter(template, "template"); Intrinsics.checkNotNullParameter(vars, "vars"); Iterable<TextRange> $this$sortedByDescending$iv = findVariablesRangesAt(template); int $i$f$sortedByDescending = 0;
/* 60 */     List ranges = CollectionsKt.sortedWith($this$sortedByDescending$iv, new TextTemplate$render$$inlined$sortedByDescending$1());
/*    */     String result = template;
/*    */     for (TextRange range : ranges) {
/*    */       String value, variable = unwrap(ExtensionsKt.substring(result, range));
/*    */       if ((String)vars.get(variable) == null) {
/*    */         (String)vars.get(variable);
/*    */         throw new IllegalStateException(("Unexpected situation, was unable to find variable '" + variable + "' in provided map").toString());
/*    */       } 
/*    */       result = ExtensionsKt.replace(result, range, value);
/*    */     } 
/*    */     return result; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String render(@NotNull String template, @NotNull Pair... vars) {
/*    */     Intrinsics.checkNotNullParameter(template, "template");
/*    */     Intrinsics.checkNotNullParameter(vars, "vars");
/*    */     return render(template, MapsKt.toMap(ArraysKt.toList((Object[])vars)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-text-jvm-0.4.32.jar!\ai\grazie\text\TextTemplate.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */