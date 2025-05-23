/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\0324\020\000\032\016\022\n\022\b\022\004\022\0020\0030\0020\001*\016\022\n\022\b\022\004\022\0020\0030\0020\0012\006\020\004\032\0020\0052\006\020\006\032\0020\005H\002¨\006\007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n235#2,3:155\n33#2,4:158\n238#2,2:162\n38#2:164\n240#2:165\n151#2,3:166\n33#2,4:169\n154#2,2:173\n38#2:175\n156#2:176\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n142#1:155,3\n142#1:158,4\n142#1:162,2\n142#1:164\n142#1:165\n142#1:166,3\n142#1:169,4\n142#1:173,2\n142#1:175\n142#1:176\n*E\n"})
/*     */ public final class MultiParagraphIntrinsicsKt
/*     */ {
/*     */   private static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<Object> $this$getLocalPlaceholders, int start, int end) {
/* 142 */     List<Object> $this$fastFilter$iv = $this$getLocalPlaceholders; int $i$f$fastFilter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     ArrayList<Object> arrayList = new ArrayList($this$fastFilter$iv.size());
/* 157 */     List<Object> list1 = $this$fastFilter$iv; int $i$f$fastForEach = 0;
/*     */     
/* 159 */     int index$iv$iv = 0, i = list1.size(); if (index$iv$iv < i) {
/* 160 */       Object item$iv$iv = list1.get(index$iv$iv);
/* 161 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 162 */       AnnotatedString.Range it = (AnnotatedString.Range)it$iv; int $i$a$-fastFilter-MultiParagraphIntrinsicsKt$getLocalPlaceholders$1 = 0; if (AnnotatedStringKt.intersect(start, end, it.getStart(), it.getEnd())) arrayList.add(it$iv);
/*     */     
/*     */     } 
/* 165 */     $this$fastFilter$iv = arrayList;
/*     */     int $i$f$fastMap = 0;
/* 167 */     ArrayList<AnnotatedString.Range<Placeholder>> target$iv = new ArrayList($this$fastFilter$iv.size());
/* 168 */     List<Object> $this$fastForEach$iv$iv = $this$fastFilter$iv; $i$f$fastForEach = 0;
/*     */     
/* 170 */     index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 171 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 172 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 173 */       AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<AnnotatedString.Range<Placeholder>> arrayList1 = target$iv; int $i$a$-fastMap-MultiParagraphIntrinsicsKt$getLocalPlaceholders$2 = 0; if (!((start <= range.getStart() && range.getEnd() <= end) ? 1 : 0)) {
/*     */         int $i$a$-require-MultiParagraphIntrinsicsKt$getLocalPlaceholders$2$1 = 0; String str = "placeholder can not overlap with paragraph."; throw new IllegalArgumentException(str.toString());
/*     */       } 
/* 176 */     }  return target$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\MultiParagraphIntrinsicsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */