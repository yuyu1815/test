/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\000 \0252\0020\001:\001\025B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\017\020\r\032\b\022\004\022\0020\0030\005HÆ\003J#\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace;", "", "message", "", "frames", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "getFrames", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ej-idea"})
/*     */ public final class StackTrace
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String message;
/*     */   @NotNull
/*     */   private final List<String> frames;
/*     */   
/*     */   public StackTrace(@NotNull String message, @NotNull List<String> frames) {
/*  38 */     this.message = message; this.frames = frames; } @NotNull public final String getMessage() { return this.message; } @NotNull public final List<String> getFrames() { return this.frames; } @NotNull public final String component1() { return this.message; } @NotNull public final List<String> component2() { return this.frames; } @NotNull public final StackTrace copy(@NotNull String message, @NotNull List<String> frames) { Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(frames, "frames"); return new StackTrace(message, frames); } @NotNull public String toString() { return "StackTrace(message=" + this.message + ", frames=" + this.frames + ")"; } public int hashCode() { result = this.message.hashCode(); return result * 31 + this.frames.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof StackTrace)) return false;  StackTrace stackTrace = (StackTrace)other; return !Intrinsics.areEqual(this.message, stackTrace.message) ? false : (!!Intrinsics.areEqual(this.frames, stackTrace.frames)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\020\020\b\032\004\030\0010\t2\006\020\n\032\0020\007¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace$Companion;", "", "<init>", "()V", "isFrameLine", "", "line", "", "parseTopTrace", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace;", "text", "ej-idea"}) @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n967#2,7:226\n774#2:233\n865#2,2:234\n756#2,10:236\n1557#2:246\n1628#2,3:247\n774#2:250\n865#2,2:251\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace$Companion\n*L\n43#1:226,7\n43#1:233\n43#1:234,2\n44#1:236,10\n44#1:246\n44#1:247,3\n44#1:250\n44#1:251,2\n*E\n"}) public static final class Companion
/*     */   {
/*  40 */     private final boolean isFrameLine(String line) { return StringsKt.startsWith$default(StringsKt.trim(line).toString(), "at ", false, 2, null); }
/*     */      private Companion() {} @Nullable
/*     */     public final StackTrace parseTopTrace(@NotNull String text) {
/*  43 */       Intrinsics.checkNotNullParameter(text, "text"); Iterable<Object> $this$takeWhile$iv = StringsKt.lines(text); int $i$f$takeWhile = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 226 */       ArrayList<Object> list$iv = new ArrayList();
/* 227 */       for (Object item$iv : $this$takeWhile$iv) {
/* 228 */         String it = (String)item$iv; int $i$a$-takeWhile-StackTrace$Companion$parseTopTrace$errorMessage$1 = 0; if (!(!StackTrace.Companion.isFrameLine(it) ? 1 : 0))
/*     */           break; 
/* 230 */         list$iv.add(item$iv);
/*     */       } 
/* 232 */       $this$takeWhile$iv = list$iv; int $i$f$filter = 0;
/* 233 */       Iterable<Object> iterable1 = $this$takeWhile$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 234 */       for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-StackTrace$Companion$parseTopTrace$errorMessage$2 = 0; if ((((CharSequence)StringsKt.trim(it).toString()).length() > 0)) destination$iv$iv.add(element$iv$iv);  }
/* 235 */        String errorMessage = CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); Iterable<Object> $this$dropWhile$iv = StringsKt.lines(text); int $i$f$dropWhile = 0;
/* 236 */       boolean yielding$iv = false;
/* 237 */       ArrayList<Object> arrayList1 = new ArrayList();
/* 238 */       for (Object item$iv : $this$dropWhile$iv) {
/* 239 */         if (yielding$iv) {
/* 240 */           arrayList1.add(item$iv); continue;
/* 241 */         }  String it = (String)item$iv; int $i$a$-dropWhile-StackTrace$Companion$parseTopTrace$frames$1 = 0; if (!(!StackTrace.Companion.isFrameLine(it) ? 1 : 0)) {
/* 242 */           arrayList1.add(item$iv);
/* 243 */           yielding$iv = true;
/*     */         } 
/* 245 */       }  $this$dropWhile$iv = arrayList1; int $i$f$map = 0;
/* 246 */       Iterable<Object> iterable2 = $this$dropWhile$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$dropWhile$iv, 10)); int $i$f$mapTo = 0;
/* 247 */       for (Object item$iv$iv : iterable2) {
/* 248 */         String str = (String)item$iv$iv; Collection<String> collection2 = collection; int $i$a$-map-StackTrace$Companion$parseTopTrace$frames$2 = 0; collection2.add(StringsKt.removePrefix(StringsKt.trim(str).toString(), "at "));
/* 249 */       }  Iterable $this$map$iv = collection; int i = 0;
/* 250 */       Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> collection1 = new ArrayList(); int j = 0;
/* 251 */       for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-StackTrace$Companion$parseTopTrace$frames$3 = 0; if ((((CharSequence)StringsKt.trim(it).toString()).length() > 0)) collection1.add(element$iv$iv);  }
/* 252 */        List<String> frames = (List)collection1;
/*     */       return frames.isEmpty() ? null : new StackTrace(errorMessage, frames);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\StackTrace.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */