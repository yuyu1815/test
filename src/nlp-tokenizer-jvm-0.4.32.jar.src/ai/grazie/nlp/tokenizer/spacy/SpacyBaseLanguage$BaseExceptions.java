/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R9\020\007\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\t0\0040\bj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\t0\004`\n¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions;", "", "()V", "emoticons", "", "", "ends", "exceptions", "Ljava/util/HashMap;", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "Lkotlin/collections/HashMap;", "getExceptions", "()Ljava/util/HashMap;", "spaces", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyBaseLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1279#2,2:127\n1293#2,4:129\n*S KotlinDebug\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions\n*L\n123#1:127,2\n123#1:129,4\n*E\n"})
/*     */ public final class BaseExceptions
/*     */ {
/*     */   @NotNull
/* 110 */   public static final BaseExceptions INSTANCE = new BaseExceptions(); static { String[] arrayOfString = new String[7]; arrayOfString[0] = " "; arrayOfString[1] = "\t"; arrayOfString[2] = "\\t"; arrayOfString[3] = "\n"; arrayOfString[4] = "\\n"; arrayOfString[5] = "—"; arrayOfString[6] = " "; spaces = CollectionsKt.listOf((Object[])arrayOfString);
/*     */ 
/*     */     
/* 113 */     arrayOfString = new String[34]; arrayOfString[0] = "'"; arrayOfString[1] = "\\\\\")"; arrayOfString[2] = "<space>"; arrayOfString[3] = "''"; arrayOfString[4] = "C++"; arrayOfString[5] = "a."; arrayOfString[6] = "b."; arrayOfString[7] = "c."; arrayOfString[8] = "d."; arrayOfString[9] = "e."; arrayOfString[10] = "f."; arrayOfString[11] = "g."; arrayOfString[12] = "h."; arrayOfString[13] = "i."; arrayOfString[14] = 
/* 114 */       "j."; arrayOfString[15] = "k."; arrayOfString[16] = "l."; arrayOfString[17] = "m."; arrayOfString[18] = "n."; arrayOfString[19] = "o."; arrayOfString[20] = "p."; arrayOfString[21] = "q."; arrayOfString[22] = "r."; arrayOfString[23] = "s."; arrayOfString[24] = "t."; arrayOfString[25] = "u."; arrayOfString[26] = "v."; arrayOfString[27] = "w."; arrayOfString[28] = "x."; arrayOfString[29] = "y."; arrayOfString[30] = "z."; arrayOfString[31] = "ä."; arrayOfString[32] = "ö."; arrayOfString[33] = "ü.";
/*     */ 
/*     */ 
/*     */     
/*     */     ends = CollectionsKt.listOf((Object[])arrayOfString);
/*     */ 
/*     */     
/* 121 */     arrayOfString = new String[1]; arrayOfString[0] = " "; emoticons = StringsKt.split$default(":) :-) :)) :-)) :))) :-))) (: (-: =) (= \") :] :-] [: [-: [= =] :o) (o: :} :-} \n        8) 8-) (-8 ;) ;-) (; (-; :( :-( :(( :-(( :((( :-((( ): )-: =( >:( :') :'-) :'( :'-( :/ :-/ =/ =| :| :-| ]= \n        =[ :1 :P :-P :p :-p :O :-O :o :-o :0 :-0 :() >:o :* :-* :3 :-3 =3 :> :-> :X :-X :x :-x :D :-D ;D ;-D =D xD \n        XD xDD XDD 8D 8-D ^_^ ^__^ ^___^ >.< >.> <.< ._. ;_; -_- -__- v.v V.V v_v V_V o_o o_O O_o O_O 0_o o_0 0_0 o.O \n        O.o O.O o.o 0.0 o.0 0.o @_@ <3 <33 <333 </3 (^_^) (-_-) (._.) (>_<) (*_*) (¬_¬) ಠ_ಠ ಠ︵ಠ (ಠ_ಠ) ¯\\(ツ)/¯ (╯°□°）╯︵┻━┻ ><(((*>", arrayOfString, false, 0, 6, null);
/*     */     
/* 123 */     Iterable $this$associateWith$iv = CollectionsKt.plus(CollectionsKt.plus(spaces, ends), emoticons); int $i$f$associateWith = 0;
/*     */ 
/*     */ 
/*     */     
/* 127 */     LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/* 128 */     Iterable $this$associateWithTo$iv$iv = $this$associateWith$iv; int $i$f$associateWithTo = 0;
/* 129 */     for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/* 130 */       String str = (String)element$iv$iv; Object object1 = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-SpacyBaseLanguage$BaseExceptions$exceptions$1 = 0; List list = CollectionsKt.listOf(new SpacyTokenInfo(str, null, null, null, 14, null)); linkedHashMap.put(object1, list);
/*     */     } 
/* 132 */     exceptions = (HashMap)result$iv; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final List<String> spaces;
/*     */   @NotNull
/*     */   private static final List<String> ends;
/*     */   @NotNull
/*     */   private static final List<String> emoticons;
/*     */   @NotNull
/*     */   private static final HashMap<String, List<SpacyTokenInfo>> exceptions;
/*     */   
/*     */   @NotNull
/*     */   public final HashMap<String, List<SpacyTokenInfo>> getExceptions() {
/*     */     return exceptions;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyBaseLanguage$BaseExceptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */