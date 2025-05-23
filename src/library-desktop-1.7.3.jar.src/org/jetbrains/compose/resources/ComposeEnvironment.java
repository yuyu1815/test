package org.jetbrains.compose.resources;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\b`\030\0002\0020\001J\r\020\002\032\0020\003H'¢\006\002\020\004¨\006\005"}, d2 = {"Lorg/jetbrains/compose/resources/ComposeEnvironment;", "", "rememberEnvironment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/compose/resources/ResourceEnvironment;", "library"})
public interface ComposeEnvironment {
  @Composable
  @NotNull
  ResourceEnvironment rememberEnvironment(@Nullable Composer paramComposer, int paramInt);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ComposeEnvironment.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */