/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import ai.grazie.utils.mpp.LoggerFactory;
/*    */ import ai.grazie.utils.mpp.LoggerKt;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import ai.grazie.utils.mpp.StreamDataLoader;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.concurrent.ThreadsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.text.Charsets;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b&\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\006\020\t\032\0020\nJ\f\020\013\032\0020\f*\0020\fH\004R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/utils/ToolFromResources;", "Lai/grazie/utils/FileFromResources;", "name", "", "loader", "Lai/grazie/utils/mpp/StreamDataLoader;", "(Ljava/lang/String;Lai/grazie/utils/mpp/StreamDataLoader;)V", "errorsPath", "Ljava/nio/file/Path;", "printLoggedErrors", "", "logErrors", "Ljava/lang/ProcessBuilder;", "Companion", "utils-common"})
/*    */ public abstract class ToolFromResources
/*    */   extends FileFromResources
/*    */ {
/*    */   public ToolFromResources(@NotNull String name, @NotNull StreamDataLoader loader) {
/* 32 */     super(loader);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     this.errorsPath = file(name + "_err", ".txt");
/*    */ 
/*    */     
/* 40 */     Runtime.getRuntime().addShutdownHook(ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>() { public final void invoke() {
/* 41 */               if (Files.exists(ToolFromResources.this.errorsPath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Files.size(ToolFromResources.this.errorsPath) == 0L)
/* 42 */                 Files.deleteIfExists(ToolFromResources.this.errorsPath); 
/*    */             } }
/*    */           30, null));
/*    */   }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\005"}, d2 = {"Lai/grazie/utils/ToolFromResources$Companion;", "", "()V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "utils-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   protected final ProcessBuilder logErrors(@NotNull ProcessBuilder $this$logErrors) {
/* 53 */     Intrinsics.checkNotNullParameter($this$logErrors, "<this>"); Intrinsics.checkNotNullExpressionValue($this$logErrors.redirectError(this.errorsPath.toFile()), "redirectError(errorsPath.toFile())"); return $this$logErrors.redirectError(this.errorsPath.toFile());
/*    */   } @NotNull
/*    */   private final Path errorsPath; @NotNull
/*    */   private static final MPPLogger logger = LoggerKt.create(LoggerFactory.INSTANCE, Reflection.getOrCreateKotlinClass(ToolFromResources.class)); public final void printLoggedErrors() {
/* 57 */     Path path = this.errorsPath; Intrinsics.checkNotNullExpressionValue(Files.readAllLines(path, Charsets.UTF_8), "readAllLines(...)"); for (String line : Files.readAllLines(path, Charsets.UTF_8))
/* 58 */       MPPLogger.error$default(logger, null, new ToolFromResources$printLoggedErrors$1(line), 1, null);  } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ToolFromResources$printLoggedErrors$1 extends Lambda implements Function0<String> { public final String invoke() { return this.$line; }
/*    */ 
/*    */     
/*    */     ToolFromResources$printLoggedErrors$1(String $line) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\ToolFromResources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */