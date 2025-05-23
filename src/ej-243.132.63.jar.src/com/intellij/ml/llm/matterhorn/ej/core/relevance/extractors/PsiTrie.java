/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020%\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J(\020\021\032\0020\0222\006\020\023\032\0020\0242\030\020\025\032\024\022\004\022\0020\020\022\004\022\0020\027\022\004\022\0020\0220\026J2\020\021\032\0020\0222\006\020\030\032\0020\0272\006\020\023\032\0020\0242\030\020\025\032\024\022\004\022\0020\020\022\004\022\0020\027\022\004\022\0020\0220\026H\002J\016\020\031\032\0020\0222\006\020\032\032\0020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\033\020\b\032\0020\t8BX\002¢\006\f\n\004\b\f\020\r\032\004\b\n\020\013R\032\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0000\017X\004¢\006\002\n\000¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/PsiTrie;", "", "file", "Lcom/intellij/psi/PsiFile;", "<init>", "(Lcom/intellij/psi/PsiFile;)V", "getFile", "()Lcom/intellij/psi/PsiFile;", "document", "Lcom/intellij/openapi/editor/Document;", "getDocument", "()Lcom/intellij/openapi/editor/Document;", "document$delegate", "Lkotlin/Lazy;", "children", "", "Lcom/intellij/psi/PsiElement;", "build", "", "format", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams;", "consumer", "Lkotlin/Function2;", "", "prefix", "add", "element", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nExtractorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/PsiTrie\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,183:1\n216#2,2:184\n381#3,7:186\n*S KotlinDebug\n*F\n+ 1 ExtractorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/PsiTrie\n*L\n30#1:184,2\n59#1:186,7\n*E\n"})
/*     */ public final class PsiTrie {
/*     */   @NotNull
/*     */   private final PsiFile file;
/*     */   @NotNull
/*     */   private final Lazy document$delegate;
/*     */   @NotNull
/*     */   private final Map<PsiElement, PsiTrie> children;
/*     */   
/*  21 */   public PsiTrie(@NotNull PsiFile file) { this.file = file;
/*  22 */     this.document$delegate = LazyKt.lazy(this::document_delegate$lambda$0);
/*  23 */     this.children = new LinkedHashMap<>(); }
/*     */   @NotNull public final PsiFile getFile() { return this.file; }
/*     */   private final Document getDocument() { Lazy lazy = this.document$delegate; return (Document)lazy.getValue(); }
/*  26 */   private static final Document document_delegate$lambda$0(PsiTrie this$0) { Intrinsics.checkNotNullExpressionValue(this$0.file.getFileDocument(), "getFileDocument(...)"); return this$0.file.getFileDocument(); } public final void build(@NotNull FormatHierarchyParams format, @NotNull Function2<? super PsiElement, ? super String, Unit> consumer) { Intrinsics.checkNotNullParameter(format, "format"); Intrinsics.checkNotNullParameter(consumer, "consumer"); build("", format, consumer); }
/*     */ 
/*     */   
/*     */   private final void build(String prefix, FormatHierarchyParams format, Function2 consumer) {
/*  30 */     Map<PsiElement, PsiTrie> $this$forEach$iv = this.children; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-PsiTrie$build$1 = 0; PsiElement node = (PsiElement)entry1.getKey(); PsiTrie childTrie = (PsiTrie)entry1.getValue(); String nodeText = ElementProvider.Companion.getDeclarationString(this.file, node, format.getDeclarationParams()); }
/*     */      } public final void add(@NotNull PsiElement element) { Intrinsics.checkNotNullParameter(element, "element"); List<PsiElement> path = new ArrayList(); PsiElement current = element; while (current != null && !(current instanceof PsiFile)) { path.add(current); current = current.getParent(); }
/* 186 */      CollectionsKt.reverse(path); PsiTrie node = this; Iterator<PsiElement> iterator = path.iterator(); while (true) { if (iterator.hasNext()) { PsiElement e = iterator.next(); Map<PsiElement, PsiTrie> $this$getOrPut$iv = node.children; int $i$f$getOrPut = 0; Object value$iv = $this$getOrPut$iv.get(e);
/* 187 */         if (value$iv == null) {
/* 188 */           int $i$a$-getOrPut-PsiTrie$add$1 = 0; Object answer$iv = new PsiTrie(this.file);
/* 189 */           $this$getOrPut$iv.put(e, answer$iv);
/*     */         }  }
/*     */       else { break; }
/* 192 */        node = (PsiTrie)value$iv; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\PsiTrie.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */