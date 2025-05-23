/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\036\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006¨\006\007"}, d2 = {"getFontResourceBytes", "", "environment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "resource", "Lorg/jetbrains/compose/resources/FontResource;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/FontResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
/*    */ public final class FontResourcesKt
/*    */ {
/*    */   @ExperimentalResourceApi
/*    */   @Nullable
/*    */   public static final Object getFontResourceBytes(@NotNull ResourceEnvironment environment, @NotNull FontResource resource, @NotNull Continuation<? super byte[]> $completion) {
/* 50 */     ResourceItem resourceItem = ResourceEnvironmentKt.getResourceItemByEnvironment(resource, environment);
/* 51 */     return ResourceReaderKt.getDefaultResourceReader().read(resourceItem.getPath$library(), $completion);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\FontResourcesKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */