/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\005*\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0052\006\020\t\032\0020\0052\006\020\n\032\0020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion;", "", "<init>", "()V", "toStringWithDescription", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;", "description", "useSlash", "maxOnePathLen", "", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectStrWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n774#2:223\n865#2,2:224\n1557#2:226\n1628#2,3:227\n774#2:230\n865#2,2:231\n*S KotlinDebug\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion\n*L\n87#1:223\n87#1:224,2\n88#1:226\n88#1:227,3\n89#1:230\n89#1:231,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final String toStringWithDescription(@NotNull List $this$toStringWithDescription, @NotNull String description, @NotNull String useSlash, int maxOnePathLen) {
/*  87 */     Intrinsics.checkNotNullParameter($this$toStringWithDescription, "<this>"); Intrinsics.checkNotNullParameter(description, "description"); Intrinsics.checkNotNullParameter(useSlash, "useSlash"); Iterable $this$filter$iv = $this$toStringWithDescription; int i = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection1 = new ArrayList(); int j = 0;
/* 224 */     for (Object element$iv$iv : iterable1) { ProjectStrNode it = (ProjectStrNode)element$iv$iv; int $i$a$-filter-ProjectStrNode$Companion$toStringWithDescription$formatedPath$1 = 0; if ((((CharSequence)it.getName()).length() > 0)) collection1.add(element$iv$iv);  }
/* 225 */      $this$filter$iv = collection1; int $i$f$map = 0;
/* 226 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 227 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 228 */       ProjectStrNode projectStrNode = (ProjectStrNode)item$iv$iv; Collection<String> collection2 = collection; int $i$a$-map-ProjectStrNode$Companion$toStringWithDescription$formatedPath$2 = 0; collection2.add(projectStrNode.getFullPath(useSlash));
/* 229 */     }  Iterable $this$map$iv = collection; int $i$f$filter = 0;
/* 230 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 231 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-ProjectStrNode$Companion$toStringWithDescription$formatedPath$3 = 0; if ((it.length() <= maxOnePathLen)) destination$iv$iv.add(element$iv$iv);  }
/* 232 */      String formatedPath = CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.distinct(destination$iv$iv)), "\n", null, null, 0, null, null, 62, null);
/*     */     return ((((CharSequence)formatedPath).length() > 0)) ? (description + "\n\n" + description) : "";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\ProjectStrNode$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */