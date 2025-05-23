/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.coroutines.CoroutineDispatcher;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003¨\006\004"}, d2 = {"FontCacheManagementDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getFontCacheManagementDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ui-text"})
/*    */ public final class DispatcherKt
/*    */ {
/*    */   @NotNull
/* 33 */   private static final CoroutineDispatcher FontCacheManagementDispatcher = (CoroutineDispatcher)Dispatchers.getMain(); @NotNull public static final CoroutineDispatcher getFontCacheManagementDispatcher() { return FontCacheManagementDispatcher; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\DispatcherKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */