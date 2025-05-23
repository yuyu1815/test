/*    */ package ai.grazie.tasks.codegen.model;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\n\020\004\032\0020\003*\0020\003¨\006\005"}, d2 = {"cleanup", "", "outputPath", "", "toCamelCase", "tasks-codegen-model"})
/*    */ public final class UtilKt {
/*    */   public static final void cleanup(@NotNull String outputPath) {
/*  9 */     Intrinsics.checkNotNullParameter(outputPath, "outputPath"); Path path = Paths.get(outputPath, new String[0]);
/* 10 */     Intrinsics.checkNotNull(path); if (Files.exists(path, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)))
/* 11 */       if (Files.isDirectory(path, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) {
/* 12 */         PathsKt.deleteRecursively(path);
/*    */       } else {
/* 14 */         Files.delete(path);
/*    */       }  
/*    */   }
/*    */   
/*    */   @NotNull
/* 19 */   public static final String toCamelCase(@NotNull String $this$toCamelCase) { Intrinsics.checkNotNullParameter($this$toCamelCase, "<this>"); String[] arrayOfString = new String[1]; arrayOfString[0] = "-"; return CollectionsKt.joinToString$default(StringsKt.split$default($this$toCamelCase, arrayOfString, false, 0, 6, null), "", null, null, 0, null, UtilKt::toCamelCase$lambda$0, 30, null); } private static final CharSequence toCamelCase$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it"); return TextKt.capitalize(it); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-codegen-model-0.4.32.jar!\ai\grazie\tasks\codegen\model\UtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */