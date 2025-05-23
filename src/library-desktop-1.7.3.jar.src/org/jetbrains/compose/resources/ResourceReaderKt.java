/*    */ package org.jetbrains.compose.resources;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\022\n\002\b\002\032\020\020\b\032\0020\t2\006\020\n\032\0020\tH\007\032\026\020\013\032\0020\f2\006\020\n\032\0020\tH@¢\006\002\020\r\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003\"\032\020\004\032\b\022\004\022\0020\0010\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\016"}, d2 = {"DefaultResourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "getDefaultResourceReader", "()Lorg/jetbrains/compose/resources/ResourceReader;", "LocalResourceReader", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalResourceReader", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getResourceUri", "", "path", "readResourceBytes", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
/*    */ public final class ResourceReaderKt {
/*    */   @InternalResourceApi
/*    */   @Nullable
/*    */   public static final Object readResourceBytes(@NotNull String path, @NotNull Continuation<? super byte[]> $completion) {
/* 16 */     return DefaultResourceReader.read(path, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @InternalResourceApi
/*    */   @NotNull
/*    */   public static final String getResourceUri(@NotNull String path) {
/* 25 */     Intrinsics.checkNotNullParameter(path, "path"); return DefaultResourceReader.getUri(path);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 35 */   private static final ResourceReader DefaultResourceReader = ResourceReader_desktopKt.getPlatformResourceReader(); @NotNull public static final ResourceReader getDefaultResourceReader() { return DefaultResourceReader; }
/*    */   
/*    */   @NotNull
/* 38 */   private static final ProvidableCompositionLocal<ResourceReader> LocalResourceReader = CompositionLocalKt.staticCompositionLocalOf(ResourceReaderKt$LocalResourceReader$1.INSTANCE); @NotNull public static final ProvidableCompositionLocal<ResourceReader> getLocalResourceReader() { return LocalResourceReader; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ResourceReader;", "invoke"}) static final class ResourceReaderKt$LocalResourceReader$1 extends Lambda implements Function0<ResourceReader> { @NotNull public final ResourceReader invoke() { return ResourceReaderKt.getDefaultResourceReader(); }
/*    */ 
/*    */     
/*    */     public static final ResourceReaderKt$LocalResourceReader$1 INSTANCE = new ResourceReaderKt$LocalResourceReader$1();
/*    */     
/*    */     ResourceReaderKt$LocalResourceReader$1() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceReaderKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */